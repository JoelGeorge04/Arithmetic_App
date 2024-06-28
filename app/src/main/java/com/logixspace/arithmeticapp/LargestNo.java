package com.logixspace.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LargestNo extends AppCompatActivity {
AppCompatButton b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_largest_no);
        b1=(AppCompatButton) findViewById(R.id.con);
        b2=(AppCompatButton) findViewById(R.id.result);
        e1=(EditText) findViewById(R.id.num1);
        e2=(EditText) findViewById(R.id.num2);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=e1.getText().toString();
                String num2=e2.getText().toString();
                int a=Integer.parseInt(num1);
                int b=Integer.parseInt(num2);
                if(a<b)
                {
                    Toast.makeText(getApplicationContext(),"Largest:"+String.valueOf(b),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Largest:"+String.valueOf(a),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}