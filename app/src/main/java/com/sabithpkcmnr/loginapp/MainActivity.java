package com.sabithpkcmnr.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usr,psd;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =(Button) findViewById(R.id.btn);
        usr =(EditText) findViewById(R.id.usr);
        psd =(EditText) findViewById(R.id.psd);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usr.getText().toString().equals("admin") &&
                        psd.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG);
                    Intent intent = new Intent(MainActivity.this,
                            LoggedActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}