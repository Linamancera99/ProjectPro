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

import com.example.projectpro.R;

public class ProjectFragment extends Fragment {

    private ProjectsViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ProjectsViewModel();
        viewModel.fetchProjects();
        viewModel.getProjects().observe(getViewLifecycleOwner(), projectModels -> {
            Log.d("working", "working");
            Toast.makeText(getContext(), "works", Toast.LENGTH_SHORT).show();
        });
    }
}
