package com.example.fuelxpressproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPassword;
    EditText editTextPhoneNo;
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextUsername = (EditText)findViewById(R.id.editTextUsername);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        editTextPhoneNo = (EditText)findViewById(R.id.editTextPhoneNo);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);



    }

    public void registerButtonClicked(View v) {
        String txtUserName = editTextUsername.getText().toString().trim();
        String txtPassword = editTextPassword.getText().toString().trim();
        String txtPhoneNo= editTextPhoneNo.getText().toString().trim();
        String txtEmail = editTextEmail.getText().toString().trim();

        if(txtUserName.isEmpty()) {
            editTextUsername.setError("Please Enter Username");
            editTextUsername.requestFocus();
        }

        if(txtPassword.isEmpty() || txtPassword.length() < 6) {
            editTextPassword.setError("Please Enter Password (containing min. 6 characters ) ");
            editTextPassword.requestFocus();
        }

        if(txtPhoneNo.isEmpty()) {
            editTextPhoneNo.setError("Please Enter Mobile Number ");
            editTextPhoneNo.requestFocus();
        }

        if(txtEmail.isEmpty()) {
            editTextEmail.setError("Please Enter Valid Email");
            editTextEmail.requestFocus();
        }

    }

}