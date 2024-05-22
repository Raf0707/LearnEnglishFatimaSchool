package com.example.learnenglish.ui.registration;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.R;

public class RegistrationActivity extends AppCompatActivity {
    private Button log;
    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        log = findViewById(R.id.logInBtn);
        sign = findViewById(R.id.signUpBtn);
        log.setOnClickListener(v -> {
           Intent intent = new Intent(this, LogActivity.class);
           startActivity(intent);
        });
        sign.setOnClickListener(v->{
            Intent intent=new Intent(this, SignActivity.class);
             startActivity(intent);

        });
    }
}