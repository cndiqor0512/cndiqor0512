package com.example.cndiqor0512;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.GetChars;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View view){
        Intent intent1 = new Intent(getApplicationContext(),TicTacToe.class);
        startActivity(intent1);
    }
    public void OnClick2(View view){
        Intent intent2 = new Intent(getApplicationContext(),Calculator.class);
        startActivity(intent2);
    }
    public void OnClick3(View view){
        Toast.makeText(this,"토스트",Toast.LENGTH_LONG).show();
    }
    public void OnClick4(View view){
        Intent intent4 = new Intent(getApplicationContext(),SubActivity.class);
        startActivity(intent4);
    }
    public void OnClick5(View view){
    moveTaskToBack(true);
    finish();
    }
    public void OnClick6(View view){
        Intent intent4 = new Intent(getApplicationContext(),Btn_Color.class);
        startActivity(intent4);
    }
    public void Onclick16(View view){
        Intent intent16 = new Intent(getApplicationContext(),KakaoTalkLogin.class);
        startActivity(intent16);
    }
}
