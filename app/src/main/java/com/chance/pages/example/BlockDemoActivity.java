package com.chance.pages.example;

import java.util.Random;

import com.chance.R;
import com.chance.view.BlockDemoView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BlockDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_demo);

        BlockDemoView view = findViewById(R.id.block_demo);

        Button changeBody = findViewById(R.id.block_body);
        Button changeCloth = findViewById(R.id.block_cloth);
        Button changeMou = findViewById(R.id.block_mou);
        Button changeHair = findViewById(R.id.block_hair);
        Button changeBrow = findViewById(R.id.block_brow);
        Button changeFHair = findViewById(R.id.block_fhair);
        changeBody.setOnClickListener(v ->  {
            view.setBodyId(new Random().nextInt(6));
            view.invalidate();
        });
        changeCloth.setOnClickListener(v ->  {
            view.setClothId(new Random().nextInt(14));
            view.invalidate();
        });
        changeMou.setOnClickListener(v ->  {
            view.setMouId(new Random().nextInt(23));
            view.invalidate();
        });
        changeHair.setOnClickListener(v ->  {
            view.setHairId(new Random().nextInt(16));
            view.invalidate();
        });
        changeBrow.setOnClickListener(v ->  {
            view.setBrowId(new Random().nextInt(10));
            view.invalidate();
        });
        changeFHair.setOnClickListener(v ->  {
            view.setfHairId(new Random().nextInt(13));
            view.invalidate();
        });
    }
}