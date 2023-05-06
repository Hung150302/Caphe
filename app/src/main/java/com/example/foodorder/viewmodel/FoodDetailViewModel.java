package com.example.foodorder.viewmodel;

import android.app.Activity;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.example.foodorder.R;
import com.example.foodorder.constant.Constant;
import com.example.foodorder.database.FoodDatabase;
import com.example.foodorder.databinding.LayoutBottomSheetCartBinding;
import com.example.foodorder.event.ReloadListCartEvent;
import com.example.foodorder.model.Food;
import com.example.foodorder.utils.GlideUtils;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

public class FoodDetailViewModel {

    private Activity mActivity;
    private DialogCartViewModel mDialogCartViewModel;
    public Food mFood;
    public ObservableBoolean isSale = new ObservableBoolean();
    public ObservableBoolean isMoreImages = new ObservableBoolean();
    public ObservableBoolean isFoodInCart = new ObservableBoolean();
    public String strSale, strPriceOld, strRealPrice;
    public ObservableField<String> strStatusCart = new ObservableField<>();

    public FoodDetailViewModel(Activity mActivity, Food mFood) {
        this.mActivity = mActivity;
        this.mFood = mFood;
        initData();
    }

    public void initData() {
        if (mFood == null) {
            return;
        }

        if (mFood.getSale() <= 0) {
            isSale.set(false);
            strRealPrice = mFood.getPrice() + Constant.CURRENCY;
        } else {
            isSale.set(true);
            strSale = mActivity.getString(R.string.label_discount) + " " + mFood.getSale() + "%";
            strPriceOld = mFood.getPrice() + Constant.CURRENCY;
            strRealPrice = mFood.getRealPrice() + Constant.CURRENCY;
        }

        if (isFoodInCart(mFood.getId())) {
            isFoodInCart.set(true);
            strStatusCart.set(mActivity.getString(R.string.added_to_cart));
        } else {
            isFoodInCart.set(false);
            strStatusCart.set(mActivity.getString(R.string.add_to_cart));
        }
    }

    public ObservableField<String> getStrStatusCart(TextView textView) {
        if (isFoodInCart.get()) {
            textView.setBackgroundResource(R.drawable.bg_gray_shape_corner_6);
            textView.setTextColor(ContextCompat.getColor(mActivity, R.color.textColorPrimary));
        } else {
            textView.setBackgroundResource(R.drawable.bg_green_shape_corner_6);
            textView.setTextColor(ContextCompat.getColor(mActivity, R.color.white));
        }
        return strStatusCart;
    }

    public String getStrPriceOld(TextView textView) {
        textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        return strPriceOld;
    }

    public void onClickButtonBack() {
        mActivity.onBackPressed();
    }

    @BindingAdapter({"url_image"})
    public static void loadImageFromUrl(ImageView imageView, String url) {
        GlideUtils.loadUrlBanner(url, imageView);
    }



    public boolean isFoodInCart(int foodId) {
        List<Food> list = FoodDatabase.getInstance(mActivity).foodDAO().checkFoodInCart(foodId);
        return list != null && !list.isEmpty();
    }

    public void onClickAddToCart() {
        if (isFoodInCart.get()) {
            return;
        }

        LayoutBottomSheetCartBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mActivity),
                R.layout. layout_bottom_sheet_cart, null, false);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(mActivity);
        bottomSheetDialog.setContentView(binding.getRoot());

        mDialogCartViewModel = new DialogCartViewModel(mActivity, bottomSheetDialog, mFood, () -> {
                    bottomSheetDialog.dismiss();
                    isFoodInCart.set(true);
                    strStatusCart.set(mActivity.getString(R.string.added_to_cart));
                    EventBus.getDefault().post(new ReloadListCartEvent());
                });
        binding.setDialogCartViewModel(mDialogCartViewModel);

        bottomSheetDialog.show();
    }

    public void release() {
        mActivity = null;
        if (mDialogCartViewModel != null) {
            mDialogCartViewModel.release();
        }
    }
}
