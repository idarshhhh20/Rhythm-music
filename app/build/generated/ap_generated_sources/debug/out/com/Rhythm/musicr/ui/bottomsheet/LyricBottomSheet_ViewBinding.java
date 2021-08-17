// Generated code from Butter Knife. Do not modify!
package com.Rhythm.musicr.ui.bottomsheet;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ldt.musicr.R;
import com.ldt.musicr.ui.bottomsheet.LyricBottomSheet;

import java.lang.IllegalStateException;
import java.lang.Override;

public class LyricBottomSheet_ViewBinding implements Unbinder {
  private LyricBottomSheet target;

  private View view7f0a00f2;

  private View view7f0a019c;

  private View view7f0a007d;

  private View view7f0a01fd;

  private View view7f0a00c4;

  private View view7f0a023f;

  private View view7f0a00a1;

  @UiThread
  public LyricBottomSheet_ViewBinding(final LyricBottomSheet target, View source) {
    this.target = target;

    View view;
    target.mLyricContent = Utils.findRequiredViewAsType(source, R.id.lyric_content, "field 'mLyricContent'", TextView.class);
    target.mRoot = Utils.findRequiredView(source, R.id.root, "field 'mRoot'");
    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.nested_scroll_view, "field 'mScrollView'", NestedScrollView.class);
    target.mAlignView = Utils.findRequiredView(source, R.id.align_view, "field 'mAlignView'");
    view = Utils.findRequiredView(source, R.id.edit, "field 'mEdit' and method 'edit'");
    target.mEdit = view;
    view7f0a00f2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.edit();
      }
    });
    view = Utils.findRequiredView(source, R.id.menu, "field 'mMenuButton' and method 'playOrPause'");
    target.mMenuButton = Utils.castView(view, R.id.menu, "field 'mMenuButton'", ImageView.class);
    view7f0a019c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playOrPause();
      }
    });
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.description, "field 'mDescription'", TextView.class);
    target.mImageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'mImageView'", ImageView.class);
    target.mLyricConstraintRoot = Utils.findRequiredView(source, R.id.lyric_constraint_root, "field 'mLyricConstraintRoot'");
    target.mEditConstraintRoot = Utils.findRequiredView(source, R.id.edit_constraint_root, "field 'mEditConstraintRoot'");
    target.mEditText = Utils.findRequiredViewAsType(source, R.id.edit_text, "field 'mEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.back, "method 'back'");
    view7f0a007d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
    view = Utils.findRequiredView(source, R.id.parent, "method 'back'");
    view7f0a01fd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
    view = Utils.findRequiredView(source, R.id.copy, "method 'copy'");
    view7f0a00c4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.copy();
      }
    });
    view = Utils.findRequiredView(source, R.id.save, "method 'saveLyric'");
    view7f0a023f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveLyric();
      }
    });
    view = Utils.findRequiredView(source, R.id.cancel, "method 'cancelEditLyric'");
    view7f0a00a1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.cancelEditLyric();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LyricBottomSheet target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLyricContent = null;
    target.mRoot = null;
    target.mScrollView = null;
    target.mAlignView = null;
    target.mEdit = null;
    target.mMenuButton = null;
    target.mTitle = null;
    target.mDescription = null;
    target.mImageView = null;
    target.mLyricConstraintRoot = null;
    target.mEditConstraintRoot = null;
    target.mEditText = null;

    view7f0a00f2.setOnClickListener(null);
    view7f0a00f2 = null;
    view7f0a019c.setOnClickListener(null);
    view7f0a019c = null;
    view7f0a007d.setOnClickListener(null);
    view7f0a007d = null;
    view7f0a01fd.setOnClickListener(null);
    view7f0a01fd = null;
    view7f0a00c4.setOnClickListener(null);
    view7f0a00c4 = null;
    view7f0a023f.setOnClickListener(null);
    view7f0a023f = null;
    view7f0a00a1.setOnClickListener(null);
    view7f0a00a1 = null;
  }
}
