package com.trungse.bai12onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnResult;
    private EditText edtNumberA;
    private EditText edtNumberB;
    private int numberA, numberB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button) findViewById(R.id.btnResult);
        edtNumberA = (EditText) findViewById(R.id.edt_numberA);
        edtNumberB = (EditText) findViewById(R.id.edt_numberB);

        btnResult.setOnClickListener(this);

        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "day la su kien", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnResult:
                if(!edtNumberA.getText().toString().isEmpty() && !edtNumberB.getText().toString().isEmpty()){
                    numberA = Integer.parseInt(edtNumberA.getText().toString());
                    numberB = Integer.parseInt(edtNumberB.getText().toString());

                    Toast.makeText
                            (this, "Ket qua cua " + numberA + " + " + numberB + " la: " + (numberA + numberB),
                                    Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(this, "Vui long nhap so hop le!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
