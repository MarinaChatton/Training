package com.chatton.marina.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {
    String url= "http://francodex.com/wp-content/uploads/2015/08/Chaton851426651.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        ImageView picassoImage = (ImageView) findViewById(R.id.image_picasso);
        Picasso.with(this).load(url).into(picassoImage);
    }
}
