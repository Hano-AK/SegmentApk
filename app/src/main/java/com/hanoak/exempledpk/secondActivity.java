package com.hanoak.exempledpk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class secondActivity extends AppCompatActivity {
    Toolbar toolbar;
     String s1;
    String s2;
    TextView descriptionPub;
    TextView impression;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        descriptionPub =(TextView)findViewById(R.id.descrip);
        impression=(TextView)findViewById(R.id.impression);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            toolbar.setTitle(bundle.getString("Publicites"));
            getData();
            setData();


        }

    }

    public void getData(){
        if (getIntent().hasExtra("description")&&getIntent().hasExtra("impression")){
            s1=getIntent().getStringExtra(s1);
            s2=getIntent().getStringExtra(s2);
        }
        else{
            Toast.makeText(this,"Nodata",Toast.LENGTH_SHORT).show();
        }

    }
    public  void setData(){

        descriptionPub.setText(s1);
        impression.setText(s2);

    }
}
