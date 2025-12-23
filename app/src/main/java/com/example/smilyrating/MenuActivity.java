package com.example.smilyrating;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViewById(R.id.smiley_view).setOnClickListener(this);
        findViewById(R.id.smiley_rating).setOnClickListener(this);
        findViewById(R.id.smiley_rating2).setOnClickListener(this);
        findViewById(R.id.smiley_rating2_list).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int id = v.getId();
        if (id == R.id.smiley_view) {
            intent = new Intent(this, TestActivity.class);
        } else if (id == R.id.smiley_rating) {
            intent = new Intent(this, MainActivity.class);
        } else if (id == R.id.smiley_rating2) {
            intent = new Intent(this, SmileyActivity2.class);
        } else if (id == R.id.smiley_rating2_list) {
            intent = new Intent(this, RecyclerViewExample.class);
        }
        startActivity(intent);
    }
}
