package com.cquiz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import android.content.Context;
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
        db.execSQL("create table" + Table_Name +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, QUESTION TEXT , ANSWER1" +
                " TEXT , ANSWER2 TEXT,ANSWER3 TEXT, ANSWER4 TEXT , CORRECT_ANSWER INTEGER ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists " + Table_Name);
    }
}
