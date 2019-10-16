package com.example.nasaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEmail,mPassword;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmail =(EditText) findViewById(R.id.emailText);
        mPassword =(EditText) findViewById(R.id.passwordText);
        login =(Button) findViewById(R.id.button);
        final String email = mEmail.getText().toString();
        final String password = mPassword.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mEmail.getText().toString().equals("admin") && mPassword.getText().toString().equals("admin"))
                {
                    Intent intent = new Intent(MainActivity.this,UserActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"INCORRECT USERNAME AND PASSWORD",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
