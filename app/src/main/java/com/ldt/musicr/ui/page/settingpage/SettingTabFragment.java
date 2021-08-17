package com.ldt.musicr.ui.page.settingpage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.appcompat.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ldt.musicr.App;
import com.ldt.musicr.ui.widget.rangeseekbar.OnRangeChangedListener;
import com.ldt.musicr.ui.widget.rangeseekbar.RangeSeekBar;
import com.ldt.musicr.util.Tool;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.AppActivity;
import com.ldt.musicr.ui.page.MusicServiceNavigationFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class SettingTabFragment extends MusicServiceNavigationFragment implements OnRangeChangedListener {


    @BindView(R.id.status_bar)
    View mStatusBar;

    @BindView(R.id.in_app_volume_seek_bar)
    RangeSeekBar mAppVolumeSeekBar;

    @BindView(R.id.left_right_balance_seek_bar)
    RangeSeekBar mBalanceSeekBar;

    @BindView(R.id.hide_switch)
    SwitchCompat mUseArtistImgAsBg;

    @BindView(R.id.create_now) View mCreateNowView;

    @OnCheckedChanged(R.id.hide_switch)
    void onChangedUseArtistImgAsBg(boolean value) {
        App.getInstance().getPreferencesUtility().setIsUsingArtistImageAsBackground(value);
        if(getActivity() instanceof AppActivity) {
            ((AppActivity)getActivity()).getBackStackController().onUsingArtistImagePreferenceChanged();
        }
    }

    @Nullable
    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.screen_setting_tab,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        mAppVolumeSeekBar.setOnRangeChangedListener(this);
        mBalanceSeekBar.setOnRangeChangedListener(this);
        refreshData();
      onPaletteChanged();

    }

    private boolean mIsEnglish = true;
    private float mCurrentInAppVolume = 1.0f;
    private float mCurrentBalanceValue = 0.5f;

    private void refreshInAppVolume() {
        mCurrentInAppVolume = App.getInstance().getPreferencesUtility().getInAppVolume();
        if(mCurrentInAppVolume>=0) {
            mAppVolumeSeekBar.setValue(100*mCurrentInAppVolume);
        } else {

        }
    }

    private void refreshBalanceValue() {
        mCurrentBalanceValue = App.getInstance().getPreferencesUtility().getBalanceValue();
        if(mCurrentBalanceValue<0) mCurrentBalanceValue =0;
        else if(mCurrentBalanceValue>1) mCurrentBalanceValue = 1;
        mBalanceSeekBar.setValue(100*mCurrentBalanceValue);
    }

    void refreshData() {
        refreshInAppVolume();
        refreshBalanceValue();
        mUseArtistImgAsBg.setChecked(App.getInstance().getPreferencesUtility().isUsingArtistImageAsBackground());

        Context context = getContext();

    }


    @Override
    public void onSetStatusBarMargin(int value) {
        mStatusBar.getLayoutParams().height = value;
    }


    @Override
    public void onPaletteChanged() {
        super.onPaletteChanged();

        int color = Tool.getBaseColor();
        int alpha_color = Color.argb(0x22,Color.red(color),Color.green(color),Color.blue(color));
        int[][] states = new int[][] {
                new int[] {-android.R.attr.state_checked},
                new int[] {android.R.attr.state_checked},
        };

        int[] thumbColors = new int[] {
                0xFF888888,
                color,
        };

        int[] trackColors = new int[] {
                0x22000000,
                alpha_color,
        };

        //  checkBox.setSupportButtonTintList(new ColorStateList(states, thumbColors));
        DrawableCompat.setTintList(DrawableCompat.wrap(mUseArtistImgAsBg.getThumbDrawable()), new ColorStateList(states, thumbColors));
        DrawableCompat.setTintList(DrawableCompat.wrap(mUseArtistImgAsBg.getTrackDrawable()), new ColorStateList(states, trackColors));


        mAppVolumeSeekBar.setProgressColor(color);
        mAppVolumeSeekBar.requestLayout();

        mBalanceSeekBar.setProgressColor(color);
        mBalanceSeekBar.requestLayout();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ((RippleDrawable) mCreateNowView.getBackground()).setColor(ColorStateList.valueOf(color));


        }

    }
    public void setCurrentInAppVolume(float volume) {
        float vol = volume;
        if(vol<0) vol = 0;
        else if(vol>1) vol = 1;
        mCurrentInAppVolume = vol;
        App.getInstance().getPreferencesUtility().setInAppVolume(vol);
    }

    private void setCurrentBalanceValue(float value) {
        float vol = value;
        if(vol<0) vol = 0;
        else if(vol>1) vol = 1;
        mCurrentBalanceValue = vol;
        App.getInstance().getPreferencesUtility().setBalanceValue(vol);
    }


    @Override
    public void onRangeChanged(RangeSeekBar view, float leftValue, float rightValue, boolean isFromUser) {
        if(isFromUser) {
            switch (view.getId()) {
                case R.id.in_app_volume_seek_bar:
                        setCurrentInAppVolume(leftValue / 100);
                    break;
                case R.id.left_right_balance_seek_bar:
                    setCurrentBalanceValue(leftValue/100);
                    break;
            }
        }
    }


    @Override
    public void onStartTrackingTouch(RangeSeekBar view, boolean isLeft) {

    }

    @Override
    public void onStopTrackingTouch(RangeSeekBar view, boolean isLeft) {

    }
}
