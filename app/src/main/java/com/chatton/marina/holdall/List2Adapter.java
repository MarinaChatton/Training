package com.chatton.marina.holdall;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marina on 22/11/2016.
 */

public class List2Adapter extends BaseAdapter {
    List<Photo> photoList = new ArrayList<>();
    Context context;

    public List2Adapter(Context context) {
        this.context = context;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return photoList.size();
    }

    @Override
    public Photo getItem(int position) {
        return photoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row2_layout, parent, false);
        }
        final Photo photo = getItem(position);
        String urlPhoto = photo.getUrl();
        String titlePhoto = photo.getTitle();
        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        Picasso.with(context).load(urlPhoto).resize(200,200).centerInside().into(img);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        title.setText(titlePhoto);
        TextView url = (TextView) convertView.findViewById(R.id.url);
        url.setText(urlPhoto);
        FloatingActionButton fabDelete = (FloatingActionButton) convertView.findViewById(R.id.fab_delete);
        fabDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item deleted !", Toast.LENGTH_SHORT).show();
                photoList.remove(photo);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}
