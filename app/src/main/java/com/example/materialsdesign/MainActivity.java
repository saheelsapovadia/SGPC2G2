package com.example.materialsdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.page_1:

                break;
            case R.id.page_2:
                break;
            case R.id.page_3:
                break;
            case R.id.page_4:
                Intent intent4 = new Intent(MainActivity.this,profile.class);
                intent4.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent4);
                break;

        }
        return false;
    }


});

    }
}