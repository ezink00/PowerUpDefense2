package com.example.ezink.powerupdefense;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GameAdapter extends BaseAdapter {
    private Context mContext;

    public GameAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {

        return 10;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = new View(mContext);
        view.setBackgroundColor(Color.parseColor("#AF9632"));

        return view;
    }
}