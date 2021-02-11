package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextPassword2;

    TextView nameErrorMsg;
    TextView emailErrorMsg;
    TextView passwordErrorMsg;
    TextView password2ErrorMsg;

    String name;
    String email;
    String password;
    String password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText boxes for each field
        editTextName = findViewById(R.id.name);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextPassword2 = findViewById(R.id.password2);

        // error message TextViews for each field
        nameErrorMsg = findViewById(R.id.nameErrorMsg);
        emailErrorMsg = findViewById(R.id.emailErrorMsg);
        passwordErrorMsg = findViewById(R.id.passwordErrorMsg);
        password2ErrorMsg = findViewById(R.id.password2ErrorMsg);

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
                if (name.length() == 0) {
                    nameErrorMsg.setText("Required");
                } else {
                    nameErrorMsg.setText("");
                }

                if (email.length() == 0) {
                    emailErrorMsg.setText("Required");
                } else {
                    emailErrorMsg.setText("");
                }

                if (password.length() == 0) {
                    passwordErrorMsg.setText("Required");
                } else {
                    passwordErrorMsg.setText("");
                }

                if (password2.length() == 0) {
                    password2ErrorMsg.setText("Required");

                } else if(!password.equals(password2)) {
                    password2ErrorMsg.setText("Passwords must match");

                } else {
                    password2ErrorMsg.setText("");
                }

                // if there are no errors
                if((nameErrorMsg.length() == 0) && (emailErrorMsg.length() == 0) && (passwordErrorMsg.length() == 0) && (password2ErrorMsg.length() == 0)) {
                    // display welcome message
                    Toast.makeText(FormActivity.this, "Welcome " + name + "!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}