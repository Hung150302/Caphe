package com.example.foodorder;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.foodorder.databinding.ActivityFoodDetailBindingImpl;
import com.example.foodorder.databinding.ActivityMainBindingImpl;
import com.example.foodorder.databinding.FragmentCartBindingImpl;
import com.example.foodorder.databinding.FragmentContactBindingImpl;
import com.example.foodorder.databinding.FragmentFeedbackBindingImpl;
import com.example.foodorder.databinding.FragmentHomeBindingImpl;
import com.example.foodorder.databinding.FragmentOrderBindingImpl;
import com.example.foodorder.databinding.ItemCartBindingImpl;
import com.example.foodorder.databinding.ItemContactBindingImpl;
import com.example.foodorder.databinding.ItemFoodGridBindingImpl;
import com.example.foodorder.databinding.ItemFoodPopularBindingImpl;
import com.example.foodorder.databinding.ItemOrderBindingImpl;
import com.example.foodorder.databinding.LayoutBottomSheetCartBindingImpl;
import com.example.foodorder.databinding.LayoutBottomSheetOrderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFOODDETAIL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTCART = 3;

  private static final int LAYOUT_FRAGMENTCONTACT = 4;

  private static final int LAYOUT_FRAGMENTFEEDBACK = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTORDER = 7;

  private static final int LAYOUT_ITEMCART = 8;

  private static final int LAYOUT_ITEMCONTACT = 9;

  private static final int LAYOUT_ITEMFOODGRID = 10;

  private static final int LAYOUT_ITEMFOODPOPULAR = 11;

  private static final int LAYOUT_ITEMORDER = 12;

  private static final int LAYOUT_LAYOUTBOTTOMSHEETCART = 13;

  private static final int LAYOUT_LAYOUTBOTTOMSHEETORDER = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.activity_food_detail, LAYOUT_ACTIVITYFOODDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.fragment_feedback, LAYOUT_FRAGMENTFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.fragment_order, LAYOUT_FRAGMENTORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.item_cart, LAYOUT_ITEMCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.item_contact, LAYOUT_ITEMCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.item_food_grid, LAYOUT_ITEMFOODGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.item_food_popular, LAYOUT_ITEMFOODPOPULAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.item_order, LAYOUT_ITEMORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.layout_bottom_sheet_cart, LAYOUT_LAYOUTBOTTOMSHEETCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foodorder.R.layout.layout_bottom_sheet_order, LAYOUT_LAYOUTBOTTOMSHEETORDER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFOODDETAIL: {
          if ("layout/activity_food_detail_0".equals(tag)) {
            return new ActivityFoodDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_food_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACT: {
          if ("layout/fragment_contact_0".equals(tag)) {
            return new FragmentContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEEDBACK: {
          if ("layout/fragment_feedback_0".equals(tag)) {
            return new FragmentFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDER: {
          if ("layout/fragment_order_0".equals(tag)) {
            return new FragmentOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCART: {
          if ("layout/item_cart_0".equals(tag)) {
            return new ItemCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONTACT: {
          if ("layout/item_contact_0".equals(tag)) {
            return new ItemContactBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_contact is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFOODGRID: {
          if ("layout/item_food_grid_0".equals(tag)) {
            return new ItemFoodGridBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_food_grid is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFOODPOPULAR: {
          if ("layout/item_food_popular_0".equals(tag)) {
            return new ItemFoodPopularBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_food_popular is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDER: {
          if ("layout/item_order_0".equals(tag)) {
            return new ItemOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_order is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTBOTTOMSHEETCART: {
          if ("layout/layout_bottom_sheet_cart_0".equals(tag)) {
            return new LayoutBottomSheetCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_bottom_sheet_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTBOTTOMSHEETORDER: {
          if ("layout/layout_bottom_sheet_order_0".equals(tag)) {
            return new LayoutBottomSheetOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_bottom_sheet_order is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(18);

    static {
      sKeys.put(1, "CartViewModel");
      sKeys.put(2, "ContactModel");
      sKeys.put(3, "ContactViewModel");
      sKeys.put(4, "DialogCartViewModel");
      sKeys.put(5, "DialogOrderViewModel");
      sKeys.put(6, "FeedbackModel");
      sKeys.put(7, "FoodDetailViewModel");
      sKeys.put(8, "FoodModel");
      sKeys.put(9, "HomeViewModel");
      sKeys.put(10, "MainViewModel");
      sKeys.put(11, "OrderModel");
      sKeys.put(12, "OrderViewModel");
      sKeys.put(0, "_all");
      sKeys.put(13, "comment");
      sKeys.put(14, "count");
      sKeys.put(15, "email");
      sKeys.put(16, "name");
      sKeys.put(17, "phone");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_food_detail_0", com.example.foodorder.R.layout.activity_food_detail);
      sKeys.put("layout/activity_main_0", com.example.foodorder.R.layout.activity_main);
      sKeys.put("layout/fragment_cart_0", com.example.foodorder.R.layout.fragment_cart);
      sKeys.put("layout/fragment_contact_0", com.example.foodorder.R.layout.fragment_contact);
      sKeys.put("layout/fragment_feedback_0", com.example.foodorder.R.layout.fragment_feedback);
      sKeys.put("layout/fragment_home_0", com.example.foodorder.R.layout.fragment_home);
      sKeys.put("layout/fragment_order_0", com.example.foodorder.R.layout.fragment_order);
      sKeys.put("layout/item_cart_0", com.example.foodorder.R.layout.item_cart);
      sKeys.put("layout/item_contact_0", com.example.foodorder.R.layout.item_contact);
      sKeys.put("layout/item_food_grid_0", com.example.foodorder.R.layout.item_food_grid);
      sKeys.put("layout/item_food_popular_0", com.example.foodorder.R.layout.item_food_popular);
      sKeys.put("layout/item_order_0", com.example.foodorder.R.layout.item_order);
      sKeys.put("layout/layout_bottom_sheet_cart_0", com.example.foodorder.R.layout.layout_bottom_sheet_cart);
      sKeys.put("layout/layout_bottom_sheet_order_0", com.example.foodorder.R.layout.layout_bottom_sheet_order);
    }
  }
}
