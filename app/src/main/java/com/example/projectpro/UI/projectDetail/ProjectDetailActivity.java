package com.example.projectpro.UI.projectDetail;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectpro.R;
import com.example.projectpro.data.model.SelectedProject;

public class ProjectDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);
        TextView title = findViewById(R.id.text_project_name);
        title.setText(SelectedProject.getInstance().getValue().getNombreProyecto());
    }
}
