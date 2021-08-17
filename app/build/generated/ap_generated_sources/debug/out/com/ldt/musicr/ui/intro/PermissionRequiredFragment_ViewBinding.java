// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.intro;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PermissionRequiredFragment_ViewBinding implements Unbinder {
  private PermissionRequiredFragment target;

  private View view7f0a006a;

  @UiThread
  public PermissionRequiredFragment_ViewBinding(final PermissionRequiredFragment target,
      View source) {
    this.target = target;

    View view;
    target.mSwipeRefresh = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefresh'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.allow_button, "field 'mAllowButton' and method 'allowAccess'");
    target.mAllowButton = view;
    view7f0a006a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.allowAccess();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PermissionRequiredFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSwipeRefresh = null;
    target.mAllowButton = null;

    view7f0a006a.setOnClickListener(null);
    view7f0a006a = null;
  }
}
