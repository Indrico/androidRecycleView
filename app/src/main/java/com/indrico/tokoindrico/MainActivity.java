package com.indrico.tokoindrico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBarang;
    private ArrayList<Barang> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onProfileAction(MenuItem mi){
        Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(moveIntent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBarang = findViewById(R.id.rv_shop);
        rvBarang.setHasFixedSize(true);

        list.addAll(DataBarang.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        Log.d(TAG, "showRecyclerList: init recyclerview.");
        rvBarang.setLayoutManager(new LinearLayoutManager(this));
        ListBarangAdapter listBarangAdapter = new ListBarangAdapter(this, list);
        rvBarang.setAdapter(listBarangAdapter);
    }
}
