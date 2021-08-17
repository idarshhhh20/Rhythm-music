// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.settingpage;

import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SwitchCompat;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.widget.rangeseekbar.RangeSeekBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingTabFragment_ViewBinding implements Unbinder {
  private SettingTabFragment target;

  private View view7f0a0120;

  @UiThread
  public SettingTabFragment_ViewBinding(final SettingTabFragment target, View source) {
    this.target = target;

    View view;
    target.mStatusBar = Utils.findRequiredView(source, R.id.status_bar, "field 'mStatusBar'");
    target.mAppVolumeSeekBar = Utils.findRequiredViewAsType(source, R.id.in_app_volume_seek_bar, "field 'mAppVolumeSeekBar'", RangeSeekBar.class);
    target.mBalanceSeekBar = Utils.findRequiredViewAsType(source, R.id.left_right_balance_seek_bar, "field 'mBalanceSeekBar'", RangeSeekBar.class);
    view = Utils.findRequiredView(source, R.id.hide_switch, "field 'mUseArtistImgAsBg' and method 'onChangedUseArtistImgAsBg'");
    target.mUseArtistImgAsBg = Utils.castView(view, R.id.hide_switch, "field 'mUseArtistImgAsBg'", SwitchCompat.class);
    view7f0a0120 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onChangedUseArtistImgAsBg(p1);
      }
    });
    target.mCreateNowView = Utils.findRequiredView(source, R.id.create_now, "field 'mCreateNowView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingTabFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusBar = null;
    target.mAppVolumeSeekBar = null;
    target.mBalanceSeekBar = null;
    target.mUseArtistImgAsBg = null;
    target.mCreateNowView = null;

    ((CompoundButton) view7f0a0120).setOnCheckedChangeListener(null);
    view7f0a0120 = null;
  }
}
