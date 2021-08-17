// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.librarypage.genre;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.ldt.musicr.R;
import java.lang.Deprecated;
import java.lang.Override;

public class GenreChildTab_ViewBinding implements Unbinder {
  /**
   * @deprecated Use {@link #GenreChildTab_ViewBinding(GenreChildTab, Context)} for direct creation.
   *     Only present for runtime invocation through {@code ButterKnife.bind()}.
   */
  @Deprecated
  @UiThread
  public GenreChildTab_ViewBinding(GenreChildTab target, View source) {
    this(target, source.getContext());
  }

  @UiThread
  public GenreChildTab_ViewBinding(GenreChildTab target, Context context) {
    Resources res = context.getResources();
    target.mMinBottomPadding = res.getDimension(R.dimen.bottom_back_stack_spacing);
    target.m16Dp = res.getDimension(R.dimen._16dp);
  }

  @Override
  @CallSuper
  public void unbind() {
  }
}
