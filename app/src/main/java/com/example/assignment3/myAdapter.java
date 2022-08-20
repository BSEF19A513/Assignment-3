package com.example.assignment3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.assignment3.*;

import java.util.ArrayList;

public class myAdapter extends ArrayAdapter<StudentModel> {
    public myAdapter(@NonNull Context context, ArrayList<StudentModel> studentsArrayList) {
        super(context,0, studentsArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        StudentModel studentModel = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.db_customize_view,parent,false);
        TextView textViewName = convertView.findViewById(R.id.nameTextView);
        TextView textViewRoll = convertView.findViewById(R.id.rollTextView);
        textViewName.setText(studentModel.getName());
        textViewRoll.setText(studentModel.getRollNmber());
        return convertView;
    }
}
