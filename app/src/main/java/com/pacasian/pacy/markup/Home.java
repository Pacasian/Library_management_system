package com.pacasian.pacy.markup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView client;
    Button c1,c2,i1,i2,i3;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        //CSE - 1rd year
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, MainActivity.class);
                i.putExtra("class", "c1");
                i.putExtra("Name",val);
                startActivity(i);
            }
        });

        //CSE - 2rd year
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, student.class);
                i.putExtra("class", "c2");
                i.putExtra("Name",val);
                startActivity(i);
            }
        });

        //CSE - 3rd year

        //IT - 1st year
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Entry.class);
                i.putExtra("class", "i1");
                i.putExtra("Name",val);
                startActivity(i);
            }
        });
        //IT - 2nd year
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Entry.class);
                i.putExtra("class", "i2");
                i.putExtra("Name",val);
                startActivity(i);
            }
        });
        //IT - 3rd year
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Entry.class);
                i.putExtra("class", "i3");
                i.putExtra("Name",val);
                startActivity(i);
            }
        });


    }

}
