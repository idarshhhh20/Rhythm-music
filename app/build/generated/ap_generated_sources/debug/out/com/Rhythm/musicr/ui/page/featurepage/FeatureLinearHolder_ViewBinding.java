// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.page.featurepage;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.page.featurepage.FeatureLinearHolder;

import java.lang.IllegalStateException;
import java.lang.Override;

public class FeatureLinearHolder_ViewBinding implements Unbinder {
  private FeatureLinearHolder target;

  @UiThread
  public FeatureLinearHolder_ViewBinding(FeatureLinearHolder target, View source) {
    this.target = target;

    target.mPlayListFrame = Utils.findRequiredViewAsType(source, R.id.playlist_frame, "field 'mPlayListFrame'", ViewGroup.class);
    target.mSongFrame = Utils.findRequiredViewAsType(source, R.id.song_frame, "field 'mSongFrame'", ViewGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeatureLinearHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPlayListFrame = null;
    target.mSongFrame = null;
  }
}
