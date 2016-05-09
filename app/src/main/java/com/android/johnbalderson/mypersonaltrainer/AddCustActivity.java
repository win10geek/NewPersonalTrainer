package com.android.johnbalderson.mypersonaltrainer;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by win10 on 5/2/2016.
 */

public class AddCustActivity extends FragmentActivity{

    EditText nameBox, addrBox, cityBox, stateBox, zipBox, cardnoBox, expmoBox, expyrBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcust_fragment);

        nameBox = (EditText) findViewById(R.id.Name);
        addrBox = (EditText) findViewById(R.id.Address);
        cityBox = (EditText) findViewById(R.id.City);
        stateBox = (EditText) findViewById(R.id.State);
        zipBox = (EditText)  findViewById(R.id.Zip);
        cardnoBox = (EditText) findViewById(R.id.cardno);
        expmoBox = (EditText)  findViewById(R.id.expmo);
        expyrBox = (EditText) findViewById(R.id.expyr);

    }

    public void newCustomer (View view) {
        // MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);
        MyDBHandler dbHandler = new MyDBHandler(this);



        Customer customer =
                new Customer(nameBox.getText().toString(),
                        addrBox.getText().toString(),
                        cityBox.getText().toString(),
                        stateBox.getText().toString(),
                        zipBox.getText().toString(),
                        cardnoBox.getText().toString(),
                        expmoBox.getText().toString(),
                        expyrBox.getText().toString()
                );

        dbHandler.addCustomer(customer);



        nameBox.setText("");
        addrBox.setText("");
        cityBox.setText("");
        stateBox.setText("");
        zipBox.setText("");
        cardnoBox.setText("");
        expmoBox.setText("");
        expyrBox.setText("");

    }

}

