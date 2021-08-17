// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.playingqueue;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.playingqueue.PlayingQueueLayerFragment;

import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayingQueueLayerFragment_ViewBinding implements Unbinder {
  private PlayingQueueLayerFragment target;

  private View view7f0a0219;

  private View view7f0a00e6;

  private View view7f0a0265;

  private View view7f0a0234;

  private View view7f0a0230;

  private View view7f0a0160;

  private View view7f0a023f;

  @UiThread
  @SuppressLint("ClickableViewAccessibility")
  public PlayingQueueLayerFragment_ViewBinding(final PlayingQueueLayerFragment target,
      View source) {
    this.target = target;

    View view;
    target.mRootCardView = Utils.findRequiredViewAsType(source, R.id.rootCardView, "field 'mRootCardView'", CardView.class);
    target.mRoot = Utils.findRequiredView(source, R.id.root, "field 'mRoot'");
    target.mDimView = Utils.findRequiredView(source, R.id.dim_view, "field 'mDimView'");
    target.mConstraintRoot = Utils.findRequiredViewAsType(source, R.id.constraint_root, "field 'mConstraintRoot'", ViewGroup.class);
    view = Utils.findRequiredView(source, R.id.playlist_title, "field 'mPlaylistTitle', method 'titlePanelClicked', and method 'touchDetected'");
    target.mPlaylistTitle = Utils.castView(view, R.id.playlist_title, "field 'mPlaylistTitle'", TextView.class);
    view7f0a0219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.titlePanelClicked();
      }
    });
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.touchDetected(p0, p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.down, "field 'mDownIcon', method 'titlePanelClicked', and method 'touchDetected'");
    target.mDownIcon = Utils.castView(view, R.id.down, "field 'mDownIcon'", ImageView.class);
    view7f0a00e6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.titlePanelClicked();
      }
    });
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.touchDetected(p0, p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.shuffle_button, "field 'mShuffleButton' and method 'cycleShuffle'");
    target.mShuffleButton = Utils.castView(view, R.id.shuffle_button, "field 'mShuffleButton'", ImageView.class);
    view7f0a0265 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cycleShuffle();
      }
    });
    view = Utils.findRequiredView(source, R.id.repeat_button, "field 'mRepeatButton' and method 'cycleRepeat'");
    target.mRepeatButton = Utils.castView(view, R.id.repeat_button, "field 'mRepeatButton'", ImageView.class);
    view7f0a0234 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cycleRepeat();
      }
    });
    view = Utils.findRequiredView(source, R.id.recycler_view, "field 'mRecyclerView' and method 'onTouchRecyclerView'");
    target.mRecyclerView = Utils.castView(view, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    view7f0a0230 = view;
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.onTouchRecyclerView(Utils.castParam(p0, "onTouch", 0, "onTouchRecyclerView", 0, RecyclerView.class), p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.lyric, "field 'mLyricView' and method 'showLyric'");
    target.mLyricView = view;
    view7f0a0160 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showLyric();
      }
    });
    view = Utils.findRequiredView(source, R.id.save, "field 'mSaveView' and method 'saveCurrentPlaylist'");
    target.mSaveView = view;
    view7f0a023f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveCurrentPlaylist();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayingQueueLayerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRootCardView = null;
    target.mRoot = null;
    target.mDimView = null;
    target.mConstraintRoot = null;
    target.mPlaylistTitle = null;
    target.mDownIcon = null;
    target.mShuffleButton = null;
    target.mRepeatButton = null;
    target.mRecyclerView = null;
    target.mLyricView = null;
    target.mSaveView = null;

    view7f0a0219.setOnClickListener(null);
    view7f0a0219.setOnTouchListener(null);
    view7f0a0219 = null;
    view7f0a00e6.setOnClickListener(null);
    view7f0a00e6.setOnTouchListener(null);
    view7f0a00e6 = null;
    view7f0a0265.setOnClickListener(null);
    view7f0a0265 = null;
    view7f0a0234.setOnClickListener(null);
    view7f0a0234 = null;
    view7f0a0230.setOnTouchListener(null);
    view7f0a0230 = null;
    view7f0a0160.setOnClickListener(null);
    view7f0a0160 = null;
    view7f0a023f.setOnClickListener(null);
    view7f0a023f = null;
  }
}
