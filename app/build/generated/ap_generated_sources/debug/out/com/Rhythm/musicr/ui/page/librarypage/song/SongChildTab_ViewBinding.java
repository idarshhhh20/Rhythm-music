// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.librarypage.song;

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
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.librarypage.song.SongChildTab;

import java.lang.IllegalStateException;
import java.lang.Override;

public class SongChildTab_ViewBinding implements Unbinder {
  private SongChildTab target;

  private View view7f0a0231;

  private View view7f0a0227;

  @UiThread
  public SongChildTab_ViewBinding(final SongChildTab target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.refresh, "field 'mRefresh' and method 'refresh'");
    target.mRefresh = Utils.castView(view, R.id.refresh, "field 'mRefresh'", ImageView.class);
    view7f0a0231 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.refresh();
      }
    });
    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mArtist = Utils.findRequiredViewAsType(source, R.id.description, "field 'mArtist'", TextView.class);
    target.mRandomGroup = Utils.findRequiredViewAsType(source, R.id.random_group, "field 'mRandomGroup'", Group.class);
    view = Utils.findRequiredView(source, R.id.preview_random_panel, "method 'shuffle'");
    view7f0a0227 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shuffle();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SongChildTab target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mRefresh = null;
    target.mImage = null;
    target.mTitle = null;
    target.mArtist = null;
    target.mRandomGroup = null;

    view7f0a0231.setOnClickListener(null);
    view7f0a0231 = null;
    view7f0a0227.setOnClickListener(null);
    view7f0a0227 = null;
  }
}
