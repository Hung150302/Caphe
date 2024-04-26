package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFeedbackBindingImpl extends FragmentFeedbackBinding  {

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
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mFeedbackModelClickSendFeedbackAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtCommentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of FeedbackModel.comment
            //         is FeedbackModel.setComment((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtComment);
            // localize variables for thread safety
            // FeedbackModel.comment
            java.lang.String feedbackModelComment = null;
            // FeedbackModel
            com.example.foodorder.model.Feedback feedbackModel = mFeedbackModel;
            // FeedbackModel != null
            boolean feedbackModelJavaLangObjectNull = false;



            feedbackModelJavaLangObjectNull = (feedbackModel) != (null);
            if (feedbackModelJavaLangObjectNull) {




                feedbackModel.setComment(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of FeedbackModel.email
            //         is FeedbackModel.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // FeedbackModel.email
            java.lang.String feedbackModelEmail = null;
            // FeedbackModel
            com.example.foodorder.model.Feedback feedbackModel = mFeedbackModel;
            // FeedbackModel != null
            boolean feedbackModelJavaLangObjectNull = false;



            feedbackModelJavaLangObjectNull = (feedbackModel) != (null);
            if (feedbackModelJavaLangObjectNull) {




                feedbackModel.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of FeedbackModel.name
            //         is FeedbackModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtName);
            // localize variables for thread safety
            // FeedbackModel.name
            java.lang.String feedbackModelName = null;
            // FeedbackModel
            com.example.foodorder.model.Feedback feedbackModel = mFeedbackModel;
            // FeedbackModel != null
            boolean feedbackModelJavaLangObjectNull = false;



            feedbackModelJavaLangObjectNull = (feedbackModel) != (null);
            if (feedbackModelJavaLangObjectNull) {




                feedbackModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of FeedbackModel.phone
            //         is FeedbackModel.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPhone);
            // localize variables for thread safety
            // FeedbackModel
            com.example.foodorder.model.Feedback feedbackModel = mFeedbackModel;
            // FeedbackModel.phone
            java.lang.String feedbackModelPhone = null;
            // FeedbackModel != null
            boolean feedbackModelJavaLangObjectNull = false;



            feedbackModelJavaLangObjectNull = (feedbackModel) != (null);
            if (feedbackModelJavaLangObjectNull) {




                feedbackModel.setPhone(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentFeedbackBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentFeedbackBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.edtComment.setTag(null);
        this.edtEmail.setTag(null);
        this.edtName.setTag(null);
        this.edtPhone.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvSendFeedback.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.FeedbackModel == variableId) {
            setFeedbackModel((com.example.foodorder.model.Feedback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFeedbackModel(@Nullable com.example.foodorder.model.Feedback FeedbackModel) {
        updateRegistration(0, FeedbackModel);
        this.mFeedbackModel = FeedbackModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.FeedbackModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFeedbackModel((com.example.foodorder.model.Feedback) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFeedbackModel(com.example.foodorder.model.Feedback FeedbackModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.phone) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.comment) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String feedbackModelName = null;
        java.lang.String feedbackModelComment = null;
        java.lang.String feedbackModelEmail = null;
        com.example.foodorder.model.Feedback feedbackModel = mFeedbackModel;
        android.view.View.OnClickListener feedbackModelClickSendFeedbackAndroidViewViewOnClickListener = null;
        java.lang.String feedbackModelPhone = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (feedbackModel != null) {
                        // read FeedbackModel.name
                        feedbackModelName = feedbackModel.getName();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (feedbackModel != null) {
                        // read FeedbackModel.comment
                        feedbackModelComment = feedbackModel.getComment();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (feedbackModel != null) {
                        // read FeedbackModel.email
                        feedbackModelEmail = feedbackModel.getEmail();
                    }
            }
            if ((dirtyFlags & 0x21L) != 0) {

                    if (feedbackModel != null) {
                        // read FeedbackModel::clickSendFeedback
                        feedbackModelClickSendFeedbackAndroidViewViewOnClickListener = (((mFeedbackModelClickSendFeedbackAndroidViewViewOnClickListener == null) ? (mFeedbackModelClickSendFeedbackAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFeedbackModelClickSendFeedbackAndroidViewViewOnClickListener).setValue(feedbackModel));
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (feedbackModel != null) {
                        // read FeedbackModel.phone
                        feedbackModelPhone = feedbackModel.getPhone();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtComment, feedbackModelComment);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtComment, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtCommentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPhoneandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, feedbackModelEmail);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtName, feedbackModelName);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPhone, feedbackModelPhone);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.tvSendFeedback.setOnClickListener(feedbackModelClickSendFeedbackAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.foodorder.model.Feedback value;
        public OnClickListenerImpl setValue(com.example.foodorder.model.Feedback value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.clickSendFeedback(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): FeedbackModel
        flag 1 (0x2L): FeedbackModel.name
        flag 2 (0x3L): FeedbackModel.phone
        flag 3 (0x4L): FeedbackModel.email
        flag 4 (0x5L): FeedbackModel.comment
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}