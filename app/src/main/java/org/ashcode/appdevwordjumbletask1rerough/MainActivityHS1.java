package org.ashcode.appdevwordjumbletask1rerough;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivityHS1 extends AppCompatActivity {
    private Animation rotateAnimation_hs1;
    //private Animation fadeAnimation_hs1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hs1);

        rotateAnimation_hs1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
        //fadeAnimation_hs1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);

        SharedPreferences sharedPreferences = getSharedPreferences("highscorefile", MODE_PRIVATE);
        int highscore = sharedPreferences.getInt("highscorekey",0);

        TextView wordJumble_title_hs1 = findViewById(R.id.wordJumble_title_hs1);
        wordJumble_title_hs1.startAnimation(rotateAnimation_hs1);
        //wordJumble_title_hs1.startAnimation(fadeAnimation_hs1);

        TextView highScoreHStextView = findViewById(R.id.highScoretextView_hs1);
        highScoreHStextView.setText("Best Score : "+String.valueOf(highscore));


        Button normalModeBtnMA1_hs1= findViewById(R.id.normalModeBtnMA1_hs1);
        normalModeBtnMA1_hs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wordJumble_title_hs1.clearAnimation();
                Intent goto_ma1Intent_from_hs1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goto_ma1Intent_from_hs1);
            }
        });

        Button hackerModeBtnMA1_hs1= findViewById(R.id.hackerModeBtnMA1_hs1);
        hackerModeBtnMA1_hs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wordJumble_title_hs1.clearAnimation();
                Intent goto_ma3Intent_from_hs1 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(goto_ma3Intent_from_hs1);
            }
        });
    }
}