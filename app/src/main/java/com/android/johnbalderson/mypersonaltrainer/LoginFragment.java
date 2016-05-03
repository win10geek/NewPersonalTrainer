package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by win10 on 4/30/2016.
 */
public class LoginFragment extends Fragment {

    ViewGroup vg;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    vg = (ViewGroup ) inflater.inflate (R.layout.login_fragment, null);




        return vg;
    }
}
