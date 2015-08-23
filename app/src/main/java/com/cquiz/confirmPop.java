package com.cquiz;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tushar on 8/17/2015.
 */
public class confirmPop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int Width=dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(Width*.8),(int)(height*.5));

    }

    public void onpopbtnclick(View v){
        Intent I = new Intent(this,EasyC.class);
        startActivity(I);
        finish();

    }
}
