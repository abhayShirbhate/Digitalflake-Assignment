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
import com.abhay.practise1.R;
import com.abhay.practise1.login.listener.IOnLoginFragmentHandler;
import com.abhay.practise1.login.viewmodel.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @Bindable
  protected LoginViewModel mViewModel;

  @Bindable
  protected IOnLoginFragmentHandler mIOnHandler;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable LoginViewModel viewModel);

  @Nullable
  public LoginViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setIOnHandler(@Nullable IOnLoginFragmentHandler iOnHandler);

  @Nullable
  public IOnLoginFragmentHandler getIOnHandler() {
    return mIOnHandler;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}