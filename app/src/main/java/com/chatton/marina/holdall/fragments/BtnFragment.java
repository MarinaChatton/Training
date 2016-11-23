package com.chatton.marina.holdall.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chatton.marina.holdall.R;

public class BtnFragment extends Fragment implements View.OnClickListener{
    private OnBtnClickListener listener = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_btn, container, false);
        Button button = (Button) view.findViewById(R.id.fragment_btn);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (OnBtnClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnBtnClickListener");
        }
    }

    public interface OnBtnClickListener {
        void onBtnClicked();
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onBtnClicked();
        }
    }
}
