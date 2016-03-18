package com.geekyquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends Activity {
    private final String tag = "TKT";
    Point p;
    private Button mCredits;
    private Button mYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "oncreate");
        mCredits = (Button) findViewById(R.id.credits);
        mYoutube = (Button) findViewById(R.id.youtube);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Credits.class);
                startActivity(intent);
            }
        });
        mYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PL5E96052C98F478A1"));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onclick(View v) {
        if (p != null) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    showPopUp(MainActivity.this, p);
                }
            }, 100);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        int[] location = new int[2];
        Button button = (Button) findViewById(R.id.button);

        // Get the x, y location and store it in the location[] array
        // location[0] = x, location[1] = y.
        button.getLocationOnScreen(location);

        //Initialize the Point with x, and y positions
        p = new Point();
        p.x = location[0];
        p.y = location[1];
    }

    private void showPopUp(final Context context, Point p) {
        int popup_width = 450;
        int popup_height = 250;

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(context.LAYOUT_INFLATER_SERVICE);
        final View layout = layoutInflater.inflate(R.layout.pop, linearLayout);
        final PopupWindow popupWindow = new PopupWindow(context);

        final int OFFSET_X = 30;
        final int OFFSET_Y = 30;

        popupWindow.setContentView(layout);
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);

        popupWindow.setBackgroundDrawable(new BitmapDrawable());

        popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

        Button close = (Button) layout.findViewById(R.id.btnPop);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EasyC.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will1
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
