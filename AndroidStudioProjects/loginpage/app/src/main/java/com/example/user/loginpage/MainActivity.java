package com.example.user.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;

    private String etusername;
    private String etpassword;

    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextUserName = (EditText) findViewById(R.id.user);
        etusername = editTextUserName.getText().toString();
        EditText editTextPassword = (EditText)findViewById(R.id.pass);
        etpassword = editTextPassword.getText().toString();
        login = (Button) findViewById(R.id.Lo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLogin();
            }
        });



    }

    public void setLogin() {
        etusername = username.getText().toString().trim();
        etpassword = password.getText().toString().trim();
        if (!validate()){
            Toast.makeText(this,"Invalid Name",Toast.LENGTH_SHORT).show();
        }else{
            onSignupSuccess();
        }


    }
    public boolean validate(){
        boolean valid = true;
        if (etpassword.isEmpty() || etusername.isEmpty()) {
            Toast.makeText(this, "Invalid Name", Toast.LENGTH_SHORT).show();
            valid = false;
        }
        return valid;

    }
    public void onSignupSuccess(){
        //TODO WHAT WILL GO AFTER SIGHNUP
    }
}
