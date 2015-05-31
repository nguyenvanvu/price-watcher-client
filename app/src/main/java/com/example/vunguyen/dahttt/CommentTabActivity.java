package com.example.vunguyen.dahttt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Comment;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/28/2015.
 */
public class CommentTabActivity  extends Fragment {

    private static View mView;
    private ListView listViewComment;
    private CommentAdapter commentAdapter = null;
    private ArrayList<CommentAdapter.Comment> commentArrayList = null;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        mView = inflater.inflate(R.layout.activity_comment, container, false);

        commentArrayList = new ArrayList<CommentAdapter.Comment>();

        listViewComment = (ListView)mView.findViewById(R.id.listViewComment);
        commentAdapter = new CommentAdapter(this.getActivity(), R.layout.comment_item_layout,commentArrayList);
        listViewComment.setAdapter(commentAdapter);

        commentArrayList.add(new CommentAdapter.Comment("Vu Nguyen", "avatar_maleuser",  "02/25/2015","test comment"));
        commentArrayList.add(new CommentAdapter.Comment("Vu Nguyen", "avatar_maleuser",  "02/25/2015","test comment"));
        commentArrayList.add(new CommentAdapter.Comment("Vu Nguyen", "avatar_maleuser",  "02/25/2015","test comment"));
        commentArrayList.add(new CommentAdapter.Comment("Vu Nguyen", "avatar_maleuser",  "02/25/2015","test comment"));
        commentAdapter.notifyDataSetChanged();

        return mView;

    }
}
