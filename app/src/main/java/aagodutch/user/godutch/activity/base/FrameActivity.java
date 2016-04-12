package aagodutch.user.godutch.activity.base;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import aagodutch.user.godutch.R;

/**
 * Created by user on 2016-04-11.
 */
public class FrameActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    protected void addViewtoMainLayout(int pResource){
        LinearLayout lLL = (LinearLayout) findViewById(R.id.ll_main);
        View view = LinearLayout.inflate(this, pResource, null);
        lLL.addView(view);
    }
}
