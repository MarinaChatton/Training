package com.chatton.marina.holdall.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.chatton.marina.holdall.R;

public class ListItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        TextView textView = (TextView) findViewById(R.id.item_text);
        textView.setText(getIntent().getStringExtra("text"));
    }
}
