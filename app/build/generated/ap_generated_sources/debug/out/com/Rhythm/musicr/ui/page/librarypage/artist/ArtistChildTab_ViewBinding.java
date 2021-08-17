// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.librarypage.artist;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.librarypage.artist.ArtistChildTab;

import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistChildTab_ViewBinding implements Unbinder {
  private ArtistChildTab target;

  @UiThread
  public ArtistChildTab_ViewBinding(ArtistChildTab target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipeRefreshLayout = Utils.findOptionalViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistChildTab target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSwipeRefreshLayout = null;
  }
}
