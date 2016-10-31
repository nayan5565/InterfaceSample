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
public class MyFragment1 extends Fragment{
    @Nullable
    TextView txtCount;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity.getInstance().setCountinterface1(new MyInterface() {
            @Override
            public void countClick(String data) {
                txtCount.setText(data);
            }
        });
        return inflater.inflate(R.layout.my_fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtCount = (TextView) getActivity().findViewById(R.id.txtCount);
    }
}
