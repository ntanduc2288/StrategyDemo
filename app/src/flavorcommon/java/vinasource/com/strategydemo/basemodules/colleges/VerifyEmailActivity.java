package vinasource.com.strategydemo.basemodules.colleges;

import android.view.View;

import vinasource.com.strategydemo.R;
import vinasource.com.strategydemo.activity.BaseActivity;

/**
 * Created by user on 3/7/16.
 */
public class VerifyEmailActivity extends BaseActivity {
    @Override
    public int getResourceLayoutId() {
        return R.layout.verify_email_view;
    }

    @Override
    public void setupViews() {
        findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNextScreen(VerifyEmailActivity.this, RegisterUserNameCollegesBaseActivity.class, null);
            }
        });
    }
}
