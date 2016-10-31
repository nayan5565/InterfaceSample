package com.example.nayan.myfragmentproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by NAYAN on 10/19/2016.
 */
public class MyFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    @Nullable
    Button button;
    MyInterface myInterface;
    int counter=0;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myInterface= (MyInterface) getActivity();
        button=(Button)getActivity().findViewById(R.id.btnClick);
        button.setOnClickListener(this);
    }

//    public void setMyInterface(MyInterface myInterface){
//        this.myInterface=myInterface;
//    }

    @Override
    public void onClick(View v) {
        counter++;
        myInterface.countClick("the click was "+counter+" times");


    }
}
