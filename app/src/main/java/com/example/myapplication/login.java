package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnlogin, btnregister;
    EditText user, pswrd;
    AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auto = this.findViewById(R.id.autoCompleteTextView);
        btnlogin = this.findViewById(R.id.buttonLogin);
        user = this.findViewById(R.id.login);
        pswrd = this.findViewById(R.id.password);
        btnregister = this.findViewById(R.id.buttonRegister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("Preeti") && pswrd.getText().toString().equals("12345")) {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();

                    Bundle myBundle= new Bundle();
                    myBundle.putString("USERNAME",user.getText().toString());
                    myBundle.putString("PASSWORD",pswrd.getText().toString());
                    Intent reg = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(reg,myBundle);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please enter a valid username and password", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You need to Register yourself", Toast.LENGTH_LONG).show();
                Intent reg = new Intent(getApplicationContext(), register.class);
                startActivity(reg);
            }
        });

    }
}


