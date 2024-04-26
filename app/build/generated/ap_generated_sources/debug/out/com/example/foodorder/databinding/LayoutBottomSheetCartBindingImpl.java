package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutBottomSheetCartBindingImpl extends LayoutBottomSheetCartBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_infor, 8);
        sViewsWithIds.put(R.id.layout_image, 9);
        sViewsWithIds.put(R.id.tvCount, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutBottomSheetCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private LayoutBottomSheetCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imgFoodCart.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAdd.setTag(null);
        this.tvAddCart.setTag(null);
        this.tvCancel.setTag(null);
        this.tvFoodNameCart.setTag(null);
        this.tvFoodPriceCart.setTag(null);
        this.tvSubtract.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.example.foodorder.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.example.foodorder.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
        mCallback11 = new com.example.foodorder.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.DialogCartViewModel == variableId) {
            setDialogCartViewModel((com.example.foodorder.viewmodel.DialogCartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDialogCartViewModel(@Nullable com.example.foodorder.viewmodel.DialogCartViewModel DialogCartViewModel) {
        this.mDialogCartViewModel = DialogCartViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.DialogCartViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogCartViewModelMFood((com.example.foodorder.model.Food) object, fieldId);
            case 1 :
                return onChangeDialogCartViewModelStrTotalPrice((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogCartViewModelMFood(com.example.foodorder.model.Food DialogCartViewModelMFood, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDialogCartViewModelStrTotalPrice(androidx.databinding.ObservableField<java.lang.String> DialogCartViewModelStrTotalPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.example.foodorder.model.Food dialogCartViewModelMFood = null;
        java.lang.String dialogCartViewModelMFoodName = null;
        com.example.foodorder.viewmodel.DialogCartViewModel dialogCartViewModel = mDialogCartViewModel;
        androidx.databinding.ObservableField<java.lang.String> dialogCartViewModelStrTotalPrice = null;
        java.lang.String dialogCartViewModelMFoodImage = null;
        java.lang.String dialogCartViewModelStrTotalPriceGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (dialogCartViewModel != null) {
                        // read DialogCartViewModel.mFood
                        dialogCartViewModelMFood = dialogCartViewModel.mFood;
                    }
                    updateRegistration(0, dialogCartViewModelMFood);


                    if (dialogCartViewModelMFood != null) {
                        // read DialogCartViewModel.mFood.name
                        dialogCartViewModelMFoodName = dialogCartViewModelMFood.getName();
                        // read DialogCartViewModel.mFood.image
                        dialogCartViewModelMFoodImage = dialogCartViewModelMFood.getImage();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (dialogCartViewModel != null) {
                        // read DialogCartViewModel.strTotalPrice
                        dialogCartViewModelStrTotalPrice = dialogCartViewModel.strTotalPrice;
                    }
                    updateRegistration(1, dialogCartViewModelStrTotalPrice);


                    if (dialogCartViewModelStrTotalPrice != null) {
                        // read DialogCartViewModel.strTotalPrice.get()
                        dialogCartViewModelStrTotalPriceGet = dialogCartViewModelStrTotalPrice.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.FoodDetailViewModel.loadImageFromUrl(this.imgFoodCart, dialogCartViewModelMFoodImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodNameCart, dialogCartViewModelMFoodName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tvAdd.setOnClickListener(mCallback11);
            this.tvAddCart.setOnClickListener(mCallback13);
            this.tvCancel.setOnClickListener(mCallback12);
            this.tvSubtract.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodPriceCart, dialogCartViewModelStrTotalPriceGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // DialogCartViewModel != null
                boolean dialogCartViewModelJavaLangObjectNull = false;
                // DialogCartViewModel
                com.example.foodorder.viewmodel.DialogCartViewModel dialogCartViewModel = mDialogCartViewModel;



                dialogCartViewModelJavaLangObjectNull = (dialogCartViewModel) != (null);
                if (dialogCartViewModelJavaLangObjectNull) {


                    dialogCartViewModel.onClickCancel();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // DialogCartViewModel != null
                boolean dialogCartViewModelJavaLangObjectNull = false;
                // DialogCartViewModel
                com.example.foodorder.viewmodel.DialogCartViewModel dialogCartViewModel = mDialogCartViewModel;



                dialogCartViewModelJavaLangObjectNull = (dialogCartViewModel) != (null);
                if (dialogCartViewModelJavaLangObjectNull) {


                    dialogCartViewModel.onClickAddToCart();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // DialogCartViewModel != null
                boolean dialogCartViewModelJavaLangObjectNull = false;
                // DialogCartViewModel
                com.example.foodorder.viewmodel.DialogCartViewModel dialogCartViewModel = mDialogCartViewModel;



                dialogCartViewModelJavaLangObjectNull = (dialogCartViewModel) != (null);
                if (dialogCartViewModelJavaLangObjectNull) {



                    dialogCartViewModel.onClickSubtractCount(tvCount);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // DialogCartViewModel != null
                boolean dialogCartViewModelJavaLangObjectNull = false;
                // DialogCartViewModel
                com.example.foodorder.viewmodel.DialogCartViewModel dialogCartViewModel = mDialogCartViewModel;



                dialogCartViewModelJavaLangObjectNull = (dialogCartViewModel) != (null);
                if (dialogCartViewModelJavaLangObjectNull) {



                    dialogCartViewModel.onClickAddCount(tvCount);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): DialogCartViewModel.mFood
        flag 1 (0x2L): DialogCartViewModel.strTotalPrice
        flag 2 (0x3L): DialogCartViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}