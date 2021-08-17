// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.nowplaying;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.widget.avsb.AudioVisualSeekBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NowPlayingLayerFragment_ViewBinding implements Unbinder {
  private NowPlayingLayerFragment target;

  private View view7f0a019d;

  private View view7f0a0219;

  private View view7f0a009c;

  private View view7f0a0225;

  private View view7f0a01e9;

  private View view7f0a0211;

  @UiThread
  public NowPlayingLayerFragment_ViewBinding(final NowPlayingLayerFragment target, View source) {
    this.target = target;

    View view;
    target.mRoot = Utils.findRequiredViewAsType(source, R.id.root, "field 'mRoot'", CardView.class);
    target.mDimView = Utils.findRequiredView(source, R.id.dim_view, "field 'mDimView'");
    target.mMinimizeBar = Utils.findRequiredView(source, R.id.minimize_bar, "field 'mMinimizeBar'");
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.menu_button, "field 'mMenuButton' and method 'more'");
    target.mMenuButton = view;
    view7f0a019d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.more();
      }
    });
    target.mVisualSeekBar = Utils.findRequiredViewAsType(source, R.id.visual_seek_bar, "field 'mVisualSeekBar'", AudioVisualSeekBar.class);
    target.mTimeTextView = Utils.findRequiredViewAsType(source, R.id.time_text_view, "field 'mTimeTextView'", TextView.class);
    target.mBigTitle = Utils.findRequiredViewAsType(source, R.id.big_title, "field 'mBigTitle'", TextView.class);
    target.mBigArtist = Utils.findRequiredViewAsType(source, R.id.big_artist, "field 'mBigArtist'", TextView.class);
    target.mSpacingInsetTop = Utils.findRequiredView(source, R.id.safeViewTop, "field 'mSpacingInsetTop'");
    target.mSpacingInsetBottom = Utils.findRequiredView(source, R.id.safeViewBottom, "field 'mSpacingInsetBottom'");
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.playlist_title, "field 'mPlaylistTitle' and method 'popUpPlayingList'");
    target.mPlaylistTitle = Utils.castView(view, R.id.playlist_title, "field 'mPlaylistTitle'", TextView.class);
    view7f0a0219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.popUpPlayingList();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_right, "field 'mButtonRight' and method 'playOrPause'");
    target.mButtonRight = Utils.castView(view, R.id.button_right, "field 'mButtonRight'", ImageView.class);
    view7f0a009c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playOrPause();
      }
    });
    view = Utils.findRequiredView(source, R.id.prev_button, "field 'mPrevButton' and method 'goToPrevSong'");
    target.mPrevButton = Utils.castView(view, R.id.prev_button, "field 'mPrevButton'", ImageView.class);
    view7f0a0225 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToPrevSong();
      }
    });
    view = Utils.findRequiredView(source, R.id.next_button, "field 'mNextButton' and method 'goToNextSong'");
    target.mNextButton = Utils.castView(view, R.id.next_button, "field 'mNextButton'", ImageView.class);
    view7f0a01e9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToNextSong();
      }
    });
    view = Utils.findRequiredView(source, R.id.play_pause_button, "field 'mPlayPauseButton' and method 'playOrPause'");
    target.mPlayPauseButton = Utils.castView(view, R.id.play_pause_button, "field 'mPlayPauseButton'", ImageView.class);
    view7f0a0211 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playOrPause();
      }
    });
    target.mConstraintRoot = Utils.findRequiredViewAsType(source, R.id.constraint_root, "field 'mConstraintRoot'", MotionLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NowPlayingLayerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRoot = null;
    target.mDimView = null;
    target.mMinimizeBar = null;
    target.mRecyclerView = null;
    target.mMenuButton = null;
    target.mVisualSeekBar = null;
    target.mTimeTextView = null;
    target.mBigTitle = null;
    target.mBigArtist = null;
    target.mSpacingInsetTop = null;
    target.mSpacingInsetBottom = null;
    target.mTitle = null;
    target.mPlaylistTitle = null;
    target.mButtonRight = null;
    target.mPrevButton = null;
    target.mNextButton = null;
    target.mPlayPauseButton = null;
    target.mConstraintRoot = null;

    view7f0a019d.setOnClickListener(null);
    view7f0a019d = null;
    view7f0a0219.setOnClickListener(null);
    view7f0a0219 = null;
    view7f0a009c.setOnClickListener(null);
    view7f0a009c = null;
    view7f0a0225.setOnClickListener(null);
    view7f0a0225 = null;
    view7f0a01e9.setOnClickListener(null);
    view7f0a01e9 = null;
    view7f0a0211.setOnClickListener(null);
    view7f0a0211 = null;
  }
}
