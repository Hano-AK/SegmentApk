package com.hanoak.exempledpk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    TextView descriptionPub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.iw);
        toolbar.setTitle("LISTES DES PUBLICITES");
        listView =( ListView)findViewById(R.id.ListVw);
        String[] s1;
        String[] s2;
        s1=getResources().getStringArray(R.array.description);
        s2=getResources().getStringArray(R.array.impression);
        descriptionPub =(TextView)findViewById(R.id.descrip);
        ArrayAdapter<String>mAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.publicités));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("Publicites",listView.getItemAtPosition(i).toString());
                intent.putExtra("description",getResources().getStringArray(R.array.description)[i]);
                intent.putExtra("impression",getResources().getStringArray(R.array.impression)[i]);
               startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);
    }
}