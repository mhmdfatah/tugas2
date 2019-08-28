package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView rkm, rhm, rdam, rm, rdm, rcm, rmm;
    String skm, shm, sdam, sm, sdm, scm, smm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        rkm = findViewById(R.id.km);
        skm = String.valueOf(getIntent().getDoubleExtra("result1", 0));
        rkm.setText(skm);

        rhm = findViewById(R.id.hm);
        shm = String.valueOf(getIntent().getDoubleExtra("result2", 0));
        rhm.setText(shm);

        rdam = findViewById(R.id.dam);
        sdam = String.valueOf(getIntent().getDoubleExtra("result3", 0));
        rdam.setText(sdam);

        rm = findViewById(R.id.m);
        sm = String.valueOf(getIntent().getDoubleExtra("result4", 0));
        rm.setText(sm);

        rdm = findViewById(R.id.dm);
        sdm = String.valueOf(getIntent().getDoubleExtra("result5", 0));
        rdm.setText(sdm);

        rcm = findViewById(R.id.cm);
        scm = String.valueOf(getIntent().getDoubleExtra("result6", 0));
        rcm.setText(scm);

        rmm = findViewById(R.id.mm);
        smm = String.valueOf(getIntent().getDoubleExtra("result7", 0));
        rmm.setText(smm);

    }
}
