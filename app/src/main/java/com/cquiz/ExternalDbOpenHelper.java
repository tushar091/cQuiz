package com.cquiz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.SQLException;
import android.util.Log;


/**
 * Created by tushar on 7/19/2015.
 */
public class ExternalDbOpenHelper extends SQLiteOpenHelper{
    public static final String DB_Name = "CQuiz";
    public static final String Table_Name = "Records";


    public ExternalDbOpenHelper(Context context) {
        super(context, DB_Name, null, 1);
       SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, QUESTION TEXT , ANSWER1" +
                " TEXT , ANSWER2 TEXT,ANSWER3 TEXT, ANSWER4 TEXT , CORRECT_ANSWER INTEGER ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists " + Table_Name);
    }

    public boolean insertdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c= new ContentValues();
        c.put("QUESTION","this is the first QUESTION");
        c.put("ANSWER1","this is ANSWER1");
        c.put("ANSWER2","this is ANSWER2");
        c.put("ANSWER3","this is ANSWER3");
        c.put("ANSWER4","this is ANSWER4");
        c.put("CORRECT_ANSWER","this is the CORRECT_ANSWER");
        long result = db.insert(Table_Name,null,c);
        if(result == -1)
        {
            return false;
        }
        return true;
    }

    public Cursor getData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from  Records where id = 1", null);
        return  res;
    }

}
