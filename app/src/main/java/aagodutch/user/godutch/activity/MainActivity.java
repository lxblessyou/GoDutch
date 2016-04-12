package aagodutch.user.godutch.activity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.GridView;

import aagodutch.user.godutch.R;
import aagodutch.user.godutch.activity.base.FrameActivity;
import aagodutch.user.godutch.adapter.GVAdapter;

public class MainActivity extends FrameActivity {
    private GridView mGridView;
    private BaseAdapter mBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initVariable();
        bindData();
        initListener();
    }

    private void initListener() {

    }

    private void bindData() {
        mGridView.setAdapter(mBaseAdapter);
    }

    private void initView() {
        addViewtoMainLayout(R.layout.layout_main);
        mGridView = (GridView) findViewById(R.id.gv_main);
    }

    private void initVariable() {
        mBaseAdapter = new GVAdapter(this);
    }
}
