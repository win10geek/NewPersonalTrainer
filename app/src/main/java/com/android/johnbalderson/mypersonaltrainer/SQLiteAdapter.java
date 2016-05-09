/*
package com.android.johnbalderson.mypersonaltrainer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class SQLiteAdapter {

    public static final String MYDATABASE_NAME = "customer.db";
    public static final String MYDATABASE_TABLE = "customers";
    public static final int MYDATABASE_VERSION = 1;
    public static final String KEY_ID = "_id";
    public static final String KEY_CONTENT = "Content";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_CITY= "city";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_ZIP = "zip";
    public static final String COLUMN_CARDNO = "cardno";
    public static final String COLUMN_EXPMO = "expmo";
    public static final String COLUMN_EXPYR = "expyr";
    String name, addr, city, state, zip, cardmo, expmo, expyr;

    //create table MY_DATABASE (ID integer primary key, Content text not null);
    private static final String SCRIPT_CREATE_DATABASE =
            "create table " + MYDATABASE_TABLE + " ("
                    + COLUMN_ID + " integer primary key autoincrement, "
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_ADDRESS + " TEXT,"
                    + COLUMN_CITY + " TEXT,"
                    + COLUMN_STATE + " TEXT,"
                    + COLUMN_ZIP + " TEXT,"
                    + COLUMN_CARDNO + " TEXT,"
                    + COLUMN_EXPMO+ " TEXT,"
                    + COLUMN_EXPYR + " TEXT" + ")";

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;

    private Context context;

    public SQLiteAdapter(Context c){
        context = c;
    }

    public SQLiteAdapter openToRead() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();
        return this;
    }

    public SQLiteAdapter openToWrite() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        sqLiteHelper.close();
    }

    public long insert(Customer customer){

        ContentValues contentValues = new ContentValues();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, customer.getName());
        values.put(COLUMN_ADDRESS, customer.getAddress());
        values.put(COLUMN_CITY, customer.getCity());
        values.put(COLUMN_STATE, customer.getState());
        values.put(COLUMN_ZIP, customer.getZip());
        values.put(COLUMN_CARDNO, customer.getCardno());
        values.put(COLUMN_EXPMO, customer.getCardno_mo());
        values.put(COLUMN_EXPYR, customer.getCardno_yr());
        // contentValues.put(KEY_CONTENT, content);
        return sqLiteDatabase.insert(MYDATABASE_TABLE, null, contentValues);
    }

    public int deleteAll(){
        return sqLiteDatabase.delete(MYDATABASE_TABLE, null, null);
    }

    public Cursor queueAll(){
        String[] columns = new String[]{KEY_ID, COLUMN_NAME};
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns,
                null, null, null, null, null);

        return cursor;
    }

    public class SQLiteHelper extends SQLiteOpenHelper {

        public SQLiteHelper(Context context, String name,
                            CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            db.execSQL(SCRIPT_CREATE_DATABASE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub
            db.execSQL("DROP TABLE IF EXISTS " + MYDATABASE_TABLE);
            onCreate(db);

        }

    }

}*/

