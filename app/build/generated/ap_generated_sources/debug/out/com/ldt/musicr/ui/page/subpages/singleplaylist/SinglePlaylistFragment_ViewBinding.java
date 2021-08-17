// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.subpages.singleplaylist;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SinglePlaylistFragment_ViewBinding implements Unbinder {
  private SinglePlaylistFragment target;

  private View view7f0a007d;

  @UiThread
  public SinglePlaylistFragment_ViewBinding(final SinglePlaylistFragment target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipeRefresh = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefresh'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.back, "field 'mBackButton' and method 'back'");
    target.mBackButton = view;
    view7f0a007d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SinglePlaylistFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSwipeRefresh = null;
    target.mBackButton = null;

    view7f0a007d.setOnClickListener(null);
    view7f0a007d = null;
  }
}
