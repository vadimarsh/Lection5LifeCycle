package com.arsh.lection5lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String tag = "COL";
    EditText editText;
    private Button mainBut;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf(tag, "onCreate()");
        Log.v(tag, "Bundle:" + savedInstanceState);

        mainBut = findViewById(R.id.mainButton);
        editText = findViewById(R.id.editText);

        mainBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("message", editText.getText().toString());   //добавляем в намерение в бандл данные
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf(tag, "onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(tag, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf(tag, "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(tag, "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf(tag, "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(tag, "onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.wtf(tag, "onBackPressed()");
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        //super.onBackPressed();
        return super.onKeyLongPress(keyCode, event);
    }
}