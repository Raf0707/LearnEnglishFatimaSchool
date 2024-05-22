package com.example.learnenglish.ui.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.domain.database.DatabaseHelper;
import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.User;

public class SignActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName, editTextDateOfBirth, editTextEmail, editTextPhone, editTextPassword;
    private RadioGroup radioGroupGender;
    private Button buttonCreateAccount;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        // Initialize views
        editTextFirstName = findViewById(R.id.first);
        editTextLastName = findViewById(R.id.last);
        editTextDateOfBirth = findViewById(R.id.date);
        editTextEmail = findViewById(R.id.email);
        radioGroupGender = findViewById(R.id.gender);
        editTextPhone = findViewById(R.id.editTextPhone2);
        editTextPassword = findViewById(R.id.Password);
        buttonCreateAccount = findViewById(R.id.create);

        // Initialize database helper
        databaseHelper = new DatabaseHelper(this);

        // Set button click listener
        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount();
            }
        });
    }

    private void createAccount() {
        // Get input values
        String firstName = editTextFirstName.getText().toString().trim();
        String lastName = editTextLastName.getText().toString().trim();
        String dateOfBirth = editTextDateOfBirth.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        // Get selected gender
        int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
        RadioButton selectedGenderButton = findViewById(selectedGenderId);
        String gender = selectedGenderButton != null ? selectedGenderButton.getText().toString() : "";

        // Validate inputs
        if (firstName.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || gender.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create a new User object
        User user = new User(0, firstName, lastName, email, phone, gender, dateOfBirth, password);

        // Insert the user into the database
        long userId = databaseHelper.addUser(user);

        if (userId > 0) {
            Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show();
            // Navigate to another activity if needed
             Intent intent = new Intent(SignActivity.this, RegistrationActivity.class);
             startActivity(intent);
            //finish();
        } else {
            Toast.makeText(this, "Account creation failed", Toast.LENGTH_SHORT).show();
        }
    }
}
