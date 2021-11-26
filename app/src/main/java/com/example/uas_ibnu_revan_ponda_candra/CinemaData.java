package com.example.uas_ibnu_revan_ponda_candra;

import java.util.ArrayList;

public class CinemaData {
    private static String [] cinemaNames = {
            "Boemi Kedaton XXI",
            "Central 21",
            "Ciplaz Lampung XXI",
            "Ciplaz Lampung XXI",
            "Ciplaz Lampung XXI",
            "Cinemaxx Plaza Semangg",
            "Pejaten Village XXI"



    };
    private static String[]cinemaAddress = {
            "Lampung",
            "Lampung",
            "Lampung",
            "Lampung",
            "Lampung",
            "jakarta",
            "jakarta"
    };
    private static int[] cinemaImages = {
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters,
            R.drawable.ic_theaters


    };
    public static ArrayList<Cinema> getListdata(){
        ArrayList<Cinema> list = new ArrayList<>();
        for (int position = 0; position < cinemaImages.length; position++){
            Cinema cinema = new Cinema();
            cinema.setName(cinemaNames[position]);
            cinema.setAddress(cinemaAddress[position]);
            cinema.setPhoto(cinemaImages[position]);
            list.add(cinema);


        }
        return list;
    }
}