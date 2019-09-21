package com.example.cndiqor0512;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Btn_Color extends AppCompatActivity implements View.OnClickListener{
    Button blue,red,green,yellow,white;
    LinearLayout Layout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn__color);

        red = (Button)findViewById(R.id.red);
        blue = (Button)findViewById(R.id.green);
        green = (Button)findViewById(R.id.blue);
        white = (Button)findViewById(R.id.white);
        yellow = (Button)findViewById(R.id.yellow);
        red.setOnClickListener(this);
        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        white.setOnClickListener(this);
        yellow.setOnClickListener(this);
        Layout=(LinearLayout)findViewById(R.id.layout);

    }
    public void Red(View v){
        int red = getResources().getColor(R.color.red);
        v.setBackgroundColor(red);
    }
    public void Blue(View v){
        int blue = getResources().getColor(R.color.blue);
        v.setBackgroundColor(blue);
    }
    public void Yellow(View v){
        int yellow = getResources().getColor(R.color.yellow);
        v.setBackgroundColor(yellow);
    }
    public void Green(View v){
        int green = getResources().getColor(R.color.green);
        v.setBackgroundColor(green);
    }
    public void White(View v){
        int white = getResources().getColor(R.color.white);
        v.setBackgroundColor(white);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.red){
            Layout.setBackgroundResource(R.color.red);
        }else if(v.getId()==R.id.blue){
            Layout.setBackgroundResource(R.color.blue);
        }else if(v.getId()==R.id.green){
            Layout.setBackgroundResource(R.color.green);
        }else if(v.getId()==R.id.white){
            Layout.setBackgroundResource(R.color.white);
        }else if(v.getId()==R.id.yellow){
            Layout.setBackgroundResource(R.color.yellow);
        }



    }
}

