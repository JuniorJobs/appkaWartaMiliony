package com.freevent.loginscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

    }
   private void initOnClickListeners(){

       findViewById(R.id.login_button).setOnClickListener(this);
   }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        int viewId= view.getId();
        if(viewId == (R.id.login_button)){
            EditText loginEditText  = (EditText) findViewById(R.id.login_edittext);
            String login = loginEditText.getText().toString();

            EditText passwordEditText = (EditText) findViewById(R.id.password_edittext);
            String password = passwordEditText.getText().toString();

            if(login.equals("admin") && password.equals("password")){
                Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Access denied :<", Toast.LENGTH_SHORT).show();
            }
        }
}
}
