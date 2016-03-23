package vinasource.com.strategydemo.navigation;

import android.app.Activity;
import android.widget.Toast;

import vinasource.com.strategydemo.activity.BaseActivity;
import vinasource.com.strategydemo.activity.RegisterUserNameActivity;
import vinasource.com.strategydemo.basenavigation.BaseNavigation;

/**
 * Created by user on 3/23/16.
 */
public class NavigateScreen  extends BaseNavigation{

    @Override
    public void login(Activity activity) {
        Toast.makeText(activity.getApplicationContext(), "Login Anomo", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registerClicked(Activity activity) {
        if(activity instanceof BaseActivity){
            ((BaseActivity)activity).gotoNextScreen(activity, RegisterUserNameActivity.class, null);
        }
    }
}
