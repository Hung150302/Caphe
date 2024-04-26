package com.example.foodorder.databinding;
import com.example.foodorder.R;
import com.example.foodorder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.example.foodorder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_search, 5);
        sViewsWithIds.put(R.id.indicator, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (me.relex.circleindicator.CircleIndicator3) bindings[6]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.viewpager2.widget.ViewPager2) bindings[3]
            );
        this.edtSearchName.setTag(null);
        this.imgSearch.setTag(null);
        this.layoutContent.setTag(null);
        this.rcvFood.setTag(null);
        this.viewpager2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.example.foodorder.generated.callback.OnClickListener(this, 1);
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
        if (BR.HomeViewModel == variableId) {
            setHomeViewModel((com.example.foodorder.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeViewModel(@Nullable com.example.foodorder.viewmodel.HomeViewModel HomeViewModel) {
        updateRegistration(2, HomeViewModel);
        this.mHomeViewModel = HomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.HomeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeViewModelGetStringHintEdtSearchName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeHomeViewModelListFoodPopular((androidx.databinding.ObservableList<com.example.foodorder.model.Food>) object, fieldId);
            case 2 :
                return onChangeHomeViewModel((com.example.foodorder.viewmodel.HomeViewModel) object, fieldId);
            case 3 :
                return onChangeHomeViewModelListFood((androidx.databinding.ObservableList<com.example.foodorder.model.Food>) object, fieldId);
            case 4 :
                return onChangeHomeViewModelIsSuccess((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeViewModelGetStringHintEdtSearchName(androidx.databinding.ObservableField<java.lang.String> HomeViewModelGetStringHintEdtSearchName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModelListFoodPopular(androidx.databinding.ObservableList<com.example.foodorder.model.Food> HomeViewModelListFoodPopular, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModel(com.example.foodorder.viewmodel.HomeViewModel HomeViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModelListFood(androidx.databinding.ObservableList<com.example.foodorder.model.Food> HomeViewModelListFood, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeViewModelIsSuccess(androidx.databinding.ObservableBoolean HomeViewModelIsSuccess, int fieldId) {
        if (fieldId == BR._all) {
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
        boolean homeViewModelIsSuccessGet = false;
        androidx.databinding.ObservableField<java.lang.String> homeViewModelGetStringHintEdtSearchName = null;
        androidx.databinding.ObservableList<com.example.foodorder.model.Food> homeViewModelListFoodPopular = null;
        java.lang.String homeViewModelGetStringHintEdtSearchNameGet = null;
        com.example.foodorder.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;
        androidx.databinding.ObservableList<com.example.foodorder.model.Food> homeViewModelListFood = null;
        int homeViewModelIsSuccessViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean homeViewModelIsSuccess = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x25L) != 0) {

                    if (homeViewModel != null) {
                        // read HomeViewModel.getStringHint(edtSearchName)
                        homeViewModelGetStringHintEdtSearchName = homeViewModel.getStringHint(edtSearchName);
                    }
                    updateRegistration(0, homeViewModelGetStringHintEdtSearchName);


                    if (homeViewModelGetStringHintEdtSearchName != null) {
                        // read HomeViewModel.getStringHint(edtSearchName).get()
                        homeViewModelGetStringHintEdtSearchNameGet = homeViewModelGetStringHintEdtSearchName.get();
                    }
            }
            if ((dirtyFlags & 0x26L) != 0) {

                    if (homeViewModel != null) {
                        // read HomeViewModel.listFoodPopular
                        homeViewModelListFoodPopular = homeViewModel.listFoodPopular;
                    }
                    updateRegistration(1, homeViewModelListFoodPopular);
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (homeViewModel != null) {
                        // read HomeViewModel.listFood
                        homeViewModelListFood = homeViewModel.listFood;
                    }
                    updateRegistration(3, homeViewModelListFood);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (homeViewModel != null) {
                        // read HomeViewModel.isSuccess
                        homeViewModelIsSuccess = homeViewModel.isSuccess;
                    }
                    updateRegistration(4, homeViewModelIsSuccess);


                    if (homeViewModelIsSuccess != null) {
                        // read HomeViewModel.isSuccess.get()
                        homeViewModelIsSuccessGet = homeViewModelIsSuccess.get();
                    }
                if((dirtyFlags & 0x34L) != 0) {
                    if(homeViewModelIsSuccessGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read HomeViewModel.isSuccess.get() ? View.VISIBLE : View.GONE
                    homeViewModelIsSuccessViewVISIBLEViewGONE = ((homeViewModelIsSuccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.edtSearchName.setHint(homeViewModelGetStringHintEdtSearchNameGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.imgSearch.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.layoutContent.setVisibility(homeViewModelIsSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.HomeViewModel.loadListFood(this.rcvFood, homeViewModelListFood);
        }
        if ((dirtyFlags & 0x26L) != 0) {
            // api target 1

            com.example.foodorder.viewmodel.HomeViewModel.loadListFoodPopular(this.viewpager2, homeViewModelListFoodPopular, indicator);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // HomeViewModel != null
        boolean homeViewModelJavaLangObjectNull = false;
        // HomeViewModel
        com.example.foodorder.viewmodel.HomeViewModel homeViewModel = mHomeViewModel;



        homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
        if (homeViewModelJavaLangObjectNull) {



            homeViewModel.onClickButtonSearch(edtSearchName);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): HomeViewModel.getStringHint(edtSearchName)
        flag 1 (0x2L): HomeViewModel.listFoodPopular
        flag 2 (0x3L): HomeViewModel
        flag 3 (0x4L): HomeViewModel.listFood
        flag 4 (0x5L): HomeViewModel.isSuccess
        flag 5 (0x6L): null
        flag 6 (0x7L): HomeViewModel.isSuccess.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): HomeViewModel.isSuccess.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}