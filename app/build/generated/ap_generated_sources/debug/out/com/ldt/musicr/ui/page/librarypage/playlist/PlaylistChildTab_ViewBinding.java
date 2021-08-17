// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.librarypage.playlist;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistChildTab_ViewBinding implements Unbinder {
  private PlaylistChildTab target;

  @UiThread
  public PlaylistChildTab_ViewBinding(PlaylistChildTab target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaylistChildTab target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
