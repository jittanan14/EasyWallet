package com.gwamelody.easywallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.gwamelody.easywallet.Adapter.ListAdapter;
import com.gwamelody.easywallet.Model.incom;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity{

    DBHelper mDB;
    EditText detail;
    int number;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mDB = new DBHelper(this);

        detail = (EditText) findViewById(R.id.detailID);
        add = (Button) findViewById(R.id.addButtonID);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDB.addAnimal(new incom(detail.getText().toString(),number));
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
    }

