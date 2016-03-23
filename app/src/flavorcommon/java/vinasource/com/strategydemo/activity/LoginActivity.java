package vinasource.com.strategydemo.activity;

import android.view.View;

import vinasource.com.strategydemo.R;
import vinasource.com.strategydemo.navigation.NavigateScreen;

/**
 * Created by user on 3/7/16.
 */
public class LoginActivity extends BaseActivity {

    NavigateScreen naviageScreen;
    @Override
    public int getResourceLayoutId() {
        return R.layout.login_view;
    }

    @Override
    public void setupViews() {
        naviageScreen = new NavigateScreen();
        findViewById(R.id.button_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRegisterFlow();
            }
        });

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        naviageScreen.login(this);
    }

    private void handleRegisterFlow(){
        naviageScreen.registerClicked(this);
    }
}
