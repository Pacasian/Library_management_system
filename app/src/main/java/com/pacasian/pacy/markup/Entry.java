package com.pacasian.pacy.markup;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Entry extends AppCompatActivity {
    String[] language ={"C bible","C++ by Martin Lucus","Java by  Richard John",".NET- Second Edition","Cloud Computing Bible","Android development","ASP.NET","PHP"};
    String bookn;
    AutoCompleteTextView actv;
    DatabaseHelper myDB;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        myDB=new DatabaseHelper(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,language);
        //Getting the instance of AutoCompleteTextView
         actv =  (AutoCompleteTextView)findViewById(R.id.subject);
         txt=findViewById(R.id.textView10);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView

        Button btn_comp=findViewById(R.id.compute);
        btn_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
            }
        });

    }
    public void compute(){
        bookn=actv.getText().toString();
        if (bookn.equals("")||bookn.equals(null)){
            Toast.makeText(this, "Content Null", Toast.LENGTH_SHORT).show();
        }else{
            Cursor res=myDB.getAllData(bookn);
            StringBuffer stringBuffer=new StringBuffer();
            if (res!=null && res.getCount()>0) {
                while (res.moveToNext()) {
                    //stringBuffer.append("Book Name: " + res.getString(0) + "\n");
                    stringBuffer.append("Book Name: " + res.getString(1) + "\n");
                    stringBuffer.append("Author : " + res.getString(2) + "\n");
                    stringBuffer.append("Book Number : " + res.getString(3) + "\n \n");
                }
                txt.setText(stringBuffer.toString());
                Toast.makeText(this, "Data Received", Toast.LENGTH_SHORT).show();
            }
        }

    }

        




}
