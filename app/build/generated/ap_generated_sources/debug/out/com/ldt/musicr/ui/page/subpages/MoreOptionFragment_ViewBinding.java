// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.subpages;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoreOptionFragment_ViewBinding implements Unbinder {
  private MoreOptionFragment target;

  private View view7f0a007e;

  private View view7f0a009a;

  @UiThread
  public MoreOptionFragment_ViewBinding(final MoreOptionFragment target, View source) {
    this.target = target;

    View view;
    target.mStatusBar = Utils.findRequiredView(source, R.id.status_bar, "field 'mStatusBar'");
    target.mRoot = Utils.findRequiredView(source, R.id.root, "field 'mRoot'");
    view = Utils.findRequiredView(source, R.id.back_button, "method 'back'");
    view7f0a007e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_one, "method 'ButtonOneClick'");
    view7f0a009a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.ButtonOneClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MoreOptionFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mStatusBar = null;
    target.mRoot = null;

    view7f0a007e.setOnClickListener(null);
    view7f0a007e = null;
    view7f0a009a.setOnClickListener(null);
    view7f0a009a = null;
  }
}
