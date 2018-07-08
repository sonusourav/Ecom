package com.vivek.loginpage.vivek;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.vivek.loginpage.R;

public class Launcher extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_launcher);




        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(Launcher.this, MainActivity.class);
                Launcher.this.startActivity(mainIntent);
                Launcher.this.finish();
            }
        }, 2000);

    }


}
