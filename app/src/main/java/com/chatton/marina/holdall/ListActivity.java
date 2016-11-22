package com.chatton.marina.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListAdapter adapter;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list.add("Toto");
        list.add("Tata");
        list.add("Titi");
        list.add("Tutu");

        adapter  = new ListAdapter(this);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        adapter.setStringList(list);//call automatically notifyDataSetChanged() (see method in ListAdapter)

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String textItem = adapter.getItem(position);
                Intent intent = new Intent(ListActivity.this,ListItemActivity.class);
                intent.putExtra("text", textItem);
                startActivity(intent);
            }
        });
    }
}
