package vinasource.com.strategydemo.activity;

import android.view.View;

import vinasource.com.strategydemo.R;

/**
 * Created by user on 3/7/16.
 */
public class VerifyCodeActivity extends BaseActivity{
    @Override
    public int getResourceLayoutId() {
        return R.layout.verify_code_view;
    }

    @Override
    public void setupViews() {
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNextScreen(VerifyCodeActivity.this, RegisterUserNameActivity.class, null);
            }
        });
    }
}
