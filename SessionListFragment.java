package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by win10 on 5/1/2016.
 */
public class SessionListFragment extends ListFragment {

    String[] SessList = new String[]{"Session 1          3/1/16",
            "Session 2          3/3/16",
            "Session 3          3/10/16",
            "Session 4          3/17/16",
            "Session 5          5/1/16"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, SessList);
        setListAdapter(adapter);

        return view;
    }

}