package com.example.xml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    Button btnActThr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActThr = (Button) findViewById(R.id.btnActThr);
        btnActThr.setOnClickListener(this::onClickw);
    }
    public void onClickw(View v) {
        switch (v.getId()) {
            case R.id.btnActThr:
                Intent intent = new Intent(this, ActivityThry.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}