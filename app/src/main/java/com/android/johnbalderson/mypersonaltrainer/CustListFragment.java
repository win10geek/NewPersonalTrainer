package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by win10 on 5/2/2016.
 */
public class CustListFragment extends ListFragment {

    String[] CustList = new String[]{"Satya Nadella",
            "Prince Rogers Nelson",
            "Lady Gaga",
            "Katy Perry",
            "John Balderson"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, CustList);
        setListAdapter(adapter);

        return view;
    }

}