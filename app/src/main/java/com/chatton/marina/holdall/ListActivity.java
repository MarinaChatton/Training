package com.chatton.marina.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    ListAdapter adapter = new ListAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        adapter.stringList.add("Toto");
        adapter.stringList.add("Tata");
        adapter.stringList.add("Titi");
        adapter.stringList.add("Tutu");

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

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
