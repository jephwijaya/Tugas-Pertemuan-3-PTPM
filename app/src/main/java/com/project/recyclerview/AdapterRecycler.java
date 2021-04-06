package com.project.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<ViewHolder>{
    ArrayList<Model> data;
    Context context;
    public AdapterRecycler(ArrayList<Model> data, Context context)

    {
        this.data = data;
        this.context=context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.row_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position)
    {
        final Model temp = data.get(position);

        holder.tv_title.setText(data.get(position).getTitle());
        holder.tv_desc.setText(data.get(position).getDesc());
        holder.iv_logo.setImageResource(data.get(position).getLogo());
        holder.iv_share.setImageResource(data.get(position).getShare());

        holder.iv_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("IV_LOGO",temp.getLogo());
                i.putExtra("TITLE",temp.getTitle());
                i.putExtra("DESC",temp.getDesc());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });

        holder.iv_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,temp.getDesc());
                sendIntent.setType("text/plain");
                sendIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(shareIntent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
}
