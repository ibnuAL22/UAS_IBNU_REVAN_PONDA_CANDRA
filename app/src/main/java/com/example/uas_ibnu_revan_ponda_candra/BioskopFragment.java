package com.example.uas_ibnu_revan_ponda_candra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BioskopFragment extends Fragment {
    private RecyclerView rvCineema;
    private ArrayList<Cinema> list = new ArrayList<>();


    public BioskopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bioskop, container, false);
        rvCineema = view.findViewById(R.id.cinemaFragment);
        rvCineema.setHasFixedSize(true);

        list.addAll(CinemaData.getListdata());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rvCineema.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListCinemaAdapter listCinemaAdapter =new ListCinemaAdapter(list);
        listCinemaAdapter.setListCinema(list);
        rvCineema.setAdapter(listCinemaAdapter);


    }
}