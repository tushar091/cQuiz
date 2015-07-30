package com.cquiz;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class EasyC extends ActionBarActivity {

    private final String tag = "2nd";
    public int id=1;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_c);
        TextView txtQno = (TextView)findViewById(R.id.txtQno);
        TextView txtQue = (TextView)findViewById(R.id.txtQues);
        txtQno.setText("Question 1");
        id=1;
        txtQue.setText("can we initialize variable size Array");

        SharedPreferences s = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = s.getBoolean("Firstrun", true);
        ExternalDbOpenHelper d = new ExternalDbOpenHelper(this);
        if(isFirstRun)
        {
            d.insertdata();
            SharedPreferences.Editor editor = s.edit();
            editor.putBoolean("Firstrun",false);
            editor.commit();
        }
        showQues(id);
        Log.d(tag, "onpause");
    }

    public void onbuttonclick(View V)
    {
        id++;
        showQues(id);
    }

    public void showQues(int id)
    {
        ExternalDbOpenHelper d = new ExternalDbOpenHelper(this);
        TextView txtQno = (TextView)findViewById(R.id.txtQno);
        TextView txtQue = (TextView)findViewById(R.id.txtQues);
        //int id=1;

        //boolean op = d.insertdata(id);
       /*  if(op)
            Toast.makeText(EasyC.this,"Successfull",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(EasyC.this,"UnSuccessfull",Toast.LENGTH_LONG).show();*/

        Cursor c = d.getData(id);
       /* if(c.getCount()== 0)
        {
            Toast.makeText(EasyC.this,"unSuccessfull",Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(EasyC.this,"Successfull",Toast.LENGTH_LONG).show();*/

        StringBuffer s = new StringBuffer();
        while(c.moveToNext()) {
            s.append(c.getString(1));
            txtQue.setText(s.toString());
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onpause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart");
    }

    @Override
    protected void onStop() {
        Log.d(tag, "onstop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(tag,"onstop");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_easy_c, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
