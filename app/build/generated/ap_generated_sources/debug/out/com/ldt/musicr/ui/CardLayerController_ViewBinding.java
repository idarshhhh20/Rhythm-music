// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CardLayerController_ViewBinding implements Unbinder {
  private CardLayerController target;

  @UiThread
  public CardLayerController_ViewBinding(CardLayerController target, View source) {
    this.target = target;

    target.mChildLayerContainer = Utils.findRequiredViewAsType(source, R.id.child_layer_container, "field 'mChildLayerContainer'", FrameLayout.class);
    target.mBottomNavigationView = Utils.findRequiredViewAsType(source, R.id.bottom_navigation_view, "field 'mBottomNavigationView'", BottomNavigationView.class);
    target.mBottomNavigationParent = Utils.findRequiredView(source, R.id.bottom_navigation_parent, "field 'mBottomNavigationParent'");
  }

  @Override
  @CallSuper
  public void unbind() {
    CardLayerController target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChildLayerContainer = null;
    target.mBottomNavigationView = null;
    target.mBottomNavigationParent = null;
  }
}
