package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFoodPopularBindingImpl extends ItemFoodPopularBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mFoodModelGoToFoodDetailAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemFoodPopularBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemFoodPopularBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.example.foodorder.widget.AspectRatioNoRadiusImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageFood.setTag(null);
        this.layoutItem.setTag(null);
        this.tvSaleOff.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.FoodModel == variableId) {
            setFoodModel((com.example.foodorder.model.Food) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodModel(@Nullable com.example.foodorder.model.Food FoodModel) {
        updateRegistration(0, FoodModel);
        this.mFoodModel = FoodModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.FoodModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFoodModel((com.example.foodorder.model.Food) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFoodModel(com.example.foodorder.model.Food FoodModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        int foodModelIsSaleOffViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener foodModelGoToFoodDetailAndroidViewViewOnClickListener = null;
        java.lang.String foodModelGetStringSaleTvSaleOff = null;
        com.example.foodorder.model.Food foodModel = mFoodModel;
        boolean foodModelIsSaleOff = false;
        java.lang.String foodModelBanner = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodModel != null) {
                    // read FoodModel::goToFoodDetail
                    foodModelGoToFoodDetailAndroidViewViewOnClickListener = (((mFoodModelGoToFoodDetailAndroidViewViewOnClickListener == null) ? (mFoodModelGoToFoodDetailAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFoodModelGoToFoodDetailAndroidViewViewOnClickListener).setValue(foodModel));
                    // read FoodModel.getStringSale(tvSaleOff)
                    foodModelGetStringSaleTvSaleOff = foodModel.getStringSale(tvSaleOff);
                    // read FoodModel.isSaleOff
                    foodModelIsSaleOff = foodModel.isSaleOff();
                    // read FoodModel.banner
                    foodModelBanner = foodModel.getBanner();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(foodModelIsSaleOff) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read FoodModel.isSaleOff ? View.VISIBLE : View.GONE
                foodModelIsSaleOffViewVISIBLEViewGONE = ((foodModelIsSaleOff) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foodorder.model.Food.loadImageBannerFromUrl(this.imageFood, foodModelBanner);
            this.layoutItem.setOnClickListener(foodModelGoToFoodDetailAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSaleOff, foodModelGetStringSaleTvSaleOff);
            this.tvSaleOff.setVisibility(foodModelIsSaleOffViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.foodorder.model.Food value;
        public OnClickListenerImpl setValue(com.example.foodorder.model.Food value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.goToFoodDetail(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): FoodModel
        flag 1 (0x2L): null
        flag 2 (0x3L): FoodModel.isSaleOff ? View.VISIBLE : View.GONE
        flag 3 (0x4L): FoodModel.isSaleOff ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}