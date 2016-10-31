package com.example.nayan.myfragmentproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by NAYAN on 10/19/2016.
 */
public class MyFragment2 extends Fragment implements MyInterface{
    @Nullable
    TextView textView;
    View view;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainActivity.getInstance().setCountinterface(this);
        view=inflater.inflate(R.layout.my_fragment_2,container,false);
        textView= (TextView) view.findViewById(R.id.txt1);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
//    public void changetData(String data){
//        textView.setText(data);
//    }

    @Override
    public void countClick(String data) {
        textView.setText(data);

    }
}
