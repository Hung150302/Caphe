// Generated by data binding compiler. Do not edit!
package com.example.foodorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodorder.R;
import com.example.foodorder.viewmodel.OrderViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOrderBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rcvOrder;

  @Bindable
  protected OrderViewModel mOrderViewModel;

  protected FragmentOrderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rcvOrder) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rcvOrder = rcvOrder;
  }

  public abstract void setOrderViewModel(@Nullable OrderViewModel OrderViewModel);

  @Nullable
  public OrderViewModel getOrderViewModel() {
    return mOrderViewModel;
  }

  @NonNull
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_order, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOrderBinding>inflateInternal(inflater, R.layout.fragment_order, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_order, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOrderBinding>inflateInternal(inflater, R.layout.fragment_order, null, false, component);
  }

  public static FragmentOrderBinding bind(@NonNull View view) {
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
  public static FragmentOrderBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOrderBinding)bind(component, view, R.layout.fragment_order);
  }
}
