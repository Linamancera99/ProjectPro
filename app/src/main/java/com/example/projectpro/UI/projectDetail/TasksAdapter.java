package com.example.projectpro.UI.projectDetail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectpro.R;
import com.example.projectpro.data.model.TaskModel;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder> {

    private List<TaskModel> tasks;
    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public TasksAdapter(List<TaskModel> projects) {
        this.tasks = projects;
    }

    public void updateData(List<TaskModel> projects) {
        this.tasks = projects;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TaskModel task = tasks.get(position);
        holder.titleTextView.setText(task.getNombreTarea());
        holder.checkTask.setChecked(false);
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        CheckBox checkTask;

        public ViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_task);
            checkTask = itemView.findViewById(R.id.check_task);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
