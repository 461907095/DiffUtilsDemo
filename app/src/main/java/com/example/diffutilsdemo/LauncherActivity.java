package com.example.diffutilsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.diffutilsdemo.diffutil.MainActivity;
import com.example.diffutilsdemo.sortedlist.SortedListActivity;

import androidx.appcompat.app.AppCompatActivity;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        findViewById(R.id.btnDiff).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherActivity.this, MainActivity.class));
            }
        });

        findViewById(R.id.btnSortedList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherActivity.this, SortedListActivity.class));
            }
        });
    }
}
