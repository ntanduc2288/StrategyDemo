package vinasource.com.strategydemo.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import vinasource.com.strategydemo.R;

/**
 * Created by user on 3/7/16.
 */
public abstract class RegisterUsernameBaseActivity extends BaseActivity implements View.OnClickListener {
    private boolean usernamePassValid = false;
    public TextView txtUserName, txtPassword;
    public Button btnNext;

    public void setupUserNamePasswordView(){
        txtUserName = (EditText) findViewById(R.id.username);
        txtPassword = (EditText) findViewById(R.id.password);
//        btnNext = (Button) findViewById(R.id.button_next);
//        btnNext.setOnClickListener(this);
    }

    public boolean validateUserNameAndPass(){
        if(txtUserName.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()){
            usernamePassValid = false;
        }else {
            usernamePassValid = true;
        }
        return usernamePassValid;
    }

    public boolean canGoToNextScreen(){

        return usernamePassValid;
    }


}
