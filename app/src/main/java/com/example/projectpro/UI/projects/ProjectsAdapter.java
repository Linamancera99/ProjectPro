package com.example.projectpro.UI.projects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectpro.R;
import com.example.projectpro.data.model.ProjectModel;

import java.util.List;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder> {

    private List<ProjectModel> projects;
    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public ProjectsAdapter(List<ProjectModel> projects) {
        this.projects = projects;
    }

    public void updateData(List<ProjectModel> projects) {
        this.projects = projects;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProjectModel project = projects.get(position);
        holder.titleTextView.setText(project.getNombreProyecto());
        holder.tasksTextView.setText(String.valueOf(project.getTareas().size()));
        holder.itemView.setOnClickListener(v -> listener.onItemClick(position));
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView tasksTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_title);
            tasksTextView = itemView.findViewById(R.id.text_total);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
