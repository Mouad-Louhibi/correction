package com.mehditmimi.correctioncolle.presentation.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mehditmimi.correctioncolle.R;
import com.mehditmimi.correctioncolle.presentation.actions.AuthentificationAction;

public class MainActivity extends AppCompatActivity {

    private EditText emailInput;
    private EditText passwordInput;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailInput=findViewById(R.id.editTextTextPersonName);
        passwordInput=findViewById(R.id.editTextTextPassword);
        btn=findViewById(R.id.button);
        AuthentificationAction authentificationAction=new AuthentificationAction();
        authentificationAction.setMainActivity(this);
        btn.setOnClickListener(authentificationAction);
    }

    public EditText getEmailInput() {
        return emailInput;
    }

    public EditText getPasswordInput() {
        return passwordInput;
    }
}