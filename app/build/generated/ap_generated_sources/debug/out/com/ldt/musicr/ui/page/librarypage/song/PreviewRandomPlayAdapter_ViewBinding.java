// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.librarypage.song;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PreviewRandomPlayAdapter_ViewBinding implements Unbinder {
  private PreviewRandomPlayAdapter target;

  private View view7f0a0231;

  @UiThread
  public PreviewRandomPlayAdapter_ViewBinding(final PreviewRandomPlayAdapter target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.refresh, "method 'randommize'");
    view7f0a0231 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.randommize();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f0a0231.setOnClickListener(null);
    view7f0a0231 = null;
  }
}
