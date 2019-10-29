package com.indrico.tokoindrico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button btnMoveActivity = findViewById(R.id.btnKembali);
        btnMoveActivity.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnKembali : Intent moveIntent = new Intent(AboutActivity.this, MainActivity.class);
            startActivity(moveIntent);
            finish();
            break;
        }
    }
}
