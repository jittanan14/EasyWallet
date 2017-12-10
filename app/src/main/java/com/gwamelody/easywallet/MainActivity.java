package com.gwamelody.easywallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gwamelody.easywallet.Adapter.ListAdapter;
import com.gwamelody.easywallet.Model.incom;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private Button addincome;
    private Button addexpense;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.ListName);
        addincome = (Button) findViewById(R.id.incomebutton);
        addexpense = (Button) findViewById(R.id.expensebutton);


        addincome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
        addexpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                finish();
            }
        });

        DBHelper mDB = new DBHelper(this);
        ArrayList<incom> income=mDB.getincom();

        adapter = new ListAdapter(this,R.layout.item,income);
        mListView.setAdapter(adapter);
    }
}
