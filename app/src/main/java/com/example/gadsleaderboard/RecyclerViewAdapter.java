package com.example.gadsleaderboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.learnerViewHolder> {
    private ArrayList<Learners> gadslearners;
    private Context mContext;
    public RecyclerViewAdapter(Context mContext, ArrayList<Learners> gadslearners) {
        this.mContext = mContext;
        this.gadslearners = gadslearners;
    }

    @NonNull
    @Override
    public learnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.list_row, parent, false);
        return new learnerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull learnerViewHolder holder, int position) {
        holder.name.setText(gadslearners.get(position).getLearner_name());
        holder.hours.setText(gadslearners.get(position).getLearner_details());
        holder.logo.setImageResource(gadslearners.get(position).getLearner_img());
    }

    @Override
    public int getItemCount() {
        return gadslearners.size();
    }

    public class learnerViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView logo;
        TextView hours;

        public learnerViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.learnerName);
            hours = itemView.findViewById(R.id.learningHours);
            logo = itemView.findViewById(R.id.topLearnerlogo);
        }
    }
}
