package vinasource.com.strategydemo.navigation;

import android.app.Activity;
import android.widget.Toast;

import vinasource.com.strategydemo.activity.BaseActivity;
import vinasource.com.strategydemo.activity.VerifyCodeActivity;

/**
 * Created by user on 3/23/16.
 */
public class NavigateScreen  {

    public void login(Activity activity) {
        Toast.makeText(activity.getApplicationContext(), "Login THINKSPACE", Toast.LENGTH_SHORT).show();
    }

    public void registerClicked(Activity activity) {
        if(activity instanceof BaseActivity){
            ((BaseActivity)activity).gotoNextScreen(activity, VerifyCodeActivity.class, null);
        }
    }
}
