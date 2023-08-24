package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    Button register;
    EditText fname,lname,dob,email,ph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = this.findViewById(R.id.btnRegister);
        fname = this.findViewById(R.id.firstname);
        lname = this.findViewById(R.id.lastname);
        dob = this.findViewById(R.id.dob);
        email = this.findViewById(R.id.email);
        ph = this.findViewById(R.id.phone);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registered Successfully"+" Now you can Login",Toast.LENGTH_LONG).show();
                Intent login= new Intent(getApplicationContext(), com.example.myapplication.login.class);
                startActivity(login);
            }
        });
    }
}