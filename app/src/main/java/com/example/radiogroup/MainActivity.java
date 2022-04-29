package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sW;
    RadioButton rB1, rB2, rB3, rB4;
    LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sW = findViewById(R.id.switch1);
        rB1 = findViewById(R.id.radioButton);
        rB2 = findViewById(R.id.radioButton2);
        rB3 = findViewById(R.id.radioButton3);
        rB4 = findViewById(R.id.radioButton4);
        lL = findViewById(R.id.lL);
    }



    public void onClick1(View view) {
        if (sW.isChecked()) {
            lL.setBackgroundColor(color.BLACK);
        }
    }

    public void onClick2(View view) {
        if (sW.isChecked()) {
            lL.setBackgroundColor(color.GREEN);
        }
    }

    public void onClick3(View view) {
        if (sW.isChecked()) {
            lL.setBackgroundColor(color.RED);
        }
    }

    public void onClick4(View view) {
        if (sW.isChecked()) {
            lL.setBackgroundColor(color.YELLOW);
        }
    }

    public void go(View view) {
        if (sW.isChecked() == false) {
            if (rB1.isChecked()) {
                lL.setBackgroundColor(BLACK);
            }

            if (rB2.isChecked()) {
                lL.setBackgroundColor(GREEN);
            }
            if (rB3.isChecked()) {
                lL.setBackgroundColor(RED);
            }
            if (rB4.isChecked()) {
                lL.setBackgroundColor(YELLOW);
            }
        }
    }

}

