// Generated code from Butter Knife. Do not modify!
package com.ldt.musicr.ui.page.librarypage.artist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistAdapter$ItemHolder_ViewBinding implements Unbinder {
  private ArtistAdapter.ItemHolder target;

  private View view7f0a01fa;

  @UiThread
  public ArtistAdapter$ItemHolder_ViewBinding(final ArtistAdapter.ItemHolder target, View source) {
    this.target = target;

    View view;
    target.mArtist = Utils.findRequiredViewAsType(source, R.id.title, "field 'mArtist'", TextView.class);
    target.mImage = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImage'", ImageView.class);
    target.mGenreOne = Utils.findRequiredViewAsType(source, R.id.genre_one, "field 'mGenreOne'", TextView.class);
    target.mGenreTwo = Utils.findRequiredViewAsType(source, R.id.genre_two, "field 'mGenreTwo'", TextView.class);
    view = Utils.findRequiredView(source, R.id.panel, "field 'mPanel', method 'goToThisArtist', and method 'onLongClickPanel'");
    target.mPanel = view;
    view7f0a01fa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToThisArtist();
      }
    });
    view.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View p0) {
        return target.onLongClickPanel();
      }
    });
    target.mPanelColor = Utils.findRequiredView(source, R.id.panel_color, "field 'mPanelColor'");
    target.mRoot = Utils.findRequiredView(source, R.id.root, "field 'mRoot'");
    target.mCount = Utils.findRequiredViewAsType(source, R.id.count, "field 'mCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArtistAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mArtist = null;
    target.mImage = null;
    target.mGenreOne = null;
    target.mGenreTwo = null;
    target.mPanel = null;
    target.mPanelColor = null;
    target.mRoot = null;
    target.mCount = null;

    view7f0a01fa.setOnClickListener(null);
    view7f0a01fa.setOnLongClickListener(null);
    view7f0a01fa = null;
  }
}
