package com.example.cndiqor0512;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    private EditText edtFirstNum,edtSecondNum;
    private Button btnAdd,btnSub,btnMul,btnDiv;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        init();
    }

    private void init() {

        edtFirstNum = (EditText)findViewById(R.id.edt_firstNum);
        edtSecondNum = (EditText)findViewById(R.id.edt_secondNum);

        btnAdd = (Button)findViewById(R.id.btn_add);
        btnSub = (Button)findViewById(R.id.btn_sub);
        btnMul = (Button)findViewById(R.id.btn_mul);
        btnDiv = (Button)findViewById(R.id.btn_div);

        textResult = (TextView)findViewById(R.id.text_Result);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String firstNumData = edtFirstNum.getText().toString();
        String secondNumData = edtSecondNum.getText().toString();


        if (TextUtils.isEmpty(firstNumData) || TextUtils.isEmpty(secondNumData)) {
            Toast.makeText(this, "두 수를 채우세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        switch (view.getId()){
            case R.id.btn_add:

                int addition = Integer.parseInt(firstNumData) + Integer.parseInt(secondNumData);

                textResult.setText(String.valueOf(addition));

                break;

            case R.id.btn_sub:

                int subtraction = Integer.parseInt(firstNumData) - Integer.parseInt(secondNumData);

                textResult.setText(String.valueOf(subtraction));

                break;

            case R.id.btn_mul:

                int multiplication = Integer.parseInt(firstNumData) * Integer.parseInt(secondNumData);

                textResult.setText(String.valueOf(multiplication));

                break;

            case R.id.btn_div:

                try {
                    int division = Integer.parseInt(firstNumData) / Integer.parseInt(secondNumData);
                    textResult.setText(String.valueOf(division));
                }
                catch (Exception e) {

                    textResult.setText("이 수로 나눌 수 없습니다.");
                }
                break;



        }

    }
}

