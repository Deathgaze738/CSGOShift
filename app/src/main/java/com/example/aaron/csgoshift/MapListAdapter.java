package com.example.aaron.csgoshift;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 06/03/2016.
 */
public class MapListAdapter extends ArrayAdapter<Integer> {
    Integer[] mList;
    public MapListAdapter(Context ctx, Integer[] mList){
        super(ctx, R.layout.map_list_button, mList);
        this.mList = mList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = new LinearLayout(getContext());
        String inflater = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(inflater);
        convertView = li.inflate(R.layout.map_list_button, parent, false);

        ImageButton img = (ImageButton)convertView.findViewById(R.id.imgBtn);
        img.setBackgroundResource(mList[position]);
        Log.d(this.getClass().getName(), "Added new Map");
        return convertView;
    }
}
