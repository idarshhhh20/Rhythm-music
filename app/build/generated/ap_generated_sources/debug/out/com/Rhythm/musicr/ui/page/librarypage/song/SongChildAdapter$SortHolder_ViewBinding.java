// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.librarypage.song;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.librarypage.song.SongChildAdapter;

import java.lang.IllegalStateException;
import java.lang.Override;

public class SongChildAdapter$SortHolder_ViewBinding implements Unbinder {
  private SongChildAdapter.SortHolder target;

  private View view7f0a0273;

  @UiThread
  public SongChildAdapter$SortHolder_ViewBinding(final SongChildAdapter.SortHolder target,
      View source) {
    this.target = target;

    View view;
    target.mSortText = Utils.findRequiredViewAsType(source, R.id.sort_text, "field 'mSortText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.sort_parent, "method 'sortClicked'");
    view7f0a0273 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sortClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SongChildAdapter.SortHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSortText = null;

    view7f0a0273.setOnClickListener(null);
    view7f0a0273 = null;
  }
}
