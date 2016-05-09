package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
    }
}
