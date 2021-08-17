// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.featurepage;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.featurepage.FeatureTabFragment;

import java.lang.IllegalStateException;
import java.lang.Override;

public class FeatureTabFragment_ViewBinding implements Unbinder {
  private FeatureTabFragment target;

  @UiThread
  public FeatureTabFragment_ViewBinding(FeatureTabFragment target, View source) {
    this.target = target;

    target.mStatusView = Utils.findRequiredView(source, R.id.status_bar, "field 'mStatusView'");
    target.mSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
    target.mNestedScrollView = Utils.findRequiredViewAsType(source, R.id.scroll_view, "field 'mNestedScrollView'", NestedScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeatureTabFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusView = null;
    target.mSwipeRefreshLayout = null;
    target.mNestedScrollView = null;
  }
}
