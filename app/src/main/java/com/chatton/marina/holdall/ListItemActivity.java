package com.chatton.marina.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        TextView textView = (TextView) findViewById(R.id.item_text);
        textView.setText(getIntent().getStringExtra("text"));
    }
}
