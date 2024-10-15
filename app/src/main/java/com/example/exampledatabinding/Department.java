package com.example.exampledatabinding;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.exampledatabinding.databinding.ActivityMainBinding;

public class Department extends BaseObservable {
    public String name;
    public String head_of_department;

    private ActivityMainBinding mainBinding;

    public Department(ActivityMainBinding mainBinding) {
        this.mainBinding = mainBinding;
    }

    public Department(String name, String head_of_department) {
        this.name = name;
        this.head_of_department = head_of_department;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getHead_of_department() {
        return head_of_department;
    }

    public void setHead_of_department(String head_of_department) {
        this.head_of_department = head_of_department;
        notifyPropertyChanged(BR.head_of_department);
    }

    public void showName(View view){
        String name = getName();
        mainBinding.text1.setText(name);
    }
    public void showHod(View view){
        String hod = getHead_of_department();
        mainBinding.text2.setText(hod);
    }
}
