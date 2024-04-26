package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemContactBindingImpl extends ItemContactBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mContactModelClickContactItemAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemContactBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemContactBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.imgContact.setTag(null);
        this.layoutItem.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvContact.setTag(null);
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
        if (BR.ContactModel == variableId) {
            setContactModel((com.example.foodorder.model.Contact) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContactModel(@Nullable com.example.foodorder.model.Contact ContactModel) {
        this.mContactModel = ContactModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ContactModel);
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
        java.lang.String contactModelName = null;
        android.view.View.OnClickListener contactModelClickContactItemAndroidViewViewOnClickListener = null;
        int contactModelImage = 0;
        com.example.foodorder.model.Contact contactModel = mContactModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (contactModel != null) {
                    // read ContactModel.name
                    contactModelName = contactModel.getName();
                    // read ContactModel::clickContactItem
                    contactModelClickContactItemAndroidViewViewOnClickListener = (((mContactModelClickContactItemAndroidViewViewOnClickListener == null) ? (mContactModelClickContactItemAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mContactModelClickContactItemAndroidViewViewOnClickListener).setValue(contactModel));
                    // read ContactModel.image
                    contactModelImage = contactModel.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foodorder.model.Contact.setImageViewResource(this.imgContact, contactModelImage);
            this.layoutItem.setOnClickListener(contactModelClickContactItemAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContact, contactModelName);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.foodorder.model.Contact value;
        public OnClickListenerImpl setValue(com.example.foodorder.model.Contact value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickContactItem(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ContactModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}