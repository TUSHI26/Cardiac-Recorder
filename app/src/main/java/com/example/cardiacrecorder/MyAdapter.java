package com.example.cardiacrecorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * creating an adapter class for recycler view
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<User> list;

    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        /**
         * getting the data into holder
         */

        User user = list.get(position);
        holder.date.setText(user.getDate());
        holder.time.setText(user.getTime());
        holder.systolic.setText(user.getSystol());
        holder.diastolic.setText(user.getDiastol());
        holder.pulse.setText(user.getPuls());
        holder.comment.setText(user.getComment());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        /**
         * declaring the variables which  we want to show in the recycler view
         */
        TextView date,time,systolic,diastolic,pulse,comment;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.currentdate);
            time = itemView.findViewById(R.id.currenttime);
            systolic = itemView.findViewById(R.id.viewsystolic);
            diastolic = itemView.findViewById(R.id.viewdiastolic);
            pulse = itemView.findViewById(R.id.viewpulse);
            comment = itemView.findViewById(R.id.viewcomment);
        }
    }

}
