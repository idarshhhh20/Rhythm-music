// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.nowplaying;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NowPlayingAdapter$ItemHolder_ViewBinding implements Unbinder {
  private NowPlayingAdapter.ItemHolder target;

  @UiThread
  public NowPlayingAdapter$ItemHolder_ViewBinding(NowPlayingAdapter.ItemHolder target,
      View source) {
    this.target = target;

    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NowPlayingAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImage = null;
  }
}
