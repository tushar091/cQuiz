package com.cquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by tushar on 7/19/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    public static String DB_Path = "C:\\Users\\tushar\\AndroidStudioProjects\\cQuiz2\\app\\src\\main\\assets\\CQuizdb";
    private SQLiteDatabase mydatabase;
    private static String DB_NAME = "CQuizdb";
    private final Context myContext;

    public DatabaseHelper(Context context) {

        super(context, DB_NAME, null, 1);
        this.myContext = context;
    }
    private boolean checkDataBase(){

        SQLiteDatabase checkDB = null;

        try{
            String myPath = DB_Path + DB_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

        }catch(SQLiteException e){

            //database does't exist yet.

        }

        if(checkDB != null){

            checkDB.close();

        }

        return checkDB != null ? true : false;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
