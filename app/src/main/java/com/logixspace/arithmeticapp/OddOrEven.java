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

public class OddOrEven extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_or_even);
        b1=(AppCompatButton) findViewById(R.id.con);
        b2=(AppCompatButton) findViewById(R.id.result);
        e1=(EditText) findViewById(R.id.num1);
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
                int a=Integer.parseInt(num1);
                if(a%2==0)
                {
                    Toast.makeText(getApplicationContext(),"EVEN:",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"ODD:"+String.valueOf(a),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}