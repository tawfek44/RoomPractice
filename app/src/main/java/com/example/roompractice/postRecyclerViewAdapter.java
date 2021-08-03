package com.example.roompractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class postRecyclerViewAdapter extends RecyclerView.Adapter<postRecyclerViewAdapter.postViewHolder>{

    List<Post> posts=new ArrayList<>();
    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new postViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
        holder.title.setText(posts.get(position).getTitle());
        holder.body.setText(posts.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
    public void setposts (List<Post> posts)
    {
        this.posts=posts;
    }
    public class postViewHolder extends RecyclerView.ViewHolder {
        TextView title,body;
        public postViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.titleTV);
            body=itemView.findViewById(R.id.bodyTV);
        }
    }
}
