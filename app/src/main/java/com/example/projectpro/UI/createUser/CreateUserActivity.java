package com.example.projectpro.UI.createUser;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectpro.R;
import com.google.android.material.textfield.TextInputEditText;

public class CreateUserActivity extends AppCompatActivity {

    private CreateUserViewModel viewModel = new CreateUserViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        findViewById(R.id.button_create_user).setOnClickListener(view -> {
            TextInputEditText inputName = findViewById(R.id.input_name);
            TextInputEditText inputEmail = findViewById(R.id.input_email);
            TextInputEditText inputPassword = findViewById(R.id.input_password);

            viewModel.createUser(
                    inputName.getText().toString(),
                    inputEmail.getText().toString(),
                    inputPassword.getText().toString()
            );
        });

        viewModel.getUserCreated().observe(this, result -> {
            if (result) {
                Toast.makeText(this, "Usuario creado", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
