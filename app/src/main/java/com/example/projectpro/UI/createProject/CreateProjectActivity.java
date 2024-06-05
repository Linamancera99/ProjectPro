package com.example.projectpro.UI.createProject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
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
        viewModel.getUsers();
    }

    private void addObservers() {
        Spinner spinner = findViewById(R.id.spinner_users);

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
            TextInputEditText inputUser = findViewById(R.id.input_usuario);

            viewModel.createProject(
                    inputName.getText().toString(),
                    inputInitialDate.getText().toString(),
                    inputFinalDate.getText().toString(),
                    inputDescription.getText().toString(),
                    inputUser.getText().toString()
            );
        });
        viewModel.getUsersObservable().observe(this, result -> {

            String[] nombres = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                nombres[i] = result.get(i).getNombre();
            }

            spinner.setAdapter(new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, nombres));
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    viewModel.setUserSelected(i);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        });
    }
}
