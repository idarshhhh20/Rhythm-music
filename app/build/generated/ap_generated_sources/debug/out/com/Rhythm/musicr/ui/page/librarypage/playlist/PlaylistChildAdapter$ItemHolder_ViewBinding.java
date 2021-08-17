// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.librarypage.playlist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.librarypage.playlist.PlaylistChildAdapter;

import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistChildAdapter$ItemHolder_ViewBinding implements Unbinder {
  private PlaylistChildAdapter.ItemHolder target;

  @UiThread
  public PlaylistChildAdapter$ItemHolder_ViewBinding(PlaylistChildAdapter.ItemHolder target,
      View source) {
    this.target = target;

    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.view_over = Utils.findRequiredView(source, R.id.over, "field 'view_over'");
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaylistChildAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTitle = null;
    target.mImage = null;
    target.view_over = null;
  }
}
