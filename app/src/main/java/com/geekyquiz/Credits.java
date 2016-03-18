package com.geekyquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Credits extends AppCompatActivity {

    private LinearLayout mTushar, mPoonam, mNimish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        mTushar = (LinearLayout) findViewById(R.id.tushar);
        mPoonam = (LinearLayout) findViewById(R.id.poonam);
        mNimish = (LinearLayout) findViewById(R.id.nimesh);
        mTushar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLinkedin("https://in.linkedin.com/in/tushar-saha-86a9bb73");
            }
        });
        mPoonam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLinkedin("https://in.linkedin.com/in/poonam-yadav-1245795b");
            }
        });
        mNimish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLinkedin("https://in.linkedin.com/in/nimish-devasthali-a6655758");
            }
        });
    }

    public void openLinkedin(String url){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

}
