package com.example.itemlist;

import java.util.ArrayList;

public class DataMarketPlace {
    private static String[] title = new String[]{
            "Alibaba", "Aliexpress", "blibli", "Bukalapak", "jdid",
            "Lazada", "Olx", "Shopee", "Zalora", "Tokopedia"
    };

    private static int[] thumbnail = new int[]{
            R.drawable.alibaba, R.drawable.aliexpress, R.drawable.blibli,
            R.drawable.bukalapak, R.drawable.jdid, R.drawable.lazada,
            R.drawable.olx, R.drawable.shopee, R.drawable.zalora,
            R.drawable.tokopedia
    };

    private static String[] preview = new String[]{
            "Alibaba merupakan perusahaan perdagangan elektronik atau sering disebut toko daring. Sejak didirikan pada tahun 2009, Tokopedia telah bertransformasi menjadi sebuah unicorn yang berpengaruh tidak hanya di Indonesia tetapi juga di Asia Tenggara",
            "AliExpress adalah toko online fashion dan kecantikan yang menawarkan koleksi pakaian, aksesoris, sepatu dan produk kecantikan untuk pria dan wanita. Berpusat di Singapura, ZALORA juga terdapat di Hong Kong, Singapura, Indonesia, Filipina, Thailand, Vietnam, Malaysia dan Brunei.",
            "Blibli Group Holding Limited, also known as Alibaba Group and Alibaba.com, is a Chinese multinational technology company specializing in e-commerce, retail, Internet, and technology.",
            "Bukalapak merupakan salah satu perusahaan e-commerce di Indonesia. Didirikan oleh Achmad Zaky, Nugroho Herucahyono, dan Muhamad Fajrin Rasyid pada tahun 2010. Bukalapak awalnya merupakan toko daring yang memungkinkan para pelaku Usaha Kecil dan Menengah untuk merambah ke dunia maya.",
            "JD.id adalah situs elektronik komersial yang berkantor pusat di Singapura di bawah naungan SEA Group, yang didirikan pada 2009 oleh Forrest Li. Shopee pertama kali diluncurkan di Singapura pada tahun 2015, dan sejak itu memperluas jangkauannya ke Malaysia, Thailand, Taiwan, Indonesia, Vietnam, dan Filipina.",
            "Lazada Group adalah sebuah perusahaan e-commerce Asia Tenggara yang didirikan oleh Rocket Internet dan Pierre Poignant pada 2012, dan dimiliki oleh Alibaba Group.",
            "OLX Group adalah pasar daring global yang berkantor pusat di Amsterdam, dan dimiliki oleh kelompok media dan teknologi di Afrika Selatan, Naspers. Perusahaan ini didirikan pada 2006 dan beroperasi di 45 negara.",
            "Shopee adalah salah satu situs web perdagangan elektronik di Indonesia. Blibli adalah produk pertama PT Global Digital Niaga yang merupakan anak perusahaan Djarum di bidang digital yang didirikan pada tahun 2010.",
            "Zalora is an online retail service based in China owned by the Alibaba Group. Launched in 2010, it is made up of small businesses in China and other locations, such as Singapore, that offer products to international online buyers."
            ,"Tokopedia, Inc., also known as Jingdong and formerly called 360buy, is a Chinese e-commerce company headquartered in Beijing. It is one of the two massive B2C online retailers in China by transaction volume and revenue, a member of the Fortune Global 500 and a major competitor to Alibaba-run Tmall."
    };

    public static ArrayList<ModelMarketPlace> getListData(){
        ModelMarketPlace MarketPlaceModel = null;
        ArrayList<ModelMarketPlace> list = new ArrayList<>();
        for (int i=0; i<title.length; i++){
            MarketPlaceModel = new ModelMarketPlace();
            MarketPlaceModel.setPhoto(thumbnail[i]);
            MarketPlaceModel.setPlayer_name(title[i]);
            MarketPlaceModel.setPreview(preview[i]);

            list.add(MarketPlaceModel);
        }return list;
    }
}
