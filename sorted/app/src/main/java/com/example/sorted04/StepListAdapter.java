package com.example.sorted04;
import android.app.LauncherActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StepListAdapter extends RecyclerView.Adapter<StepListAdapter.StepListHolder> {
    private ArrayList<String> etapes_list = new ArrayList<String>();


    @NonNull
    @Override
    public StepListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StepListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.log_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StepListHolder holder, int position) {
        holder.etapes.setText(etapes_list.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return etapes_list.size();
    }

    public void setList(ArrayList<String>  etapes_list ){
        this.etapes_list= etapes_list;

        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return (null != etapes_list ? etapes_list.size() : 0);
    }

    public class StepListHolder extends RecyclerView.ViewHolder {
        TextView etapes ;
        public StepListHolder(@NonNull View itemView) {
            super(itemView);
            etapes =itemView.findViewById(R.id.txt_log);
        }
    }


}
