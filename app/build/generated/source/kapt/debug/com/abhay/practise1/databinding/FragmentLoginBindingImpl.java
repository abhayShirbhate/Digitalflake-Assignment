package com.abhay.practise1.databinding;
import com.abhay.practise1.R;
import com.abhay.practise1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.abhay.practise1.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumberValue.get()
            //         is viewModel.phoneNumberValue.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.phoneNumberValue
            androidx.databinding.ObservableField<java.lang.String> viewModelPhoneNumberValue = null;
            // viewModel.phoneNumberValue != null
            boolean viewModelPhoneNumberValueJavaLangObjectNull = false;
            // viewModel
            com.abhay.practise1.login.viewmodel.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.phoneNumberValue.get()
            java.lang.String viewModelPhoneNumberValueGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPhoneNumberValue = viewModel.getPhoneNumberValue();

                viewModelPhoneNumberValueJavaLangObjectNull = (viewModelPhoneNumberValue) != (null);
                if (viewModelPhoneNumberValueJavaLangObjectNull) {




                    viewModelPhoneNumberValue.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordValue.get()
            //         is viewModel.passwordValue.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.passwordValue != null
            boolean viewModelPasswordValueJavaLangObjectNull = false;
            // viewModel.passwordValue
            androidx.databinding.ObservableField<java.lang.String> viewModelPasswordValue = null;
            // viewModel
            com.abhay.practise1.login.viewmodel.LoginViewModel viewModel = mViewModel;
            // viewModel.passwordValue.get()
            java.lang.String viewModelPasswordValueGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordValue = viewModel.getPasswordValue();

                viewModelPasswordValueJavaLangObjectNull = (viewModelPasswordValue) != (null);
                if (viewModelPasswordValueJavaLangObjectNull) {




                    viewModelPasswordValue.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.abhay.practise1.generated.callback.OnClickListener(this, 1);
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
        if (BR.iOnHandler == variableId) {
            setIOnHandler((com.abhay.practise1.login.listener.IOnLoginFragmentHandler) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.abhay.practise1.login.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIOnHandler(@Nullable com.abhay.practise1.login.listener.IOnLoginFragmentHandler IOnHandler) {
        this.mIOnHandler = IOnHandler;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.iOnHandler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.abhay.practise1.login.viewmodel.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPhoneNumberValue((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPasswordValue((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsLoginButtonEnable((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumberValue(androidx.databinding.ObservableField<java.lang.String> ViewModelPhoneNumberValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordValue(androidx.databinding.ObservableField<java.lang.String> ViewModelPasswordValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoginButtonEnable(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsLoginButtonEnable, int fieldId) {
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
        com.abhay.practise1.login.listener.IOnLoginFragmentHandler iOnHandler = mIOnHandler;
        androidx.databinding.ObservableField<java.lang.String> viewModelPhoneNumberValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginButtonEnableGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelPasswordValue = null;
        java.lang.String viewModelPasswordValueGet = null;
        java.lang.Boolean viewModelIsLoginButtonEnableGet = null;
        java.lang.String viewModelPhoneNumberValueGet = null;
        com.abhay.practise1.login.viewmodel.LoginViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsLoginButtonEnable = null;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumberValue
                        viewModelPhoneNumberValue = viewModel.getPhoneNumberValue();
                    }
                    updateRegistration(0, viewModelPhoneNumberValue);


                    if (viewModelPhoneNumberValue != null) {
                        // read viewModel.phoneNumberValue.get()
                        viewModelPhoneNumberValueGet = viewModelPhoneNumberValue.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordValue
                        viewModelPasswordValue = viewModel.getPasswordValue();
                    }
                    updateRegistration(1, viewModelPasswordValue);


                    if (viewModelPasswordValue != null) {
                        // read viewModel.passwordValue.get()
                        viewModelPasswordValueGet = viewModelPasswordValue.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoginButtonEnable
                        viewModelIsLoginButtonEnable = viewModel.isLoginButtonEnable();
                    }
                    updateRegistration(2, viewModelIsLoginButtonEnable);


                    if (viewModelIsLoginButtonEnable != null) {
                        // read viewModel.isLoginButtonEnable.get()
                        viewModelIsLoginButtonEnableGet = viewModelIsLoginButtonEnable.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoginButtonEnable.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginButtonEnableGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoginButtonEnableGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelPhoneNumberValueGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelPasswordValueGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView3.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginButtonEnableGet);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            com.abhay.practise1.login.adapter.LoginBindingAdapter.loginValidator(this.mboundView3, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // iOnHandler
        com.abhay.practise1.login.listener.IOnLoginFragmentHandler iOnHandler = mIOnHandler;
        // iOnHandler != null
        boolean iOnHandlerJavaLangObjectNull = false;



        iOnHandlerJavaLangObjectNull = (iOnHandler) != (null);
        if (iOnHandlerJavaLangObjectNull) {


            iOnHandler.onLoginButtonClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.phoneNumberValue
        flag 1 (0x2L): viewModel.passwordValue
        flag 2 (0x3L): viewModel.isLoginButtonEnable
        flag 3 (0x4L): iOnHandler
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}