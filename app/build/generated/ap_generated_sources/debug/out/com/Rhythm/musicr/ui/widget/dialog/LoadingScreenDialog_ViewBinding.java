// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.widget.dialog;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.widget.dialog.LoadingScreenDialog;
import com.ldt.musicr.ui.widget.view.SuccessTickView;
import com.tuyenmonkey.mkloader.MKLoader;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoadingScreenDialog_ViewBinding implements Unbinder {
  private LoadingScreenDialog target;

  @UiThread
  public LoadingScreenDialog_ViewBinding(LoadingScreenDialog target, View source) {
    this.target = target;

    target.mSuccessView = Utils.findRequiredViewAsType(source, R.id.success_view, "field 'mSuccessView'", SuccessTickView.class);
    target.mLoader = Utils.findRequiredViewAsType(source, R.id.mkloader, "field 'mLoader'", MKLoader.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoadingScreenDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSuccessView = null;
    target.mLoader = null;
  }
}
