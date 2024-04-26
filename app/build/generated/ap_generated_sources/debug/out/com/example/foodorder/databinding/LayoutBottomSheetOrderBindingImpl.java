package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutBottomSheetOrderBindingImpl extends LayoutBottomSheetOrderBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtAddressOrderandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of DialogOrderViewModel.strAddress.get()
            //         is DialogOrderViewModel.strAddress.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtAddressOrder);
            // localize variables for thread safety
            // DialogOrderViewModel.strAddress
            androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrAddress = null;
            // DialogOrderViewModel
            com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
            // DialogOrderViewModel.strAddress != null
            boolean dialogOrderViewModelStrAddressJavaLangObjectNull = false;
            // DialogOrderViewModel.strAddress.get()
            java.lang.String dialogOrderViewModelStrAddressGet = null;
            // DialogOrderViewModel != null
            boolean dialogOrderViewModelJavaLangObjectNull = false;



            dialogOrderViewModelJavaLangObjectNull = (dialogOrderViewModel) != (null);
            if (dialogOrderViewModelJavaLangObjectNull) {


                dialogOrderViewModelStrAddress = dialogOrderViewModel.strAddress;

                dialogOrderViewModelStrAddressJavaLangObjectNull = (dialogOrderViewModelStrAddress) != (null);
                if (dialogOrderViewModelStrAddressJavaLangObjectNull) {




                    dialogOrderViewModelStrAddress.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtNameOrderandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of DialogOrderViewModel.strName.get()
            //         is DialogOrderViewModel.strName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtNameOrder);
            // localize variables for thread safety
            // DialogOrderViewModel.strName != null
            boolean dialogOrderViewModelStrNameJavaLangObjectNull = false;
            // DialogOrderViewModel
            com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
            // DialogOrderViewModel.strName.get()
            java.lang.String dialogOrderViewModelStrNameGet = null;
            // DialogOrderViewModel.strName
            androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrName = null;
            // DialogOrderViewModel != null
            boolean dialogOrderViewModelJavaLangObjectNull = false;



            dialogOrderViewModelJavaLangObjectNull = (dialogOrderViewModel) != (null);
            if (dialogOrderViewModelJavaLangObjectNull) {


                dialogOrderViewModelStrName = dialogOrderViewModel.strName;

                dialogOrderViewModelStrNameJavaLangObjectNull = (dialogOrderViewModelStrName) != (null);
                if (dialogOrderViewModelStrNameJavaLangObjectNull) {




                    dialogOrderViewModelStrName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPhoneOrderandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of DialogOrderViewModel.strPhone.get()
            //         is DialogOrderViewModel.strPhone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPhoneOrder);
            // localize variables for thread safety
            // DialogOrderViewModel.strPhone
            androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrPhone = null;
            // DialogOrderViewModel
            com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
            // DialogOrderViewModel.strPhone != null
            boolean dialogOrderViewModelStrPhoneJavaLangObjectNull = false;
            // DialogOrderViewModel.strPhone.get()
            java.lang.String dialogOrderViewModelStrPhoneGet = null;
            // DialogOrderViewModel != null
            boolean dialogOrderViewModelJavaLangObjectNull = false;



            dialogOrderViewModelJavaLangObjectNull = (dialogOrderViewModel) != (null);
            if (dialogOrderViewModelJavaLangObjectNull) {


                dialogOrderViewModelStrPhone = dialogOrderViewModel.strPhone;

                dialogOrderViewModelStrPhoneJavaLangObjectNull = (dialogOrderViewModelStrPhone) != (null);
                if (dialogOrderViewModelStrPhoneJavaLangObjectNull) {




                    dialogOrderViewModelStrPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LayoutBottomSheetOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutBottomSheetOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.edtAddressOrder.setTag(null);
        this.edtNameOrder.setTag(null);
        this.edtPhoneOrder.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCancelOrder.setTag(null);
        this.tvCreateOrder.setTag(null);
        this.tvFoodsOrder.setTag(null);
        this.tvPriceOrder.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.foodorder.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.DialogOrderViewModel == variableId) {
            setDialogOrderViewModel((com.example.foodorder.viewmodel.DialogOrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDialogOrderViewModel(@Nullable com.example.foodorder.viewmodel.DialogOrderViewModel DialogOrderViewModel) {
        this.mDialogOrderViewModel = DialogOrderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.DialogOrderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDialogOrderViewModelStrPhone((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDialogOrderViewModelStrAddress((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDialogOrderViewModelStrName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDialogOrderViewModelStrPhone(androidx.databinding.ObservableField<java.lang.String> DialogOrderViewModelStrPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDialogOrderViewModelStrAddress(androidx.databinding.ObservableField<java.lang.String> DialogOrderViewModelStrAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDialogOrderViewModelStrName(androidx.databinding.ObservableField<java.lang.String> DialogOrderViewModelStrName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
        androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrPhone = null;
        java.lang.String dialogOrderViewModelGetStringListFoodsOrder = null;
        java.lang.String dialogOrderViewModelStrPhoneGet = null;
        java.lang.String dialogOrderViewModelStrAddressGet = null;
        androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrAddress = null;
        androidx.databinding.ObservableField<java.lang.String> dialogOrderViewModelStrName = null;
        java.lang.String dialogOrderViewModelStrTotalPrice = null;
        java.lang.String dialogOrderViewModelStrNameGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (dialogOrderViewModel != null) {
                        // read DialogOrderViewModel.strPhone
                        dialogOrderViewModelStrPhone = dialogOrderViewModel.strPhone;
                    }
                    updateRegistration(0, dialogOrderViewModelStrPhone);


                    if (dialogOrderViewModelStrPhone != null) {
                        // read DialogOrderViewModel.strPhone.get()
                        dialogOrderViewModelStrPhoneGet = dialogOrderViewModelStrPhone.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (dialogOrderViewModel != null) {
                        // read DialogOrderViewModel.getStringListFoodsOrder()
                        dialogOrderViewModelGetStringListFoodsOrder = dialogOrderViewModel.getStringListFoodsOrder();
                        // read DialogOrderViewModel.strTotalPrice
                        dialogOrderViewModelStrTotalPrice = dialogOrderViewModel.strTotalPrice;
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (dialogOrderViewModel != null) {
                        // read DialogOrderViewModel.strAddress
                        dialogOrderViewModelStrAddress = dialogOrderViewModel.strAddress;
                    }
                    updateRegistration(1, dialogOrderViewModelStrAddress);


                    if (dialogOrderViewModelStrAddress != null) {
                        // read DialogOrderViewModel.strAddress.get()
                        dialogOrderViewModelStrAddressGet = dialogOrderViewModelStrAddress.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (dialogOrderViewModel != null) {
                        // read DialogOrderViewModel.strName
                        dialogOrderViewModelStrName = dialogOrderViewModel.strName;
                    }
                    updateRegistration(2, dialogOrderViewModelStrName);


                    if (dialogOrderViewModelStrName != null) {
                        // read DialogOrderViewModel.strName.get()
                        dialogOrderViewModelStrNameGet = dialogOrderViewModelStrName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtAddressOrder, dialogOrderViewModelStrAddressGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtAddressOrder, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtAddressOrderandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtNameOrder, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtNameOrderandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPhoneOrder, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPhoneOrderandroidTextAttrChanged);
            this.tvCancelOrder.setOnClickListener(mCallback7);
            this.tvCreateOrder.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtNameOrder, dialogOrderViewModelStrNameGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPhoneOrder, dialogOrderViewModelStrPhoneGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFoodsOrder, dialogOrderViewModelGetStringListFoodsOrder);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPriceOrder, dialogOrderViewModelStrTotalPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // DialogOrderViewModel
                com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
                // DialogOrderViewModel != null
                boolean dialogOrderViewModelJavaLangObjectNull = false;



                dialogOrderViewModelJavaLangObjectNull = (dialogOrderViewModel) != (null);
                if (dialogOrderViewModelJavaLangObjectNull) {


                    dialogOrderViewModel.onClickSendOrder();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // DialogOrderViewModel
                com.example.foodorder.viewmodel.DialogOrderViewModel dialogOrderViewModel = mDialogOrderViewModel;
                // DialogOrderViewModel != null
                boolean dialogOrderViewModelJavaLangObjectNull = false;



                dialogOrderViewModelJavaLangObjectNull = (dialogOrderViewModel) != (null);
                if (dialogOrderViewModelJavaLangObjectNull) {


                    dialogOrderViewModel.onClickCancel();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): DialogOrderViewModel.strPhone
        flag 1 (0x2L): DialogOrderViewModel.strAddress
        flag 2 (0x3L): DialogOrderViewModel.strName
        flag 3 (0x4L): DialogOrderViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}