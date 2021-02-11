package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextPassword2;

    String name;
    String email;
    String password;
    String password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the EditText boxes for each field
        editTextName = findViewById(R.id.name);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextPassword2 = findViewById(R.id.password2);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // retrieve the form fields
                name = editTextName.getText().toString();
                Log.e("name", name);

                email = editTextEmail.getText().toString();
                Log.e("email", email);

                password = editTextPassword.getText().toString();
                Log.e("password", password);

                password2 = editTextPassword2.getText().toString();
                Log.e("password2", password2);

                // error checking

            }
        });

    }
}