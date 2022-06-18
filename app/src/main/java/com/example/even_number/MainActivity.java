package com.example.even_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText sent=findViewById(R.id.number);
        TextView count=findViewById(R.id.even);
        Button b1=findViewById(R.id.even_checker);
        Editable s =sent.getText();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1=Integer.parseInt(String.valueOf(s));
                  if((s1%2)==0)
                  {
                      String result="yes,it is even :)";
                    count.setText(result);
                  }
                  else
                  {
                      String result1="no,it is not even number:(";
                      count.setText(result1);
                  }
            }
        });
    }
}