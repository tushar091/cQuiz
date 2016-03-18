package com.geekyquiz;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class result extends AppCompatActivity {
    public TextView txt;
    private ListView mResultList;
    private ListAdapter mListAdapter;
    private int[] mQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        int a = intent.getIntExtra("result", 0);
        mQuestions = intent.getIntArrayExtra("questions");
        txt.setText("" + a);
        mResultList = (ListView) findViewById(R.id.result_list);
        getCursor();

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public void onBackPressed() {
        Intent I = new Intent(this, MainActivity.class);
        startActivity(I);
        finish();
    }

    public void getCursor() {
        ExternalDbOpenHelper d = new ExternalDbOpenHelper(this);
        Cursor cursor = d.getData(mQuestions);
        mListAdapter = new ListAdapter(this, cursor, 0);
        mResultList.setAdapter(mListAdapter);
    }
}
