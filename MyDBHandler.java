
package com.android.johnbalderson.mypersonaltrainer;

/**
 * Created by win10 on 5/3/2016.
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "customer.db";
    private static final String TABLE_CUSTOMER = "customer";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_CITY= "city";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_ZIP = "zip";
    public static final String COLUMN_CARDNO = "cardno";
    public static final String COLUMN_EXPMO = "expmo";
    public static final String COLUMN_EXPYR = "expyr";


    // public MyDBHandler(Context context, String name,
    //                   SQLiteDatabase.CursorFactory factory, int version) {
    public MyDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CUSTOMER_TABLE = "CREATE TABLE " +
                TABLE_CUSTOMER + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_NAME + " TEXT,"
                + COLUMN_ADDRESS + " TEXT,"
                + COLUMN_CITY + " TEXT,"
                + COLUMN_STATE + " TEXT,"
                + COLUMN_ZIP + " TEXT,"
                + COLUMN_CARDNO + " TEXT,"
                + COLUMN_EXPMO+ " TEXT,"
                + COLUMN_EXPYR + " TEXT" + ")";

        db.execSQL(CREATE_CUSTOMER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUSTOMER);
        onCreate(db);
    }

    public void addCustomer(Customer customer) {

        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, customer.getName());
        values.put(COLUMN_ADDRESS, customer.getAddress());
        values.put(COLUMN_CITY, customer.getCity());
        values.put(COLUMN_STATE, customer.getState());
        values.put(COLUMN_ZIP, customer.getZip());
        values.put(COLUMN_CARDNO, customer.getCardno());
        values.put(COLUMN_EXPMO, customer.getCardno_mo());
        values.put(COLUMN_EXPYR, customer.getCardno_yr());


        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_CUSTOMER, null, values);
        db.close();
    }
}






