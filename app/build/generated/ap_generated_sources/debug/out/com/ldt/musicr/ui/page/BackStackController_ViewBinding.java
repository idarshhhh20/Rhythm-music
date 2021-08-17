// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BackStackController_ViewBinding implements Unbinder {
  private BackStackController target;

  @UiThread
  public BackStackController_ViewBinding(BackStackController target, View source) {
    this.target = target;

    target.mRoot = Utils.findRequiredViewAsType(source, R.id.root, "field 'mRoot'", CardView.class);
    target.mDimView = Utils.findRequiredView(source, R.id.dim_view, "field 'mDimView'");
    target.mBackImageView = Utils.findRequiredViewAsType(source, R.id.back_image, "field 'mBackImageView'", ImageView.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BackStackController target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRoot = null;
    target.mDimView = null;
    target.mBackImageView = null;
    target.mViewPager = null;
  }
}
