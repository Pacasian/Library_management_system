package com.pacasian.pacy.markup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_go;
EditText ed_name,ed_pass;
String name,pass;
TextView namie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_name=findViewById(R.id.editText);
        btn_go=(Button) findViewById(R.id.button_next);
        btn_go.setVisibility(View.VISIBLE);
        namie=findViewById(R.id.namie);
        ed_pass=findViewById(R.id.editText3);
        pass=ed_pass.getText().toString();
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pass=ed_pass.getText().toString();
                if (pass.equals("admin01")){
                    startActivity(new Intent(MainActivity.this,AdminActivity.class));
                    finish();
                }else {
                    Toast.makeText(MainActivity.this, " wrong Id or password "+pass, Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
