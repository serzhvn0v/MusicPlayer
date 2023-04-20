// Generated by view binder compiler. Do not edit!
package com.harshRajpurohit.musicPlayer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.harshRajpurohit.musicPlayer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final RecyclerView musicRV;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final FragmentContainerView nowPlaying;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final TextView totalSongs;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull RecyclerView musicRV,
      @NonNull NavigationView navView, @NonNull FragmentContainerView nowPlaying,
      @NonNull SwipeRefreshLayout refreshLayout, @NonNull TextView totalSongs) {
    this.rootView = rootView;
    this.musicRV = musicRV;
    this.navView = navView;
    this.nowPlaying = nowPlaying;
    this.refreshLayout = refreshLayout;
    this.totalSongs = totalSongs;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.musicRV;
      RecyclerView musicRV = ViewBindings.findChildViewById(rootView, id);
      if (musicRV == null) {
        break missingId;
      }

      id = R.id.navView;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.nowPlaying;
      FragmentContainerView nowPlaying = ViewBindings.findChildViewById(rootView, id);
      if (nowPlaying == null) {
        break missingId;
      }

      id = R.id.refreshLayout;
      SwipeRefreshLayout refreshLayout = ViewBindings.findChildViewById(rootView, id);
      if (refreshLayout == null) {
        break missingId;
      }

      id = R.id.totalSongs;
      TextView totalSongs = ViewBindings.findChildViewById(rootView, id);
      if (totalSongs == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, musicRV, navView, nowPlaying,
          refreshLayout, totalSongs);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
