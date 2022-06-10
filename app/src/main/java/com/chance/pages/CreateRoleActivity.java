package com.chance.pages;

import java.util.Random;

import com.chance.R;
import com.chance.view.BodyView;
import com.chance.view.ChooseControlView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 角色创建
 *
 * @author lsy
 */
public class CreateRoleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉Activity上面的状态栏
        setContentView(R.layout.create_role_v3_activity);

//        Button ok = findViewById(R.id.ok);
//        ok.setOnClickListener(v ->  {
//            Intent intent = new Intent(this, HomeActivity.class);
//            startActivity(intent);
//        });

        BodyView bodyView = findViewById(R.id.block);
        ChooseControlView changeBody = findViewById(R.id.block_body);
        changeBody.setRectGap(30f);
        changeBody.setRectTopGap(70f);
        changeBody.setBodyView(bodyView);
        changeBody.setSource(BodyView.BODIES);
        changeBody.setBodyState("body");
        ChooseControlView changeCloth = findViewById(R.id.block_cloth);
        changeCloth.setRectGap(30f);
        changeCloth.setRectTopGap(70f);
        changeCloth.setBodyView(bodyView);
        changeCloth.setSource(BodyView.CLOTHS);
        changeCloth.setBodyState("cloth");
        ChooseControlView changeMou = findViewById(R.id.block_mou);
        changeMou.setRectGap(30f);
        changeMou.setRectTopGap(70f);
        changeMou.setBodyView(bodyView);
        changeMou.setSource(BodyView.MOUS);
        changeMou.setBodyState("mou");
        ChooseControlView changeHair = findViewById(R.id.block_hair);
        changeHair.setRectGap(30f);
        changeHair.setRectTopGap(70f);
        changeHair.setBodyView(bodyView);
        changeHair.setSource(BodyView.HAIRS);
        changeHair.setBodyState("hair");
        ChooseControlView changeBrow = findViewById(R.id.block_brow);
        changeBrow.setRectGap(30f);
        changeBrow.setRectTopGap(70f);
        changeBrow.setBodyView(bodyView);
        changeBrow.setSource(BodyView.BROWS);
        changeBrow.setBodyState("brow");

//        changeBody.setOnClickListener(v ->  {
//            view.setBodyId(new Random().nextInt(6));
//            view.invalidate();
//        });
//        changeCloth.setOnClickListener(v ->  {
//            view.setClothId(new Random().nextInt(14));
//            view.invalidate();
//        });
//        changeMou.setOnClickListener(v ->  {
//            view.setMouId(new Random().nextInt(23));
//            view.invalidate();
//        });
//        changeHair.setOnClickListener(v ->  {
//            view.setHairId(new Random().nextInt(16));
//            view.invalidate();
//        });
//        changeBrow.setOnClickListener(v ->  {
//            view.setBrowId(new Random().nextInt(10));
//            view.invalidate();
//        });
//        changeFHair.setOnClickListener(v ->  {
//            view.setfHairId(new Random().nextInt(13));
//            view.invalidate();
//        });
    }
}
