package com.cquiz;

import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class EasyC extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_c);

        TextView txtQno = (TextView)findViewById(R.id.txtQno);
        txtQno.setText("Question 1");

        TextView txtQue = (TextView)findViewById(R.id.txtQues);
        txtQue.setText("can we initialize variable size Array");
        ExternalDbOpenHelper d= new ExternalDbOpenHelper(this);
       // boolean op = d.insertdata();
       /*  if(op)
            Toast.makeText(EasyC.this,"Successfull",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(EasyC.this,"UnSuccessfull",Toast.LENGTH_LONG).show();*/

        Cursor c = d.getData();
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
