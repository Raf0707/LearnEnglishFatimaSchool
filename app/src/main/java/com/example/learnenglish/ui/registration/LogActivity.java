package com.example.learnenglish.ui.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.MainActivity;
import com.example.learnenglish.domain.database.DatabaseHelper;
import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.User;

public class LogActivity extends AppCompatActivity {

    private EditText editTextEmailOrPhone, editTextPassword;
    private Button buttonLogin;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        // Initialize views
        editTextEmailOrPhone = findViewById(R.id.phone_mail);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.login);

        // Initialize database helper
        databaseHelper = new DatabaseHelper(this);

        // Set button click listener
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        // Get input values
        String emailOrPhone = editTextEmailOrPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        // Validate inputs
        if (emailOrPhone.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        User user = databaseHelper.getUserByEmailOrPhone(emailOrPhone);
        if (user == null) {
            Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show();
            return;
        }

        // Check password
        if (!password.equals(user.getPassword())) {
            Toast.makeText(this, "Incorrect password", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(LogActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Close login activity
    }
// if (!emailOrPhone.matches(user.getPhone())|| !emailOrPhone.matches(user.getMail())) {
//        Toast.makeText(this, "Invalid email or phone format", Toast.LENGTH_SHORT).show();
//        return;
//    }
//    private boolean isValidEmailOrPhone(String emailOrPhone) {
//        private boolean isValidEmailOrPhone(String emailOrPhone) {
//            String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
//            String phonePattern = "\\d{10}";
//            if (emailOrPhone.matches(emailPattern)) {
//                return true;
//            }
//            if (emailOrPhone.matches(phonePattern)) {
//                return true;
//            }
//            return false;
//        }
//
//    }
}
