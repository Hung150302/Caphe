package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewpager, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[3]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.viewpager2.widget.ViewPager2) bindings[4]
            );
        this.bottomNavigation.setTag(null);
        this.layoutToolbar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.MainViewModel == variableId) {
            setMainViewModel((com.example.foodorder.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainViewModel(@Nullable com.example.foodorder.viewmodel.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.MainViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModelIsShowToolbar((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeMainViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelIsShowToolbar(androidx.databinding.ObservableBoolean MainViewModelIsShowToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainViewModelTitle(androidx.databinding.ObservableField<java.lang.String> MainViewModelTitle, int fieldId) {
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
        androidx.databinding.ObservableBoolean mainViewModelIsShowToolbar = null;
        int mainViewModelIsShowToolbarViewVISIBLEViewGONE = 0;
        java.lang.String mainViewModelTitleGet = null;
        com.example.foodorder.viewmodel.MainViewModel mainViewModel = mMainViewModel;
        androidx.databinding.ObservableField<java.lang.String> mainViewModelTitle = null;
        boolean mainViewModelIsShowToolbarGet = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mainViewModel != null) {
                        // read MainViewModel.isShowToolbar
                        mainViewModelIsShowToolbar = mainViewModel.isShowToolbar;
                    }
                    updateRegistration(0, mainViewModelIsShowToolbar);


                    if (mainViewModelIsShowToolbar != null) {
                        // read MainViewModel.isShowToolbar.get()
                        mainViewModelIsShowToolbarGet = mainViewModelIsShowToolbar.get();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(mainViewModelIsShowToolbarGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read MainViewModel.isShowToolbar.get() ? View.VISIBLE : View.GONE
                    mainViewModelIsShowToolbarViewVISIBLEViewGONE = ((mainViewModelIsShowToolbarGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mainViewModel != null) {
                        // read MainViewModel.title
                        mainViewModelTitle = mainViewModel.title;
                    }
                    updateRegistration(1, mainViewModelTitle);


                    if (mainViewModelTitle != null) {
                        // read MainViewModel.title.get()
                        mainViewModelTitleGet = mainViewModelTitle.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.MainViewModel.setOnNavigationItemSelectedListener(this.bottomNavigation, viewpager);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.layoutToolbar.setVisibility(mainViewModelIsShowToolbarViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, mainViewModelTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): MainViewModel.isShowToolbar
        flag 1 (0x2L): MainViewModel.title
        flag 2 (0x3L): MainViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): MainViewModel.isShowToolbar.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): MainViewModel.isShowToolbar.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}