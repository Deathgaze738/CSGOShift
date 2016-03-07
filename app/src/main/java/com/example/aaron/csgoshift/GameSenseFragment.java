package com.example.aaron.csgoshift;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GameSenseFragment extends Fragment {

    ListView mapList;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_game_sense, container, false);
    }

    public void onViewCreated(View view, Bundle saveInstanceState){
        Log.d(this.getClass().getName(), "View Inflated");
        populateList(view);
    }

    private void populateList(View view){
        Integer[] list = {R.drawable.dust2_list,
                R.drawable.train_list,
                R.drawable.mirage_list,
                R.drawable.inferno_list,
                R.drawable.cobble_list,
                R.drawable.overpass_list,
                R.drawable.cache_list,
                R.drawable.nuke_list
        };
        mapList = (ListView)view.findViewById(R.id.map_list);
        mapList.setAdapter(new MapListAdapter(getActivity(), list));
        Log.d(this.getClass().getName(), "Map List Populated Successfully.");
    }
}
