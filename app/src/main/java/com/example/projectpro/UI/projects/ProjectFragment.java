package com.example.projectpro.UI.projects;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectpro.R;

import java.util.ArrayList;

public class ProjectFragment extends Fragment implements ProjectsAdapter.OnItemClickListener{

    private ProjectsViewModel viewModel;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ProjectsAdapter adapter = new ProjectsAdapter(new ArrayList<>());
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        viewModel = new ProjectsViewModel();
        viewModel.fetchProjects();

        viewModel.getProjects().observe(getViewLifecycleOwner(), projectModels -> {
            adapter.updateData(projectModels);
            adapter.notifyDataSetChanged();
            Log.d("working", "working");
        });
    }

    @Override
    public void onItemClick(int position) {
    
    }
}
