// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.nowplaying;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PalettePickerAdapter$ViewHolder_ViewBinding implements Unbinder {
  private PalettePickerAdapter.ViewHolder target;

  private View view7f0a0126;

  @UiThread
  public PalettePickerAdapter$ViewHolder_ViewBinding(final PalettePickerAdapter.ViewHolder target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.icon, "field 'mIcon' and method 'onClickItem'");
    target.mIcon = Utils.castView(view, R.id.icon, "field 'mIcon'", ImageView.class);
    view7f0a0126 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickItem();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PalettePickerAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIcon = null;

    view7f0a0126.setOnClickListener(null);
    view7f0a0126 = null;
  }
}
