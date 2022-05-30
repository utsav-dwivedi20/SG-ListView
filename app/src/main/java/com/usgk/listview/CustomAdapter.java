package com.usgk.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<String> {

    Activity context; //Class
    String[] names;
    Integer[] images;

    public CustomAdapter(@NonNull Context context, String[] names,Integer[] images) {
        super(context, R.layout.customview,names);

        this.context = (Activity) context;
        this.names = names;
        this.images = images;
    }

    public View getView(int i, View view, ViewGroup viewGroup){

        LayoutInflater inflater = context.getLayoutInflater();
        View view1 = inflater.inflate(R.layout.customview,viewGroup,false);

        TextView textView = view1.findViewById(R.id.names);
        ImageView imageView = view1.findViewById(R.id.imageView);



        textView.setText(names[i]);
        imageView.setImageResource(images[i]);

    return view1;
    }
}
