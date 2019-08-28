package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtText,edtLuas,edtSelimut;
    private Button btnCalculatee;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLuas = findViewById(R.id.edt_Luas);
        edtSelimut = findViewById(R.id.edt_Selimut);
        btnCalculatee = findViewById(R.id.btn_calculatee);
        tvResult = findViewById(R.id.tv_resultt);



        btnCalculatee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() ==  R.id.btn_calculatee){
            String inputLuas = edtLuas.getText().toString().trim();
            String inputSelimut = edtSelimut.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputLuas)){
                isEmptyFields = true;
                edtLuas.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputSelimut)){
                isEmptyFields = true;
                edtSelimut.setError("Field ini tidak boleh kosong");
            }


            Double luas = toDouble(inputLuas);
            Double selimut = toDouble(inputSelimut);


            if (luas == null){
                isInvalidDouble = true;
                edtLuas.setError("field ini harus berupa nomor yang valid");
            }

            if (selimut == null){
                isInvalidDouble = true;
                edtSelimut.setError("field ini harus berupa nomor yang valid");
            }



            if (!isEmptyFields && !isInvalidDouble){
                double lluas = 2*luas*selimut ;
                tvResult.setText(String.valueOf(lluas));
            }


        }
    }
    private Double toDouble(String str){
        try {
            return Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }

}
