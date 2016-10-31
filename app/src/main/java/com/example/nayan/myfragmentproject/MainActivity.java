package com.example.nayan.myfragmentproject;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCount;
    int count = 0;
    MyInterface myInterface;
    MyInterface myInterface1;
    private static MainActivity instance;

    public static MainActivity getInstance() {

        return instance;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
        btnCount = (Button) findViewById(R.id.btnCount);
        btnCount.setOnClickListener(this);
        MyFragment1 myFragment1 = new MyFragment1();
        MyFragment2 myFragment2 = new MyFragment2();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment, myFragment2);
        transaction.add(R.id.fragment1, myFragment1);
        transaction.commit();


    }

    public void setCountinterface(MyInterface myInterface) {
        this.myInterface = myInterface;
    }
    public void setCountinterface1(MyInterface myInterface) {
        this.myInterface1 = myInterface;
    }


    @Override
    public void onClick(View v) {
        count++;
        myInterface.countClick("the click was " + count + " times");
        myInterface1.countClick("the click were " + (count +1)+ " times");
    }

}
