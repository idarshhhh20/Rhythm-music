// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.subpages;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.github.chrisbanes.photoview.PhotoView;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistPagerFragment_ViewBinding implements Unbinder {
  private ArtistPagerFragment target;

  private View view7f0a010b;

  private View view7f0a0226;

  private View view7f0a007d;

  private View view7f0a020a;

  private View view7f0a008d;

  @UiThread
  @SuppressLint("ClickableViewAccessibility")
  public ArtistPagerFragment_ViewBinding(final ArtistPagerFragment target, View source) {
    this.target = target;

    View view;
    target.mStatusBar = Utils.findRequiredView(source, R.id.status_bar, "field 'mStatusBar'");
    target.mRoot = Utils.findRequiredView(source, R.id.root, "field 'mRoot'");
    target.mArtistText = Utils.findRequiredViewAsType(source, R.id.title, "field 'mArtistText'", TextView.class);
    target.mBigImage = Utils.findRequiredViewAsType(source, R.id.big_image, "field 'mBigImage'", PhotoView.class);
    target.mGroup = Utils.findRequiredViewAsType(source, R.id.group, "field 'mGroup'", Group.class);
    target.mWiki = Utils.findRequiredViewAsType(source, R.id.description, "field 'mWiki'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fullscreen, "field 'mFullScreenButton' and method 'fullScreen'");
    target.mFullScreenButton = Utils.castView(view, R.id.fullscreen, "field 'mFullScreenButton'", ImageView.class);
    view7f0a010b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fullScreen();
      }
    });
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.preview_button, "method 'previewAllSong'");
    view7f0a0226 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.previewAllSong();
      }
    });
    view = Utils.findRequiredView(source, R.id.back, "method 'goBack'");
    view7f0a007d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.play, "method 'shuffle'");
    view7f0a020a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shuffle();
      }
    });
    view = Utils.findRequiredView(source, R.id.big_behind, "method 'onTouchBigBehind'");
    view7f0a008d = view;
    view.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View p0, MotionEvent p1) {
        return target.onTouchBigBehind(p0, p1);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistPagerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusBar = null;
    target.mRoot = null;
    target.mArtistText = null;
    target.mBigImage = null;
    target.mGroup = null;
    target.mWiki = null;
    target.mFullScreenButton = null;
    target.mRecyclerView = null;

    view7f0a010b.setOnClickListener(null);
    view7f0a010b = null;
    view7f0a0226.setOnClickListener(null);
    view7f0a0226 = null;
    view7f0a007d.setOnClickListener(null);
    view7f0a007d = null;
    view7f0a020a.setOnClickListener(null);
    view7f0a020a = null;
    view7f0a008d.setOnTouchListener(null);
    view7f0a008d = null;
  }
}
