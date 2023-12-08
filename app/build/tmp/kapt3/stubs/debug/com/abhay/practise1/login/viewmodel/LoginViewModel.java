package com.abhay.practise1.login.viewmodel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/abhay/practise1/login/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/abhay/practise1/login/listener/IOnLoginFragmentHandler;", "()V", "iOnListener", "Lcom/abhay/practise1/login/listener/IOnLoginFragmentListener;", "getIOnListener", "()Lcom/abhay/practise1/login/listener/IOnLoginFragmentListener;", "setIOnListener", "(Lcom/abhay/practise1/login/listener/IOnLoginFragmentListener;)V", "isLoginButtonEnable", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "passwordValue", "", "getPasswordValue", "phoneNumberValue", "getPhoneNumberValue", "onLoginButtonClick", "", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel implements com.abhay.practise1.login.listener.IOnLoginFragmentHandler {
    public com.abhay.practise1.login.listener.IOnLoginFragmentListener iOnListener;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> phoneNumberValue = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.String> passwordValue = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.databinding.ObservableField<java.lang.Boolean> isLoginButtonEnable = null;
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.abhay.practise1.login.listener.IOnLoginFragmentListener getIOnListener() {
        return null;
    }
    
    public final void setIOnListener(@org.jetbrains.annotations.NotNull
    com.abhay.practise1.login.listener.IOnLoginFragmentListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getPhoneNumberValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> getPasswordValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Boolean> isLoginButtonEnable() {
        return null;
    }
    
    @java.lang.Override
    public void onLoginButtonClick() {
    }
}