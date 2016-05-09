package com.android.johnbalderson.mypersonaltrainer;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by win10 on 4/28/2016.
 */
public class ListCustActivity extends FragmentActivity {



    private ArrayList<String> results = new ArrayList<String>();
    private SQLiteDatabase newDB;
    private String tableName = "customer";

    @Override
    @SuppressWarnings("deprecation")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_names);

        openAndQueryDatabase();

        displayResultList();
    }


       private void openAndQueryDatabase() {
           try {
               MyDBHandler dbHelper = new MyDBHandler(this.getApplicationContext());
               newDB = dbHelper.getReadableDatabase();
               Cursor c = newDB.rawQuery("SELECT name FROM customer", null);


               if (c != null) {
                   if (c.moveToFirst()) {
                       do {
                           String custName = c.getString(c.getColumnIndex("name"));
                           results.add(custName);
                       } while (c.moveToNext());
                   }
               }
           } catch (SQLiteException se) {
               Log.e(getClass().getSimpleName(), "Could not create or Open the database");
           } finally {
               //if (newDB != null)
               //    newDB.execSQL("DELETE FROM " + tableName);
               newDB.close();
           }
       }

    private void displayResultList() {
        TextView tView = new TextView(this);
        ListView list = (ListView)findViewById(R.id.contentlist);
        tView.setText("Customer Names");
        list.addHeaderView(tView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, results);
        list.setTextFilterEnabled(true);
        list.setAdapter(adapter);

    }

}




