package com.chatton.marina.holdall.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.chatton.marina.holdall.R;

public class TxtFragment extends Fragment {
    public static final String ARG_TXT = "txt";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_txt, container, false);
        if(getArguments()!=null){
            setTextviewText(getArguments().getString(ARG_TXT));
        }
        return view;
    }

    public void setBundle(String string){
        Bundle args = new Bundle();
        args.putString(TxtFragment.ARG_TXT, string);
        setArguments(args);
    }

    public void setTextviewText(String string){
        TextView textView = (TextView) view.findViewById(R.id.fragment_txt);
        textView.setText(string);
    }
}
