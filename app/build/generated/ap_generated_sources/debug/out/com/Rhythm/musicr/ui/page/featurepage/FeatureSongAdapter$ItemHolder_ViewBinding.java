// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.featurepage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.featurepage.FeatureSongAdapter;

import java.lang.IllegalStateException;
import java.lang.Override;

public class FeatureSongAdapter$ItemHolder_ViewBinding implements Unbinder {
  private FeatureSongAdapter.ItemHolder target;

  private View view7f0a022a;

  @UiThread
  public FeatureSongAdapter$ItemHolder_ViewBinding(final FeatureSongAdapter.ItemHolder target,
      View source) {
    this.target = target;

    View view;
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.description, "field 'mDescription'", TextView.class);
    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.mMenuButton = Utils.findRequiredView(source, R.id.menu_button, "field 'mMenuButton'");
    view = Utils.findRequiredView(source, R.id.quick_play_pause, "field 'mQuickPlayPause' and method 'clickQuickPlayPause'");
    target.mQuickPlayPause = Utils.castView(view, R.id.quick_play_pause, "field 'mQuickPlayPause'", ImageView.class);
    view7f0a022a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickQuickPlayPause();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FeatureSongAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTitle = null;
    target.mDescription = null;
    target.mImage = null;
    target.mMenuButton = null;
    target.mQuickPlayPause = null;

    view7f0a022a.setOnClickListener(null);
    view7f0a022a = null;
  }
}
