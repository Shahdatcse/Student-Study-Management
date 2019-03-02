package com.example.shahadathoshen.studentstudymanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    Context context;
    int[] image;
    String[] title;
    private LayoutInflater inflater;
    CustomAdapter(Context context,String[] title,int[] image){
    this.context = context;
    this.title = title;
    this.image = image;
}

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid, parent, false);
        }

      ImageView imageView = convertView.findViewById(R.id.imageHolder);
        TextView textView = convertView.findViewById(R.id.namePlacer);
        imageView.setImageResource(image[position]);
        textView.setText(title[position]);


        return convertView;

    }
}

