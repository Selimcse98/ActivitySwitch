package com.selim.activityswitch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);

        registerBtn =(Button) findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.registerBtn){
            Toast.makeText(this, "Successfully Registered, back to Main page", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}
