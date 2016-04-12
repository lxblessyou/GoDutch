package aagodutch.user.godutch.activity.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import aagodutch.user.godutch.R;

/**
 * Created by user on 2016-04-11.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
