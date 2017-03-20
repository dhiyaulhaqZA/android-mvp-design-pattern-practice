package id.duza.androidmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.duza.androidmvp.R;
import id.duza.androidmvp.model.User;
import id.duza.androidmvp.presenter.LoginPresenter;
import id.duza.androidmvp.presenter.interfaces.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{

    @BindView(R.id.et_main_username) EditText etUsername;
    @BindView(R.id.et_main_password) EditText etPassword;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void OnLoginSuccess() {
        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnloginFailed() {
        Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_main_login)
    public void login() {
        loginPresenter.attemptLogin(getUserInput());
    }

    private User getUserInput() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        return new User(username, password);
    }
}
