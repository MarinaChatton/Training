package com.chatton.marina.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class List2Activity extends AppCompatActivity {

    List<Photo> photoList = new ArrayList<>();
    List2Adapter list2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        photoList.add(new Photo("Chaton mignon","http://francodex.com/wp-content/uploads/2015/08/Chaton851426651.jpg"));
        photoList.add(new Photo("Chiot","http://collier-de-dressage.com/wp-content/uploads/2016/07/arriv%C3%A9e-chiot-maison.jpeg"));
        photoList.add(new Photo("Ecureuil", "http://img.over-blog-kiwi.com/1/85/86/15/20151020/ob_9b3102_ecureuil-roux.jpg"));

        list2Adapter  = new List2Adapter(this);

        ListView listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(list2Adapter);

        list2Adapter.setPhotoList(photoList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Photo photo = list2Adapter.getItem(position);
                String titlePhoto = photo.getTitle();
                String urlPhoto = photo.getUrl();

                Intent intent = new Intent(List2Activity.this,List2ItemActivity.class);
                intent.putExtra("title", titlePhoto);
                intent.putExtra("url", urlPhoto);
                startActivity(intent);
            }
        });

    }
}
