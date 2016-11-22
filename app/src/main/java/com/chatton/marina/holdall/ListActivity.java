package com.chatton.marina.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListAdapter adapter = new ListAdapter();

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
    }
}
