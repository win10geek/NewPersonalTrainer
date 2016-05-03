package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

/**
 * Created by win10 on 4/30/2016.
 */
public class MenuFragment extends Fragment {

        public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.menu_fragment,
                container, false);

        // Go to proper intent based on key pressed
        view.findViewById(R.id.mbutton1).setOnClickListener(mGlobal_OnClickListener);
        view.findViewById(R.id.mbutton2).setOnClickListener(mGlobal_OnClickListener);
        view.findViewById(R.id.mbutton3).setOnClickListener(mGlobal_OnClickListener);
        view.findViewById(R.id.mbutton4).setOnClickListener(mGlobal_OnClickListener);

        view.findViewById(R.id.mbutton5).setOnClickListener(mGlobal_OnClickListener);
        view.findViewById(R.id.mbutton6).setOnClickListener(mGlobal_OnClickListener);
        view.findViewById(R.id.mbutton7).setOnClickListener(mGlobal_OnClickListener);


        return view;
    }

// Global Onclick listener for all views
    final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
    @Override

    public void onClick(View v) {
        Intent newIntent = null;
        switch (v.getId()) {
            case R.id.mbutton1:
                // Logoff
                Toast.makeText(getActivity(), "Logging You Off",
                        Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getActivity(), LogoffActivity.class);
                startActivity(intent1);
                break;
            case R.id.mbutton2:
                // Add Customer
                Intent intent2 = new Intent(getActivity(), AddCustActivity.class);
                startActivity(intent2);
                break;
            case R.id.mbutton3:
                // Customer List
                Intent intent3 = new Intent(getActivity(), CustListActivity.class);
                startActivity(intent3);
                break;
            case R.id.mbutton4:
                // Edit Customer
                Intent intent4 = new Intent(getActivity(), EditCustActivity.class);
                startActivity(intent4);
                break;
            case R.id.mbutton5:
                // Create Session List
                Intent intent5 = new Intent(getActivity(), SessionListActivity.class);
                startActivity(intent5);
                break;
            case R.id.mbutton6:
                // Add Session
                Intent intent6 = new Intent(getActivity(), AddSessionActivity.class);
                startActivity(intent6);
                break;
            case R.id.mbutton7:
                // Complete Session
                Intent intent7 = new Intent(getActivity(), CompleteSessionActivity.class);
                startActivity(intent7);
                break;
        }

    }
};
}
