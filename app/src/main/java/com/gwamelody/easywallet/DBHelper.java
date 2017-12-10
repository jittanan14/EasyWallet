package com.gwamelody.easywallet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import com.gwamelody.easywallet.Model.incom;

import java.util.ArrayList;

/**
 * Created by Gwa Melody on 9/12/2560.
 */

public class DBHelper extends SQLiteOpenHelper {

    private SQLiteDatabase sql;

    private static final String DATABASE_NAME = "DBincom";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "income";
    private static final String ID = BaseColumns._ID;
    private static final String COL_DETAIL = "Details";
    private static final String COL_NUMBER = "Number";



    public DBHelper(Context context) {
        super(context, TABLE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_DETAIL + " TEXT, "
                +COL_NUMBER+" TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME );
        onCreate(db);

    }

    public void addAnimal(incom income){

        sql = this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(COL_DETAIL,income.getDetail() );
        values.put(COL_NUMBER,income.getNumber());

        sql.insert(TABLE_NAME,null,values);
        sql.close();

    }
    public ArrayList<incom> getincom(){
        ArrayList<incom> am = new ArrayList<>();
        incom a = new incom();
        sql = this.getWritableDatabase();

        Cursor c;
        c= sql.query(TABLE_NAME,null,null,null,null,null,null,null);
        if(c!=null)
            c.moveToFirst();
        while(!c.isAfterLast()){
            am.add(new incom(c.getString(1),c.getInt(2)));
            c.moveToNext();
        }
        sql.close();
        return am;
    }

}

//create table TABLE_NAME (COL_NAME TYPE +...)
