package com.chance.pages;

import com.chance.R;
import com.chance.constants.BlockType;
import com.chance.view.BodyView;
import com.chance.view.ChooseControlView;
import com.chance.view.SlideControlView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
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
        changeBody.setRectGap(60f);
        changeBody.setRectTopGap(70f);
        changeBody.setBodyView(bodyView);
        changeBody.setBlockType(BlockType.BODY);
        ChooseControlView changeCloth = findViewById(R.id.block_cloth);
        changeCloth.setRectGap(60f);
        changeCloth.setRectTopGap(70f);
        changeCloth.setBodyView(bodyView);
        changeCloth.setBlockType(BlockType.CLOTH);
        ChooseControlView changeMou = findViewById(R.id.block_mou);
        changeMou.setRectGap(60f);
        changeMou.setRectTopGap(70f);
        changeMou.setBodyView(bodyView);
        changeMou.setBlockType(BlockType.MOU);
        ChooseControlView changeFHair = findViewById(R.id.block_fhair);
        changeFHair.setRectGap(60f);
        changeFHair.setRectTopGap(70f);
        changeFHair.setBodyView(bodyView);
        changeFHair.setBlockType(BlockType.F_HAIR);
        ChooseControlView changeHair = findViewById(R.id.block_hair);
        changeHair.setRectGap(60f);
        changeHair.setRectTopGap(70f);
        changeHair.setBodyView(bodyView);
        changeHair.setBlockType(BlockType.HAIR);
        ChooseControlView changeBrow = findViewById(R.id.block_brow);
        changeBrow.setRectGap(60f);
        changeBrow.setRectTopGap(70f);
        changeBrow.setBodyView(bodyView);
        changeBrow.setBlockType(BlockType.BROW);

        SlideControlView slidePupil = findViewById(R.id.slide_pupil);
        slidePupil.setSlideTopGap(20f);
        slidePupil.setSlideThicknessProportions(0.16f);
        slidePupil.setSlideRectProportions(2.5f);
        slidePupil.setSlideRectLocation(0f);

        SlideControlView slideHFhir = findViewById(R.id.slide_h_fhair);
        slideHFhir.setSlideTopGap(20f);
        slideHFhir.setSlideThicknessProportions(0.16f);
        slideHFhir.setSlideRectProportions(2.5f);
        slideHFhir.setSlideRectLocation(0f);

        SlideControlView slideHair= findViewById(R.id.slide_hair);
        slideHair.setSlideTopGap(20f);
        slideHair.setSlideThicknessProportions(0.16f);
        slideHair.setSlideRectProportions(2.5f);
        slideHair.setSlideRectLocation(0f);
    }
}
