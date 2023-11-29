package com.betelgeuse.corp.menuandroidjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        RelativeLayout relativeLayout = findViewById(R.id.firstActivity);
        if (id == R.id.backGreen){
            Toast.makeText(this, "This is Green", Toast.LENGTH_SHORT).show();
            relativeLayout.setBackgroundColor(Color.GREEN);
        } else if (id == R.id.backRad) {
            Toast.makeText(this, "This is Rad", Toast.LENGTH_SHORT).show();
            relativeLayout.setBackgroundColor(Color.RED);
        } else if (id == R.id.backBlue) {
            Toast.makeText(this, "This is Blue", Toast.LENGTH_SHORT).show();
            relativeLayout.setBackgroundColor(Color.BLUE);
        }
        else if (id == R.id.next) {
            Toast.makeText(this, "This is Next", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


//    public void nextActivity(View View){
//        Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
//
//    }
}