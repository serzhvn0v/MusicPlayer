// Generated by view binder compiler. Do not edit!
package com.harshRajpurohit.musicPlayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.harshRajpurohit.musicPlayer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySelectionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backBtnSA;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final SearchView searchViewSA;

  @NonNull
  public final RecyclerView selectionRV;

  private ActivitySelectionBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backBtnSA, @NonNull LinearLayout linearLayout,
      @NonNull SearchView searchViewSA, @NonNull RecyclerView selectionRV) {
    this.rootView = rootView;
    this.backBtnSA = backBtnSA;
    this.linearLayout = linearLayout;
    this.searchViewSA = searchViewSA;
    this.selectionRV = selectionRV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtnSA;
      ImageButton backBtnSA = ViewBindings.findChildViewById(rootView, id);
      if (backBtnSA == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.searchViewSA;
      SearchView searchViewSA = ViewBindings.findChildViewById(rootView, id);
      if (searchViewSA == null) {
        break missingId;
      }

      id = R.id.selectionRV;
      RecyclerView selectionRV = ViewBindings.findChildViewById(rootView, id);
      if (selectionRV == null) {
        break missingId;
      }

      return new ActivitySelectionBinding((ConstraintLayout) rootView, backBtnSA, linearLayout,
          searchViewSA, selectionRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
