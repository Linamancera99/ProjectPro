package com.example.projectpro.UI;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
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
        Button myButton = findViewById(R.id.sendValidator);
        myButton.setVisibility(View.GONE);
        sendCodeButton.setVisibility(View.VISIBLE);

        sendCodeButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();

            if (email.isEmpty()) {
                Toast.makeText(ForgotPasswordActivity.this, "Por favor, ingrese su correo electrónico", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ForgotPasswordActivity.this, "Validando correo...", Toast.LENGTH_SHORT).show();

                if (!email.equals("linamancera99@gamil.com")) {
                    Toast.makeText(ForgotPasswordActivity.this, "El correo no existe...", Toast.LENGTH_SHORT).show();

                }else{
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Mostrar el Toast después de 1 segundo

                            Toast.makeText(ForgotPasswordActivity.this, "Codigo enviado: 4443", Toast.LENGTH_SHORT).show();
                            myButton.setVisibility(View.VISIBLE);
                            sendCodeButton.setVisibility(View.GONE);
                        }
                    }, 1000);
                }

            }
        });
    }
}
