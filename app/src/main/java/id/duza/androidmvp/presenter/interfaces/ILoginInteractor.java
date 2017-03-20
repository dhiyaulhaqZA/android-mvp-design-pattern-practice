package id.duza.androidmvp.presenter.interfaces;

import id.duza.androidmvp.model.User;

/**
 * Created by dhiyaulhaqza on 3/20/17.
 */

public interface ILoginInteractor {
    boolean validatedCredentials(User user);
}
