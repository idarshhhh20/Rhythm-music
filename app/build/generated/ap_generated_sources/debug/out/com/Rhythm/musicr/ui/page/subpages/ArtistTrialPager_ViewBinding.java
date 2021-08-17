// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.subpages;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.subpages.ArtistTrialPager;

import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistTrialPager_ViewBinding implements Unbinder {
  private ArtistTrialPager target;

  @UiThread
  public ArtistTrialPager_ViewBinding(ArtistTrialPager target, View source) {
    this.target = target;

    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.mText = Utils.findRequiredViewAsType(source, R.id.text, "field 'mText'", TextView.class);
    target.mSwipeRefresh = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefresh'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistTrialPager target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImage = null;
    target.mText = null;
    target.mSwipeRefresh = null;
  }
}
