package com.indrico.tokoindrico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: called");
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents");
        String detail = getIntent().getStringExtra("detail_barang");
        String nama = getIntent().getStringExtra("nama_barang");
        String harga = getIntent().getStringExtra("harga_barang");
        int gambar = getIntent().getIntExtra("gambar_barang" , 0);
        setContent(detail, nama, harga, gambar);
    }

    private void setContent(String detail,String nama, String harga, int gambar){
        Log.d(TAG, "setContent: memasukkan content" + gambar);
        TextView txtnama = findViewById(R.id.nama_barang);
        TextView txtdetail = findViewById(R.id.detail_barang);
        TextView txtharga = findViewById(R.id.harga_barang);
        ImageView imageView = findViewById(R.id.gambar_barang);
        Glide.with(this)
                .load(gambar)
                .apply(new RequestOptions().override(250, 250))
                .into(imageView);
        txtnama.setText(nama);
        txtdetail.setText(detail);
        txtharga.setText(harga);
    }
}
