package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.content.Context;
public class MainActivity8 extends AppCompatActivity {


    Button btn2;
    Button btn3;
    Button btn4;

    MediaPlayer md;
    int Md_play = 0;

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        btn2 = (Button) findViewById(R.id.wrongbtn2);
        btn3 = (Button) findViewById(R.id.wrongbtn3);
        btn4 = (Button) findViewById(R.id.wrongbtn4);
        onButtonClick();

        Button btn = (Button) findViewById(R.id.correct);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context, MainActivity9.class);
                startActivity(it);
                Toast.makeText(context, "ถูกต้อง เก่งมาก !!!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void onButtonClick() {

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "ไม่ถูกต้อง กรุณาเลือกใหม่.", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "ไม่ถูกต้อง กรุณาเลือกใหม่.", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "ไม่ถูกต้อง กรุณาเลือกใหม่.", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void playsound(View v){
        initMusic();
        md.start();
        Md_play = 1;

    }

    public void initMusic(){
        md = MediaPlayer.create(this,R.raw.duck);
        md.setVolume(100,100);
    }
}