package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrderBindingImpl extends ItemOrderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.label_id, 9);
        sViewsWithIds.put(R.id.label_name, 10);
        sViewsWithIds.put(R.id.label_phone, 11);
        sViewsWithIds.put(R.id.label_address, 12);
        sViewsWithIds.put(R.id.label_menu, 13);
        sViewsWithIds.put(R.id.label_date, 14);
        sViewsWithIds.put(R.id.label_total_amount, 15);
        sViewsWithIds.put(R.id.label_payment, 16);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAddress.setTag(null);
        this.tvDate.setTag(null);
        this.tvId.setTag(null);
        this.tvMenu.setTag(null);
        this.tvName.setTag(null);
        this.tvPayment.setTag(null);
        this.tvPhone.setTag(null);
        this.tvTotalAmount.setTag(null);
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
        if (BR.OrderModel == variableId) {
            setOrderModel((com.example.foodorder.model.Order) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderModel(@Nullable com.example.foodorder.model.Order OrderModel) {
        this.mOrderModel = OrderModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.OrderModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.foodorder.model.Order orderModel = mOrderModel;
        java.lang.String orderModelStringPaymentMethod = null;
        java.lang.String orderModelName = null;
        java.lang.String orderModelStringId = null;
        java.lang.String orderModelAddress = null;
        java.lang.String orderModelPhone = null;
        java.lang.String orderModelStringAmount = null;
        java.lang.String orderModelStringDate = null;
        java.lang.String orderModelFoods = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (orderModel != null) {
                    // read OrderModel.stringPaymentMethod
                    orderModelStringPaymentMethod = orderModel.getStringPaymentMethod();
                    // read OrderModel.name
                    orderModelName = orderModel.getName();
                    // read OrderModel.stringId
                    orderModelStringId = orderModel.getStringId();
                    // read OrderModel.address
                    orderModelAddress = orderModel.getAddress();
                    // read OrderModel.phone
                    orderModelPhone = orderModel.getPhone();
                    // read OrderModel.stringAmount
                    orderModelStringAmount = orderModel.getStringAmount();
                    // read OrderModel.stringDate
                    orderModelStringDate = orderModel.getStringDate();
                    // read OrderModel.foods
                    orderModelFoods = orderModel.getFoods();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvAddress, orderModelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, orderModelStringDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvId, orderModelStringId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMenu, orderModelFoods);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, orderModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPayment, orderModelStringPaymentMethod);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, orderModelPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalAmount, orderModelStringAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): OrderModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}