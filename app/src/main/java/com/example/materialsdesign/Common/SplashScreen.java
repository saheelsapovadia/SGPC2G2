package com.example.materialsdesign.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.materialsdesign.Common.LoginSignup.LoginSignupStartup;
import com.example.materialsdesign.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread thread = new Thread(){

            public void run(){
                try{
                    sleep(1500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this, LoginSignupStartup.class);
                    startActivity(intent);
                    finish();
                }
            }

        };thread.start();
    }
}