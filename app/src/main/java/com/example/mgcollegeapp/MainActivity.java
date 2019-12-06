package com.example.mgcollegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button button;
    String getUname,getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.uname);
        e2=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname=e1.getText().toString();
                getPassword=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getUname, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword, Toast.LENGTH_LONG).show();



            }
        });
    }
}
