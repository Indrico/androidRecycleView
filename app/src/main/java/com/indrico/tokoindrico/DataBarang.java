package com.indrico.tokoindrico;

import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

public class DataBarang{
    private static String[] itemsNames = {
            "Lipton Chamomile Tea", "Lipton Earl Grey Tea", "Lipton English Breakfast Tea",
            "Lipton Green Jasmine", "Lipton Peppermint Tea", "Twinings Darjeeling Tea",
            "Twinings Earl Grey Tea", "Twinings English Breakfast Tea", "Twinings Green Lemon Tea",
            "Twinings Pure Green Tea"
    };

    private static int[] itemsImages = {
            R.drawable.lipton_chamomile_25, R.drawable.lipton_earlgrey_25, R.drawable.lipton_english_25,
            R.drawable.lipton_greenjasmine_25, R.drawable.lipton_peppermint_25, R.drawable.twinings_darjeeling_25,
            R.drawable.twinings_earlgrey_25, R.drawable.twinings_english_25, R.drawable.twinings_greenlemon_25,
            R.drawable.twinings_greentea_25,
    };

    private static String[] itemsPrice = {
            "Rp. 50.000", "Rp. 45.000", "Rp. 60.000",
            "Rp. 70.000", "Rp. 75.000", "Rp. 40.000",
            "Rp. 25.000", "Rp. 30.000", "Rp. 65.000",
            "Rp. 85.000"
    };

    private static String[] itemsDetails = {
            "Lipton Chamomile Infusion Tea - Tea yg di percaya dapat memperpanjang umur manusia",
            "Lipton Earl Grey is an exceptional blend of fine teas, enhanced with subtle Bergamot notes",
            "Teh yang memiliki kandungan Antioksidan yang melindungi tubuh Anda dari kerusakan dari radikal bebas",
            "Bangkitkan Semangat anda dengan teh hijau halus dengan aroma bunga melati yang harum. tensi aroma.",
            "Peppermint Infusion Tea merupakan minuman yang terbuat dari daun peppermint yang diminum sebagai teh. ",
            "Teh yang berasal dari kota kecil di negara bagian Benggala Barat di India",
            "Earl Grey Tea Since 1706, Aromatic black tea blend, scented with a citrus bergamot flavour.",
            "Twinings dari London English Breakfast Tea Bags, membantu Anda untuk memulai pagi Anda dengan pengalaman yang menyenangkan",
            "Teh Hijau Murni sangat seimbang dengan rasa lemon segar yang membangkitkan semangat.",
            "Twinings tea of London memperkenalkan varian Pure Green Tea, isi 25 kantong"
    };

    static ArrayList<Barang> getListData() {
        ArrayList<Barang> list = new ArrayList<>();
        for (int position = 0; position < itemsNames.length; position++){
            Barang barang = new Barang();
            barang.setBarang(itemsNames[position]);
            barang.setHarga(itemsPrice[position]);
            barang.setPhoto(itemsImages[position]);
            barang.setDetail(itemsDetails[position]);
            list.add(barang);
        }
        return list;
    }
}
