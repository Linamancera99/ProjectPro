package com.example.projectpro.UI.projectDetail;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectpro.R;
import com.example.projectpro.data.model.SelectedProject;

import java.util.ArrayList;

public class ProjectDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);

        RecyclerView recyclerView = findViewById(R.id.recycler_tasks);
        TasksAdapter adapter = new TasksAdapter(new ArrayList<>());
        recyclerView.setAdapter(adapter);
        adapter.updateData(SelectedProject.getInstance().getValue().getTareas());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TextView title = findViewById(R.id.text_view_title);
        TextView description = findViewById(R.id.text_view_description);
        TextView initialDate = findViewById(R.id.text_view_initial_date);
        TextView finalDate = findViewById(R.id.text_view_final_date);

        title.setText(SelectedProject.getInstance().getValue().getNombreProyecto());
        description.setText(SelectedProject.getInstance().getValue().getDescripcion());
        initialDate.setText(SelectedProject.getInstance().getValue().getFechaInicio());
        finalDate.setText(SelectedProject.getInstance().getValue().getFechaFin());

        findViewById(R.id.button_submit).setOnClickListener(view -> {
            finish();
        });
    }
}
