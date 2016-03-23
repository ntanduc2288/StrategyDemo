package vinasource.com.strategydemo.basemodules.colleges;

import vinasource.com.strategydemo.R;
import vinasource.com.strategydemo.activity.BaseActivity;

/**
 * Created by user on 3/15/16.
 */
public class RegistrationFlowBaseActivity extends BaseActivity {
    @Override
    public int getResourceLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setupViews() {
        gotoNextScreen(this, VerifyEmailActivity.class, null);
        finish();
    }
}
