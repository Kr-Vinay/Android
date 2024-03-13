package com.example.quadriticapp;

import android.view.View;
import android.widget.TextView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadriticapp.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    TextView textView;


    public TextView getTextView() {
        return textView;
    }


    String a,b,c;
    ActivityMainBinding activityMainBinding;

    public MyEquation(String a, String b, String c, ActivityMainBinding activityMainBinding) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.activityMainBinding = activityMainBinding;

    }
    public MyEquation()
    {

    }

    public MyEquation(ActivityMainBinding activityMainBinding) {
    }

    @Bindable

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
@Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
@Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public ActivityMainBinding getActivityMainBinding() {
        return activityMainBinding;
    }

    public void setActivityMainBinding(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }
    public void solveEquation(View view)
    {
        int a =Integer.parseInt(getA());
        int b=Integer.parseInt(getB());
        int c=Integer.parseInt(getC());
        double D=b*b-4*a*c;
        double x1,x2;
        if (D>0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            activityMainBinding.textView.setText("x1=" + x1 + "x2=" + x2);
        } else if (D<0) {
            activityMainBinding.textView.setText("No real solutions");


        }
        else {
            x1 = -b / (2 * a);
            activityMainBinding.textView.setText("x1="+x1);

        }


    }

    }

