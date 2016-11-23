package com.chatton.marina.holdall.list2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.chatton.marina.holdall.R;
import com.squareup.picasso.Picasso;

public class List2ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2_item);

        String photoTitle = getIntent().getStringExtra("title");
        String photoUrl = getIntent().getStringExtra("url");

        TextView title = (TextView) findViewById(R.id.full_view_title);
        title.setText(photoTitle);

        TextView url = (TextView) findViewById(R.id.full_view_url);
        url.setText(photoUrl);

        ImageView img = (ImageView) findViewById(R.id.full_view_img);
        Picasso.with(this).load(photoUrl).into(img);
    }
}
