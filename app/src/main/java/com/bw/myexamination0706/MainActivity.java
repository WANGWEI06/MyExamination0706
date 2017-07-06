package com.bw.myexamination0706;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Toast.makeText(MainActivity.this,"按下",Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_UP:
                        Toast.makeText(MainActivity.this,"抬起",Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });


    }
}
