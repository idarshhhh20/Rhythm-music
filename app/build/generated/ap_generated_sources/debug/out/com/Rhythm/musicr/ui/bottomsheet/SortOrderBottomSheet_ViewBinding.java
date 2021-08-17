// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.bottomsheet;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.bottomsheet.SortOrderBottomSheet;

import java.lang.IllegalStateException;
import java.lang.Override;

public class SortOrderBottomSheet_ViewBinding implements Unbinder {
  private SortOrderBottomSheet target;

  private View view7f0a009f;

  private View view7f0a0151;

  private View view7f0a01ba;

  private View view7f0a0075;

  private View view7f0a00d4;

  @UiThread
  public SortOrderBottomSheet_ViewBinding(final SortOrderBottomSheet target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.by_title_text, "method 'onSortTextClick'");
    view7f0a009f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSortTextClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.last_added_text, "method 'onSortTextClick'");
    view7f0a0151 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSortTextClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.most_played_text, "method 'onSortTextClick'");
    view7f0a01ba = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSortTextClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.asc_text, "method 'onOrderTextClick'");
    view7f0a0075 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOrderTextClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.desc_text, "method 'onOrderTextClick'");
    view7f0a00d4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOrderTextClick(p0);
      }
    });
    target.mSortTextViews = Utils.arrayFilteringNull(
        Utils.findRequiredView(source, R.id.by_title_text, "field 'mSortTextViews'"), 
        Utils.findRequiredView(source, R.id.last_added_text, "field 'mSortTextViews'"), 
        Utils.findRequiredView(source, R.id.most_played_text, "field 'mSortTextViews'"));
    target.mSortTicks = Utils.arrayFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.by_title_tick, "field 'mSortTicks'", ImageView.class), 
        Utils.findRequiredViewAsType(source, R.id.by_time_tick, "field 'mSortTicks'", ImageView.class), 
        Utils.findRequiredViewAsType(source, R.id.most_played_tick, "field 'mSortTicks'", ImageView.class));
    target.mOrderTextViews = Utils.arrayFilteringNull(
        Utils.findRequiredView(source, R.id.asc_text, "field 'mOrderTextViews'"), 
        Utils.findRequiredView(source, R.id.desc_text, "field 'mOrderTextViews'"));
    target.mOrderTicks = Utils.arrayFilteringNull(
        Utils.findRequiredViewAsType(source, R.id.asc_tick, "field 'mOrderTicks'", ImageView.class), 
        Utils.findRequiredViewAsType(source, R.id.desc_tick, "field 'mOrderTicks'", ImageView.class));
  }

  @Override
  @CallSuper
  public void unbind() {
    SortOrderBottomSheet target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSortTextViews = null;
    target.mSortTicks = null;
    target.mOrderTextViews = null;
    target.mOrderTicks = null;

    view7f0a009f.setOnClickListener(null);
    view7f0a009f = null;
    view7f0a0151.setOnClickListener(null);
    view7f0a0151 = null;
    view7f0a01ba.setOnClickListener(null);
    view7f0a01ba = null;
    view7f0a0075.setOnClickListener(null);
    view7f0a0075 = null;
    view7f0a00d4.setOnClickListener(null);
    view7f0a00d4 = null;
  }
}
