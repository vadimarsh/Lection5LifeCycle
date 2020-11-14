package com.arsh.lection5lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    public static final String tag = "COL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.activity_2);
        Log.wtf(tag,"Activity 2: onCreate()");
        Button butname = findViewById(R.id.nameBut);

        Bundle bundle = getIntent().getExtras(); //получаем бандл из намерения которое открыло эту активити
        if (bundle != null) {
            butname.setText(bundle.getCharSequence("message"));  //устанавливаем название кнопки из данных бандла
        }
        butname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this,"название кнопки это текст из предыдущей активити", Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf(tag,"Activity 2: onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(tag,"Activity 2: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf(tag,"Activity 2: onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(tag,"Activity 2: onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf(tag,"Activity 2: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(tag,"Activity 2: onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.wtf(tag,"Activity 2: onBackPressed()");
    }
}