package com.example.vunguyen.dahttt;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/31/2015.
 */
public class CommentAdapter extends ArrayAdapter<CommentAdapter.Comment> {

    private Activity context = null;
    private int resource;
    private ArrayList<Comment> arrayListComment = null;
    
    public static class Comment{
        public String name = "";
        public String avatarImg;
        public String date;
        public String comment;
        public Comment(String name, String avatarImg, String date, String comment){
            this.name = name;
            this.avatarImg = avatarImg;
            this.date = date;
            this.comment = comment;
        }

    }

    public CommentAdapter(Activity context, int resource, ArrayList<Comment> arrayListComment) {
        super(context, resource, arrayListComment);
        this.context = context;
        this.resource = resource;
        this.arrayListComment = arrayListComment;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(this.resource , parent, false);

        if (arrayListComment.size() > 0 && position >= 0) {
            final Comment comment = arrayListComment.get(position);

            final TextView textViewComment = (TextView)convertView.findViewById(R.id.textViewComment);
            textViewComment.setText(comment.comment);

            final ImageView imageViewAvatar = (ImageView)convertView.findViewById(R.id.imageViewAvatar);
            imageViewAvatar.setImageResource(context.getResources().getIdentifier(comment.avatarImg, "drawable", context.getPackageName()));

            final  TextView textViewDateComment =  (TextView)convertView.findViewById(R.id.textViewDateComment);
            textViewDateComment.setText(comment.date);

            final  TextView textViewName =  (TextView)convertView.findViewById(R.id.textViewName);
            textViewName.setText(comment.name);
        }
        return convertView;
    }
}
