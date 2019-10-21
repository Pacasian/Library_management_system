
package com.pacasian.pacy.markup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {
    EditText ed_bn,ed_a,ed_bno;
    Button btn;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        ed_bn=findViewById(R.id.editText2);
        ed_a=findViewById(R.id.editText4);
        myDB=new DatabaseHelper(this);
        ed_bno=findViewById(R.id.editText5);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adding();
            }
        });
    }
    public void adding(){
        String bookname=ed_bn.getText().toString();
        String booknumber=ed_bno.getText().toString();
        String author=ed_a.getText().toString();
        Boolean result=myDB.insertData(bookname,author,booknumber);
        if (result == true){
            Toast.makeText(this, "Successfully added", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Adding Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
