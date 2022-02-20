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
        s1=getIntent().getStringExtra("description");
        s2=getIntent().getStringExtra("impression");

            toolbar.setTitle(bundle.getString("Publicites"));
            descriptionPub.setText(s1);
            impression.setText(s2);



    }


}
