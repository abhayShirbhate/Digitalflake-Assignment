// Generated by data binding compiler. Do not edit!
package com.abhay.practise1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.abhay.practise1.R;
import com.abhay.practise1.listing.viewmodel.ListingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListingBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected ListingViewModel mViewModel;

  protected FragmentListingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable ListingViewModel viewModel);

  @Nullable
  public ListingViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentListingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_listing, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListingBinding>inflateInternal(inflater, R.layout.fragment_listing, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_listing, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListingBinding>inflateInternal(inflater, R.layout.fragment_listing, null, false, component);
  }

  public static FragmentListingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListingBinding)bind(component, view, R.layout.fragment_listing);
  }
}
