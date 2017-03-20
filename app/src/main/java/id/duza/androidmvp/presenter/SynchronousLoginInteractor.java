package id.duza.androidmvp.presenter;

import id.duza.androidmvp.model.User;
import id.duza.androidmvp.presenter.interfaces.ILoginInteractor;

/**
 * Created by dhiyaulhaqza on 3/20/17.
 */

public class SynchronousLoginInteractor implements ILoginInteractor {

    @Override
    public boolean validatedCredentials(User user) { //example
        return user.getUsername().equals("username") && user.getPassword().equals("password");
    }
}
