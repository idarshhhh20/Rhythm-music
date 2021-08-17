// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.contract;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.contract.AbsSongAdapter;
import com.ldt.musicr.ui.widget.CircularPlayPauseProgressBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AbsSongAdapter$SongHolder_ViewBinding implements Unbinder {
  private AbsSongAdapter.SongHolder target;

  private View view7f0a019d;

  private View view7f0a0226;

  @UiThread
  public AbsSongAdapter$SongHolder_ViewBinding(final AbsSongAdapter.SongHolder target,
      View source) {
    this.target = target;

    View view;
    target.mNumber = Utils.findRequiredViewAsType(source, R.id.number, "field 'mNumber'", TextView.class);
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.description, "field 'mDescription'", TextView.class);
    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.mQuickPlayPause = Utils.findRequiredViewAsType(source, R.id.quick_play_pause, "field 'mQuickPlayPause'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.menu_button, "field 'mMenuButton' and method 'clickMenu'");
    target.mMenuButton = view;
    view7f0a019d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickMenu();
      }
    });
    target.mPanel = Utils.findRequiredView(source, R.id.panel, "field 'mPanel'");
    view = Utils.findRequiredView(source, R.id.preview_button, "field 'mPreviewButton' and method 'clickPresent'");
    target.mPreviewButton = Utils.castView(view, R.id.preview_button, "field 'mPreviewButton'", CircularPlayPauseProgressBar.class);
    view7f0a0226 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickPresent();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsSongAdapter.SongHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNumber = null;
    target.mTitle = null;
    target.mDescription = null;
    target.mImage = null;
    target.mQuickPlayPause = null;
    target.mMenuButton = null;
    target.mPanel = null;
    target.mPreviewButton = null;

    view7f0a019d.setOnClickListener(null);
    view7f0a019d = null;
    view7f0a0226.setOnClickListener(null);
    view7f0a0226 = null;
  }
}
