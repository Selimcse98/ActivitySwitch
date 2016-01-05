package com.selim.activityswitch;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity{

    Button loginBtn,registerBtn,exitBtn;
    private String TAG = MainActivity.class.getSimpleName();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);

            loginBtn = (Button) findViewById(R.id.goLoginBtn);
            registerBtn = (Button) findViewById(R.id.goRegisterBtn);
            exitBtn = (Button) findViewById(R.id.exitBtn);
            loginBtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d(TAG,"Login button pressed");
                    Log.d("selim","Login button pressed");
                    Toast.makeText(MainActivity.this,"Moving towards login page",Toast.LENGTH_LONG).show();
                    Intent i = new Intent("com.selim.activityswitch.LoginActivity");
                    startActivity(i);
                    finish();
                }
            });

            registerBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG,"register button pressed");
                    Log.d("selim","register button pressed");
                    Toast.makeText(MainActivity.this,"Moving towards register page",Toast.LENGTH_LONG).show();
                    Intent i = new Intent("com.selim.activityswitch.RegisterActivity");
                    startActivity(i);
                    finish();
                }
            });

            exitBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.os.Process.killProcess(android.os.Process.myPid());
                    finish();
                    System.exit(0);
                }
            });
    }
}


/*
@Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginBtn:
                Toast.makeText(this, "Login Button Pressed", Toast.LENGTH_LONG).show();

                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.registerBtn:
                Toast.makeText(this, "Register Button Pressed", Toast.LENGTH_LONG).show();
                Intent ir = new Intent(this, RegisterActivity.class);
                startActivity(ir);
                finish();
                break;
        }
    }
 */