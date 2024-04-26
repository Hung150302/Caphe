package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCartBindingImpl extends FragmentCartBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_bottom, 3);
        sViewsWithIds.put(R.id.view_divider, 4);
        sViewsWithIds.put(R.id.tvTotalPrice, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rcvFoodCart.setTag(null);
        this.tvOrderCart.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
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
        if (BR.CartViewModel == variableId) {
            setCartViewModel((com.example.foodorder.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCartViewModel(@Nullable com.example.foodorder.viewmodel.CartViewModel CartViewModel) {
        this.mCartViewModel = CartViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.CartViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCartViewModelListFoodInCart((androidx.databinding.ObservableList<com.example.foodorder.model.Food>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCartViewModelListFoodInCart(androidx.databinding.ObservableList<com.example.foodorder.model.Food> CartViewModelListFoodInCart, int fieldId) {
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
        androidx.databinding.ObservableList<com.example.foodorder.model.Food> cartViewModelListFoodInCart = null;
        com.example.foodorder.viewmodel.CartViewModel cartViewModel = mCartViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (cartViewModel != null) {
                    // read CartViewModel.listFoodInCart
                    cartViewModelListFoodInCart = cartViewModel.listFoodInCart;
                }
                updateRegistration(0, cartViewModelListFoodInCart);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.CartViewModel.loadListFoodInCart(this.rcvFoodCart, cartViewModelListFoodInCart, tvTotalPrice);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvOrderCart.setOnClickListener(mCallback9);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // CartViewModel != null
        boolean cartViewModelJavaLangObjectNull = false;
        // CartViewModel
        com.example.foodorder.viewmodel.CartViewModel cartViewModel = mCartViewModel;



        cartViewModelJavaLangObjectNull = (cartViewModel) != (null);
        if (cartViewModelJavaLangObjectNull) {


            cartViewModel.onClickOrderCart();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): CartViewModel.listFoodInCart
        flag 1 (0x2L): CartViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}