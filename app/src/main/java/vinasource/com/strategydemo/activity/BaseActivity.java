package vinasource.com.strategydemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by user on 3/7/16.
 */
public abstract class BaseActivity extends FragmentActivity {

    public abstract int getResourceLayoutId();

    public abstract void setupViews();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResourceLayoutId());
        setupViews();
    }

    public static void gotoNextScreen(Activity activity, Class className, Bundle bundle){
        Intent intent = new Intent(activity, className);
        if(bundle != null){
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
