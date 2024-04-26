package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactBindingImpl extends FragmentContactBinding  {

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

    public FragmentContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rcvData.setTag(null);
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
        if (BR.ContactViewModel == variableId) {
            setContactViewModel((com.example.foodorder.viewmodel.ContactViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContactViewModel(@Nullable com.example.foodorder.viewmodel.ContactViewModel ContactViewModel) {
        this.mContactViewModel = ContactViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ContactViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContactViewModelListContacts((androidx.databinding.ObservableList<com.example.foodorder.model.Contact>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContactViewModelListContacts(androidx.databinding.ObservableList<com.example.foodorder.model.Contact> ContactViewModelListContacts, int fieldId) {
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
        com.example.foodorder.viewmodel.ContactViewModel contactViewModel = mContactViewModel;
        androidx.databinding.ObservableList<com.example.foodorder.model.Contact> contactViewModelListContacts = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (contactViewModel != null) {
                    // read ContactViewModel.listContacts
                    contactViewModelListContacts = contactViewModel.listContacts;
                }
                updateRegistration(0, contactViewModelListContacts);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.ContactViewModel.loadListContacts(this.rcvData, contactViewModelListContacts);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ContactViewModel.listContacts
        flag 1 (0x2L): ContactViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}