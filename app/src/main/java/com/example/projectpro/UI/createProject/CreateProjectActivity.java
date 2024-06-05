package com.example.projectpro.UI.createProject;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectpro.R;
import com.google.android.material.textfield.TextInputEditText;

public class CreateProjectActivity extends AppCompatActivity {

    private CreateProjectViewModel viewModel = new CreateProjectViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        addObservers();
    }

    private void addObservers() {
        viewModel.getProjectCreated().observe(this, result -> {
            if (result) {
                Toast.makeText(this, "Proyecto creado", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        findViewById(R.id.button_create_project).setOnClickListener(view -> {
            TextInputEditText inputName = findViewById(R.id.input_name);
            TextInputEditText inputInitialDate = findViewById(R.id.input_initial_date);
            TextInputEditText inputFinalDate = findViewById(R.id.input_final_date);
            TextInputEditText inputDescription = findViewById(R.id.input_description);
            viewModel.createProject(
                    inputName.getText().toString(),
                    inputInitialDate.getText().toString(),
                    inputFinalDate.getText().toString(),
                    inputDescription.getText().toString()
            );
        });
    }
}
