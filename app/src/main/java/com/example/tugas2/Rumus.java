package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Rumus extends AppCompatActivity implements View.OnClickListener {

    EditText edtkm, edthm, edtdam, edtm, edtdm, edtcm, edtmm;
    double hasil1;
    double hasil2;
    double hasil3;
    double hasil4;
    double hasil5;
    double hasil6;
    double hasil7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);
        edtkm = findViewById(R.id.edit_km);
        edthm = findViewById(R.id.edit_hm);
        edtdam = findViewById(R.id.edit_dam);
        edtm = findViewById(R.id.edit_m);
        edtdm = findViewById(R.id.edit_dm);
        edtcm = findViewById(R.id.edit_cm);
        edtmm = findViewById(R.id.edit_mm);
        Button btn = findViewById(R.id.btn_2);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_2){
            if (edtkm.getText().toString().equals("")){
                hasil1 = 0;
            }else{
                hasil1 = 10*Double.parseDouble(edtkm.getText().toString());
            }
            if (edthm.getText().toString().equals("")){
                hasil2 = 0;
            }else{
                hasil2 = 100*Double.parseDouble(edthm.getText().toString());
            }
            if (edtdam.getText().toString().equals("")){
                hasil3 = 0;
            }else{
                hasil3 = 1000*Double.parseDouble(edtdam.getText().toString());
            }
            if (edtm.getText().toString().equals("")){
                hasil4 = 0;
            }else{
                hasil4 = 10000*Double.parseDouble(edtm.getText().toString());
            }
            if (edtdm.getText().toString().equals("")){
                hasil5 = 0;
            }else{
                hasil5 = 100000*Double.parseDouble(edtdm.getText().toString());
            }
            if (edtcm.getText().toString().equals("")){
                hasil6 = 0;
            }else{
                hasil6 = 1000000*Double.parseDouble(edtcm.getText().toString());
            }
            if (edtmm.getText().toString().equals("")){
                hasil7 = 0;
            }else{
                hasil7 = 10000000*Double.parseDouble(edtmm.getText().toString());
            }
            Intent intent = new Intent(Rumus.this, Result.class);
            intent.putExtra("result1", hasil1);
            intent.putExtra("result2", hasil2);
            intent.putExtra("result3", hasil3);
            intent.putExtra("result4", hasil4);
            intent.putExtra("result5", hasil5);
            intent.putExtra("result6", hasil6);
            intent.putExtra("result7", hasil7);
            startActivity(intent);
        }

    }
}
