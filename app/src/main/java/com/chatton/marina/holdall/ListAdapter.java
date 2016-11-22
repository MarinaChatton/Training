package com.chatton.marina.holdall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marina on 22/11/2016.
 */

public class ListAdapter extends BaseAdapter {
    List<String> stringList = new ArrayList<>();

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public String getItem(int position) {
        return stringList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.text)).setText(getItem(position));
        return convertView;
    }
}
