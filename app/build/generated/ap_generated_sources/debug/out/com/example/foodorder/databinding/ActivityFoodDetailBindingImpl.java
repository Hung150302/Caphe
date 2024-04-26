package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFoodDetailBindingImpl extends ActivityFoodDetailBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 10);
        sViewsWithIds.put(R.id.tv_title, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFoodDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityFoodDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.example.foodorder.widget.AspectRatioNoRadiusImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            );
        this.imageFood.setTag(null);
        this.imgBack.setTag(null);
        this.imgCart.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAddToCart.setTag(null);
        this.tvFoodDescription.setTag(null);
        this.tvFoodName.setTag(null);
        this.tvPrice.setTag(null);
        this.tvPriceSale.setTag(null);
        this.tvSaleOff.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.foodorder.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.foodorder.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.FoodDetailViewModel == variableId) {
            setFoodDetailViewModel((com.example.foodorder.viewmodel.FoodDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodDetailViewModel(@Nullable com.example.foodorder.viewmodel.FoodDetailViewModel FoodDetailViewModel) {
        this.mFoodDetailViewModel = FoodDetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.FoodDetailViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFoodDetailViewModelGetStrStatusCartTvAddToCart((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeFoodDetailViewModelIsFoodInCart((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeFoodDetailViewModelMFood((com.example.foodorder.model.Food) object, fieldId);
            case 3 :
                return onChangeFoodDetailViewModelIsSale((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFoodDetailViewModelGetStrStatusCartTvAddToCart(androidx.databinding.ObservableField<java.lang.String> FoodDetailViewModelGetStrStatusCartTvAddToCart, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFoodDetailViewModelIsFoodInCart(androidx.databinding.ObservableBoolean FoodDetailViewModelIsFoodInCart, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFoodDetailViewModelMFood(com.example.foodorder.model.Food FoodDetailViewModelMFood, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFoodDetailViewModelIsSale(androidx.databinding.ObservableBoolean FoodDetailViewModelIsSale, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> foodDetailViewModelGetStrStatusCartTvAddToCart = null;
        boolean foodDetailViewModelIsFoodInCartGet = false;
        androidx.databinding.ObservableBoolean foodDetailViewModelIsFoodInCart = null;
        java.lang.String foodDetailViewModelStrRealPrice = null;
        int foodDetailViewModelIsSaleViewVISIBLEViewGONE = 0;
        java.lang.String foodDetailViewModelGetStrPriceOldTvPrice = null;
        java.lang.String foodDetailViewModelGetStrStatusCartTvAddToCartGet = null;
        com.example.foodorder.model.Food foodDetailViewModelMFood = null;
        androidx.databinding.ObservableBoolean foodDetailViewModelIsSale = null;
        java.lang.String foodDetailViewModelStrSale = null;
        int foodDetailViewModelIsFoodInCartViewGONEViewVISIBLE = 0;
        boolean foodDetailViewModelIsSaleGet = false;
        java.lang.String foodDetailViewModelMFoodDescription = null;
        java.lang.String foodDetailViewModelMFoodBanner = null;
        com.example.foodorder.viewmodel.FoodDetailViewModel foodDetailViewModel = mFoodDetailViewModel;
        java.lang.String foodDetailViewModelMFoodName = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (foodDetailViewModel != null) {
                        // read FoodDetailViewModel.getStrStatusCart(tvAddToCart)
                        foodDetailViewModelGetStrStatusCartTvAddToCart = foodDetailViewModel.getStrStatusCart(tvAddToCart);
                    }
                    updateRegistration(0, foodDetailViewModelGetStrStatusCartTvAddToCart);


                    if (foodDetailViewModelGetStrStatusCartTvAddToCart != null) {
                        // read FoodDetailViewModel.getStrStatusCart(tvAddToCart).get()
                        foodDetailViewModelGetStrStatusCartTvAddToCartGet = foodDetailViewModelGetStrStatusCartTvAddToCart.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (foodDetailViewModel != null) {
                        // read FoodDetailViewModel.isFoodInCart
                        foodDetailViewModelIsFoodInCart = foodDetailViewModel.isFoodInCart;
                    }
                    updateRegistration(1, foodDetailViewModelIsFoodInCart);


                    if (foodDetailViewModelIsFoodInCart != null) {
                        // read FoodDetailViewModel.isFoodInCart.get()
                        foodDetailViewModelIsFoodInCartGet = foodDetailViewModelIsFoodInCart.get();
                    }
                if((dirtyFlags & 0x32L) != 0) {
                    if(foodDetailViewModelIsFoodInCartGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read FoodDetailViewModel.isFoodInCart.get() ? View.GONE : View.VISIBLE
                    foodDetailViewModelIsFoodInCartViewGONEViewVISIBLE = ((foodDetailViewModelIsFoodInCartGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (foodDetailViewModel != null) {
                        // read FoodDetailViewModel.strRealPrice
                        foodDetailViewModelStrRealPrice = foodDetailViewModel.strRealPrice;
                        // read FoodDetailViewModel.getStrPriceOld(tvPrice)
                        foodDetailViewModelGetStrPriceOldTvPrice = foodDetailViewModel.getStrPriceOld(tvPrice);
                        // read FoodDetailViewModel.strSale
                        foodDetailViewModelStrSale = foodDetailViewModel.strSale;
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (foodDetailViewModel != null) {
                        // read FoodDetailViewModel.mFood
                        foodDetailViewModelMFood = foodDetailViewModel.mFood;
                    }
                    updateRegistration(2, foodDetailViewModelMFood);


                    if (foodDetailViewModelMFood != null) {
                        // read FoodDetailViewModel.mFood.description
                        foodDetailViewModelMFoodDescription = foodDetailViewModelMFood.getDescription();
                        // read FoodDetailViewModel.mFood.banner
                        foodDetailViewModelMFoodBanner = foodDetailViewModelMFood.getBanner();
                        // read FoodDetailViewModel.mFood.name
                        foodDetailViewModelMFoodName = foodDetailViewModelMFood.getName();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (foodDetailViewModel != null) {
                        // read FoodDetailViewModel.isSale
                        foodDetailViewModelIsSale = foodDetailViewModel.isSale;
                    }
                    updateRegistration(3, foodDetailViewModelIsSale);


                    if (foodDetailViewModelIsSale != null) {
                        // read FoodDetailViewModel.isSale.get()
                        foodDetailViewModelIsSaleGet = foodDetailViewModelIsSale.get();
                    }
                if((dirtyFlags & 0x38L) != 0) {
                    if(foodDetailViewModelIsSaleGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read FoodDetailViewModel.isSale.get() ? View.VISIBLE : View.GONE
                    foodDetailViewModelIsSaleViewVISIBLEViewGONE = ((foodDetailViewModelIsSaleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.FoodDetailViewModel.loadImageFromUrl(this.imageFood, foodDetailViewModelMFoodBanner);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodDescription, foodDetailViewModelMFoodDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodName, foodDetailViewModelMFoodName);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback1);
            this.imgCart.setOnClickListener(mCallback2);
            this.tvAddToCart.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.imgCart.setVisibility(foodDetailViewModelIsFoodInCartViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddToCart, foodDetailViewModelGetStrStatusCartTvAddToCartGet);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, foodDetailViewModelGetStrPriceOldTvPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPriceSale, foodDetailViewModelStrRealPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSaleOff, foodDetailViewModelStrSale);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.tvPrice.setVisibility(foodDetailViewModelIsSaleViewVISIBLEViewGONE);
            this.tvSaleOff.setVisibility(foodDetailViewModelIsSaleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // FoodDetailViewModel != null
                boolean foodDetailViewModelJavaLangObjectNull = false;
                // FoodDetailViewModel
                com.example.foodorder.viewmodel.FoodDetailViewModel foodDetailViewModel = mFoodDetailViewModel;



                foodDetailViewModelJavaLangObjectNull = (foodDetailViewModel) != (null);
                if (foodDetailViewModelJavaLangObjectNull) {


                    foodDetailViewModel.onClickAddToCart();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // FoodDetailViewModel != null
                boolean foodDetailViewModelJavaLangObjectNull = false;
                // FoodDetailViewModel
                com.example.foodorder.viewmodel.FoodDetailViewModel foodDetailViewModel = mFoodDetailViewModel;



                foodDetailViewModelJavaLangObjectNull = (foodDetailViewModel) != (null);
                if (foodDetailViewModelJavaLangObjectNull) {


                    foodDetailViewModel.onClickAddToCart();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // FoodDetailViewModel != null
                boolean foodDetailViewModelJavaLangObjectNull = false;
                // FoodDetailViewModel
                com.example.foodorder.viewmodel.FoodDetailViewModel foodDetailViewModel = mFoodDetailViewModel;



                foodDetailViewModelJavaLangObjectNull = (foodDetailViewModel) != (null);
                if (foodDetailViewModelJavaLangObjectNull) {


                    foodDetailViewModel.onClickButtonBack();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): FoodDetailViewModel.getStrStatusCart(tvAddToCart)
        flag 1 (0x2L): FoodDetailViewModel.isFoodInCart
        flag 2 (0x3L): FoodDetailViewModel.mFood
        flag 3 (0x4L): FoodDetailViewModel.isSale
        flag 4 (0x5L): FoodDetailViewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): FoodDetailViewModel.isSale.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): FoodDetailViewModel.isSale.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): FoodDetailViewModel.isFoodInCart.get() ? View.GONE : View.VISIBLE
        flag 9 (0xaL): FoodDetailViewModel.isFoodInCart.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}