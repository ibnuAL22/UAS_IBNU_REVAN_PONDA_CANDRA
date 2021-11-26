package com.example.uas_ibnu_revan_ponda_candra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCinemaAdapter extends RecyclerView.Adapter<ListCinemaAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Cinema> listCinema;

    public ArrayList<Cinema> getListCinema(){
        return listCinema;
    }
    public void setListCinema(ArrayList<Cinema>listCinema){
        this.listCinema = listCinema;
    }

    public ListCinemaAdapter(ArrayList<Cinema> list){
        this.listCinema = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_cinema, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Cinema cinema = listCinema.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cinema.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(cinema.getName());


    }

    @Override
    public int getItemCount() {
        return listCinema.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName,tvAddress;

        ListViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_cinema);
            tvName = view.findViewById(R.id.tv_item_cinema_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int postion = getAdapterPosition();
            Cinema cinema = getListCinema().get(postion);
            cinema.setName(cinema.getName());
            cinema.setPhoto(cinema.getPhoto());

        }
    }
}
