package com.indrico.tokoindrico;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class ListBarangAdapter extends RecyclerView.Adapter<ListBarangAdapter.ListViewHolder> {
    private ArrayList<Barang> listBarang;
    private Context mContext;

    public ListBarangAdapter(Context context, ArrayList<Barang> list){
        this.listBarang = list;
        mContext = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_toko, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Barang barang = listBarang.get(position);
        Glide.with(holder.itemView.getContext())
                .load(barang.getPhoto())
                .apply(new RequestOptions().override(110, 110))
                .into(holder.imgPhoto);
        holder.txtNama.setText(barang.getBarang());
        holder.txtHarga.setText("Harga : " + barang.getHarga());
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on:" + barang);
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("nama_barang", barang.getBarang());
                intent.putExtra("harga_barang", barang.getHarga());
                intent.putExtra("detail_barang", barang.getDetail());
                intent.putExtra("gambar_barang", barang.getPhoto());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }

    class ListViewHolder extends  RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView txtNama, txtHarga;
        RelativeLayout parentLayout;
        ListViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            txtNama = itemView.findViewById(R.id.tv_item_name);
            txtHarga = itemView.findViewById(R.id.tv_item_harga);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
//
//    public interface OnItemClickCallback {
//        void onItemClicked(Barang data);
//    }
}
