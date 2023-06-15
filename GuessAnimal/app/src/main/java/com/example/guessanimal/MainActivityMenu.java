package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;

public class MainActivityMenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        Button btn = (Button) findViewById(R.id.btnBacktoFirst);
        Button btns = (Button) findViewById(R.id.btnBacktoFirst2);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent it = new Intent(context, MainActivity2.class);
                startActivity(it);

            }


        });
        btns.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent it = new Intent(context, MainActivity6.class);
                startActivity(it);

            }


        });
    }
}