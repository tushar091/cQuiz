package com.cquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class EasyC extends ActionBarActivity {

    private final String tag = "2nd";
    public int id=0;
    public TextView txtQno;
    public RadioGroup rg;
    public RadioButton rb1;
    public RadioButton rb2;
    public RadioButton rb3;
    public RadioButton rb4;
    public static Integer a=0;
    int[] ans = new int[10];
    int[] corans = new int[10];
    public int count=0;
    public int min = 9;
    public int sec = 59;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_c);
        Timer();
        txtQno = (TextView)findViewById(R.id.txtQno);
        TextView txtQue = (TextView)findViewById(R.id.txtQues);
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
        onbuttonclick(findViewById(R.id.button5));


    }
    private void Timer() {
        final TextView timer  = (TextView)findViewById(R.id.txttimer);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            private long startTime = System.currentTimeMillis();
            public void run() {
                 int i,j;
                for(j=9;j>=0;j--) {

                    for (i = 60; i > 0; i--) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.post(new Runnable() {
                            public void run() {

                                timer.setText(min + ":" + sec);
                                sec--;
                            }
                        });
                    }

                    if(i==0 && j == 0)
                    {
                        try {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    onsubmitbuttonclick(findViewById(R.id.button4));
                                }
                            });
                        }
                        catch (Exception ex)
                        {
                            Log.d("FinalEx",ex.toString());
                        }
                    }
                    min--;
                    sec=60;

                }

            }
        };
        new Thread(runnable).start();
    }



    public int j=0,k=0;

    public void onsubmitbuttonclick(View v)
    {
        Ans();
        for(int i=0;i<10;i++)
        {
            if(ans[i]==corans[i] && ans[i] != 0)
            {
                count++;
            }
        }
        Toast.makeText(EasyC.this,"count " + count + "j " + j + "k " + k,Toast.LENGTH_LONG).show();
        Intent I = new Intent(this,result.class);
        I.putExtra("result",count);
        startActivity(I);
        finish();
    }
    public void onbuttonclick(View V)
    {
        id++;
        showQues(id);
        Ans();
        rg.clearCheck();
        if(id==10)
        {
            Button btn = (Button)findViewById(R.id.button5);
            btn.setEnabled(false);

        }
    }

    private void Ans() {
        if(rg.getCheckedRadioButtonId() != -1) {
            int id1 = rg.getCheckedRadioButtonId();
            View radioButton = rg.findViewById(id1);
            int selected = rg.indexOfChild(radioButton);
            selected = selected + 1;
            ans[j]=selected;
            j++;
        }
    }

    public void showQues(int id)
    {
        ExternalDbOpenHelper d = new ExternalDbOpenHelper(this);
        TextView txtQno = (TextView)findViewById(R.id.txtQno);
        TextView txtQue = (TextView)findViewById(R.id.txtQues);
        rg = (RadioGroup)findViewById(R.id.radio_group);

        rb1= (RadioButton)findViewById(R.id.radioAns1);
        rb2 = (RadioButton)findViewById(R.id.radioAns2);
        rb3 = (RadioButton)findViewById(R.id.radioAns3);
        rb4 = (RadioButton)findViewById(R.id.radioAns4);
        txtQno.setText("Question " + id);

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
            s.setLength(0);
            s.append(c.getString(2));
            rb1.setText(s.toString());
            s.setLength(0);
            s.append(c.getString(3));
            rb2.setText(s.toString());
            s.setLength(0);
            s.append(c.getString(4));
            rb3.setText(s.toString());
            s.setLength(0);
            s.append(c.getString(5));
            rb4.setText(s.toString());
            s.setLength(0);
            s.append(c.getString(6));
            a = Integer.parseInt(s.toString());

        }
        corans[k]=a;
        k++;


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
