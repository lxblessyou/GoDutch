package aagodutch.user.godutch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import aagodutch.user.godutch.R;

/**
 * Created by user on 2016-04-11.
 */
public class GVAdapter extends android.widget.BaseAdapter {
    private Context context;
    private int[] mImgIDs = new int[]{
            R.drawable.grid_payout,
            R.drawable.grid_bill,
            R.drawable.grid_report,
            R.drawable.grid_account_book,
            R.drawable.grid_category,
            R.drawable.grid_user,
    };
    private String[] mText = new String[mImgIDs.length];

    public GVAdapter(Context context) {
        this.context = context;
        mText[0] = context.getString(R.string.appGridTextPayoutAdd);
        mText[1] = context.getString(R.string.appGridTextPayoutManage);
        mText[2] = context.getString(R.string.appGridTextAccountBookManage);
        mText[3] = context.getString(R.string.appGridTextStatisticsManage);
        mText[4] = context.getString(R.string.appGridTextCategoryManage);
        mText[5] = context.getString(R.string.appGridTextUserManage);
    }

    @Override
    public int getCount() {
        return mImgIDs.length;
    }

    @Override
    public Object getItem(int position) {
        return mText[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHold viewHold = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_layout_main, null);
            viewHold = new ViewHold();
            viewHold.iv = (ImageView) convertView.findViewById(R.id.iv_main);
            viewHold.tv = (TextView) convertView.findViewById(R.id.tv_main);
            convertView.setTag(viewHold);
        } else {
            viewHold = (ViewHold) convertView.getTag();
        }
        viewHold.iv.setImageResource(mImgIDs[position]);
        viewHold.tv.setText(mText[position]);

        return convertView;
    }

    static class ViewHold{
        ImageView iv;
        TextView tv;
    }
}
