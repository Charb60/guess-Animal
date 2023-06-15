package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        final Context context = this;
        Button btn = (Button) findViewById(R.id.btnBacktoFirst);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent it = new Intent(context, MainActivityMenu.class);
                startActivity(it);

            }
        });
    }
}