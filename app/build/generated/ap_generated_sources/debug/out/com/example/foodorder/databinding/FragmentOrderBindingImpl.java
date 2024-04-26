package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderBindingImpl extends FragmentOrderBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentOrderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rcvOrder.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.OrderViewModel == variableId) {
            setOrderViewModel((com.example.foodorder.viewmodel.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderViewModel(@Nullable com.example.foodorder.viewmodel.OrderViewModel OrderViewModel) {
        this.mOrderViewModel = OrderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.OrderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderViewModelListOrder((androidx.databinding.ObservableList<com.example.foodorder.model.Order>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderViewModelListOrder(androidx.databinding.ObservableList<com.example.foodorder.model.Order> OrderViewModelListOrder, int fieldId) {
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
        com.example.foodorder.viewmodel.OrderViewModel orderViewModel = mOrderViewModel;
        androidx.databinding.ObservableList<com.example.foodorder.model.Order> orderViewModelListOrder = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (orderViewModel != null) {
                    // read OrderViewModel.listOrder
                    orderViewModelListOrder = orderViewModel.listOrder;
                }
                updateRegistration(0, orderViewModelListOrder);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.OrderViewModel.loadListOrder(this.rcvOrder, orderViewModelListOrder);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): OrderViewModel.listOrder
        flag 1 (0x2L): OrderViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}