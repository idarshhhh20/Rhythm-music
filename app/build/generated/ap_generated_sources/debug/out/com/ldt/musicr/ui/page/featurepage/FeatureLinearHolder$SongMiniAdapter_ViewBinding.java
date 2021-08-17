// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.featurepage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FeatureLinearHolder$SongMiniAdapter_ViewBinding implements Unbinder {
  private FeatureLinearHolder.SongMiniAdapter target;

  private View view7f0a0082;

  private View view7f0a0256;

  private View view7f0a0232;

  @UiThread
  public FeatureLinearHolder$SongMiniAdapter_ViewBinding(
      final FeatureLinearHolder.SongMiniAdapter target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.back_top_header, "field 'mHeaderPanel' and method 'seeAll'");
    target.mHeaderPanel = view;
    view7f0a0082 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.seeAll();
      }
    });
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    target.mCount = Utils.findRequiredViewAsType(source, R.id.number, "field 'mCount'", TextView.class);
    target.mRefreshButton = Utils.findRequiredViewAsType(source, R.id.refresh, "field 'mRefreshButton'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.see_all, "method 'seeAll'");
    view7f0a0256 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.seeAll();
      }
    });
    view = Utils.findRequiredView(source, R.id.refresh_front, "method 'refresh'");
    view7f0a0232 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.refresh();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FeatureLinearHolder.SongMiniAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHeaderPanel = null;
    target.mTitle = null;
    target.mRecyclerView = null;
    target.mCount = null;
    target.mRefreshButton = null;

    view7f0a0082.setOnClickListener(null);
    view7f0a0082 = null;
    view7f0a0256.setOnClickListener(null);
    view7f0a0256 = null;
    view7f0a0232.setOnClickListener(null);
    view7f0a0232 = null;
  }
}
