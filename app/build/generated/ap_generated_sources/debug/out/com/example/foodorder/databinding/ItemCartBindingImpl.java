package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCartBindingImpl extends ItemCartBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_image, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imgFoodCart.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAdd.setTag(null);
        this.tvCount.setTag(null);
        this.tvDelete.setTag(null);
        this.tvFoodNameCart.setTag(null);
        this.tvFoodPriceCart.setTag(null);
        this.tvSubtract.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.foodorder.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.example.foodorder.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
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
        java.lang.String foodModelStringCount = null;
        java.lang.String foodModelName = null;
        com.example.foodorder.model.Food foodModel = mFoodModel;
        java.lang.String foodModelImage = null;
        java.lang.String foodModelStringRealPrice = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodModel != null) {
                    // read FoodModel.stringCount
                    foodModelStringCount = foodModel.getStringCount();
                    // read FoodModel.name
                    foodModelName = foodModel.getName();
                    // read FoodModel.image
                    foodModelImage = foodModel.getImage();
                    // read FoodModel.stringRealPrice
                    foodModelStringRealPrice = foodModel.getStringRealPrice();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foodorder.model.Food.loadImageFromUrl(this.imgFoodCart, foodModelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCount, foodModelStringCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodNameCart, foodModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodPriceCart, foodModelStringRealPrice);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.tvAdd.setOnClickListener(mCallback5);
            this.tvDelete.setOnClickListener(mCallback6);
            this.tvSubtract.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // FoodModel != null
                boolean foodModelJavaLangObjectNull = false;
                // FoodModel
                com.example.foodorder.model.Food foodModel = mFoodModel;



                foodModelJavaLangObjectNull = (foodModel) != (null);
                if (foodModelJavaLangObjectNull) {



                    foodModel.onClickButtonAdd(tvAdd);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // FoodModel != null
                boolean foodModelJavaLangObjectNull = false;
                // FoodModel
                com.example.foodorder.model.Food foodModel = mFoodModel;



                foodModelJavaLangObjectNull = (foodModel) != (null);
                if (foodModelJavaLangObjectNull) {



                    foodModel.onClickButtonDelete(tvDelete);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // FoodModel != null
                boolean foodModelJavaLangObjectNull = false;
                // FoodModel
                com.example.foodorder.model.Food foodModel = mFoodModel;



                foodModelJavaLangObjectNull = (foodModel) != (null);
                if (foodModelJavaLangObjectNull) {



                    foodModel.onClickButtonSubtract(tvSubtract);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): FoodModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}