package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by win10 on 5/2/2016.
 */
public class LogoffActivity extends FragmentActivity {

    Button mLogoffButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoff_fragment);

        mLogoffButton = (Button) findViewById(R.id.btnLogoff);
        mLogoffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                System.exit(0);
        }
    });
}
}
