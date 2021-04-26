package com.example.itemlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MarketPlaceAdapter extends RecyclerView.Adapter<MarketPlaceAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ModelMarketPlace> MarketPlaceModels;

    public MarketPlaceAdapter(ArrayList<ModelMarketPlace> listData, Context context) {
        this.context = context;
    }

    public ArrayList<ModelMarketPlace> getMarketPlaceModels() {
        return MarketPlaceModels;
    }

    public void setMarketPlaceModels(ArrayList<ModelMarketPlace> MarketPlaceModels) {
        this.MarketPlaceModels = MarketPlaceModels;
    }

    @NonNull
    @Override
    public MarketPlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_marketplace,viewGroup,false);
        return new ViewHolder(itRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(getMarketPlaceModels().get(i).getPhoto()).into(viewHolder.ivPhotoMarketPlace);
        viewHolder.tvnameMarketPlace.setText(getMarketPlaceModels().get(i).getPlayer_name());

        viewHolder.visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("photo", getMarketPlaceModels().get(i).getPhoto());
                intent.putExtra("name", getMarketPlaceModels().get(i).getPlayer_name());
                intent.putExtra("preview", getMarketPlaceModels().get(i).getPreview());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getMarketPlaceModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivPhotoMarketPlace;
        private TextView tvnameMarketPlace;
        private Button visit;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivPhotoMarketPlace = itemView.findViewById(R.id.pic_photo);
            tvnameMarketPlace = itemView.findViewById(R.id.tx_name);
            visit = itemView.findViewById(R.id.btn_Rincian);
        }
    }
}
