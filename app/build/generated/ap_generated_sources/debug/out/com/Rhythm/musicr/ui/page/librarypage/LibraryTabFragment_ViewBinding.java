// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.librarypage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.librarypage.LibraryTabFragment;

import java.lang.IllegalStateException;
import java.lang.Override;

public class LibraryTabFragment_ViewBinding implements Unbinder {
  private LibraryTabFragment target;

  private View view7f0a0254;

  @UiThread
  public LibraryTabFragment_ViewBinding(final LibraryTabFragment target, View source) {
    this.target = target;

    View view;
    target.mBackImage = Utils.findRequiredViewAsType(source, R.id.back_image, "field 'mBackImage'", ImageView.class);
    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", TabLayout.class);
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.view_pager, "field 'mViewPager'", ViewPager.class);
    target.mStatusView = Utils.findRequiredView(source, R.id.status_bar, "field 'mStatusView'");
    target.mMotionLayout = Utils.findRequiredViewAsType(source, R.id.root, "field 'mMotionLayout'", MotionLayout.class);
    view = Utils.findRequiredView(source, R.id.search_view, "method 'searchLikelyViewClicked'");
    view7f0a0254 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.searchLikelyViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LibraryTabFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBackImage = null;
    target.mTabLayout = null;
    target.mViewPager = null;
    target.mStatusView = null;
    target.mMotionLayout = null;

    view7f0a0254.setOnClickListener(null);
    view7f0a0254 = null;
  }
}
