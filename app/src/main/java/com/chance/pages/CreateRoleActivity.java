package com.chance.pages;

import java.util.Random;

import com.chance.R;
import com.chance.view.BodyView;

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
        setContentView(R.layout.create_role_activity);

        Button ok = findViewById(R.id.ok);
        ok.setOnClickListener(v ->  {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });

        BodyView view = findViewById(R.id.block);
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
