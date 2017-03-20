package id.duza.androidmvp.presenter;

import id.duza.androidmvp.model.User;
import id.duza.androidmvp.presenter.interfaces.ILoginPresenter;
import id.duza.androidmvp.presenter.interfaces.ILoginView;

/**
 * Created by dhiyaulhaqza on 3/20/17.
 */

public class LoginPresenter implements ILoginPresenter {

    private ILoginView loginView;
    private SynchronousLoginInteractor interactor;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        this.interactor = new SynchronousLoginInteractor();
    }

    @Override
    public void attemptLogin(User user) {
        boolean isValid = interactor.validatedCredentials(user);
        if (isValid)    {
            loginView.OnLoginSuccess();
        } else  {
            loginView.OnloginFailed();
        }
    }
}
