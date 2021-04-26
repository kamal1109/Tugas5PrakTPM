package com.example.itemlist;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvPreview;
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.det_photo);
        tvName = findViewById(R.id.det_name);
        tvPreview = findViewById(R.id.det_preview);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if (getIntent().hasExtra("photo") && getIntent().hasExtra("name") && getIntent().hasExtra("preview")){
            int PhotoMarketPlace = getIntent().getIntExtra("photo", 0);
            String nameMarketPlace = getIntent().getStringExtra("name");
            String previewMarketPlace = getIntent().getStringExtra("preview");

            setDataActivity(PhotoMarketPlace, nameMarketPlace, previewMarketPlace);
        }
    }

    private void setDataActivity(int PhotoMarketPlace, String nameMarketPlace, String previewMarketPlace){
        Glide.with(this).asBitmap().load(PhotoMarketPlace).into(ivPhoto);
        tvName.setText(nameMarketPlace);
        tvPreview.setText(previewMarketPlace);
    }
}