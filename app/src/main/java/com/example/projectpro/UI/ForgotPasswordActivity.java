package com.example.projectpro.UI;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projectpro.R;


public class ForgotPasswordActivity extends Activity {

    private EditText emailInput;
    private Button sendCodeButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        emailInput = findViewById(R.id.emailInput);
        sendCodeButton = findViewById(R.id.sendCodeButton);

        sendCodeButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();

            if (email.isEmpty()) {
                Toast.makeText(ForgotPasswordActivity.this, "Por favor, ingrese su correo electrónico", Toast.LENGTH_SHORT).show();
            } else {
                // Aquí puedes añadir tu lógica de envío de código de recuperación
                Toast.makeText(ForgotPasswordActivity.this, "Código de recuperación enviado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
