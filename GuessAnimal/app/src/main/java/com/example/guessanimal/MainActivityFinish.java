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
public class MainActivityFinish extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_finish);


        Button btn = (Button) findViewById(R.id.btnBacktoFirst);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context, MainActivity.class);
                startActivity(it);

            }
        });

    }
}

