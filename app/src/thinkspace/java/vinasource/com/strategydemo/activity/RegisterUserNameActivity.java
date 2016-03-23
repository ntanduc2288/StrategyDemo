package vinasource.com.strategydemo.activity;

import android.view.View;
import android.widget.Toast;

import vinasource.com.strategydemo.R;

/**
 * Created by user on 3/7/16.
 */
public class RegisterUserNameActivity extends RegisterUsernameBaseActivity {


    @Override
    public int getResourceLayoutId() {
        return R.layout.register_username;
    }

    @Override
    public void setupViews() {
        setupUserNamePasswordView();

        findViewById(R.id.button_next).setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if(validateUserNameAndPass()){

        }else {
            Toast.makeText(this, "Make sure username/password not null", Toast.LENGTH_SHORT).show();
        }
    }
}
