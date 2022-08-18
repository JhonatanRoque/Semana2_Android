package com.fjar.app_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class EjercicioCheckBox extends AppCompatActivity {
    private EditText edt1, edt2;
    private TextView tvResultado;
    private CheckBox cb1, cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_check_box);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        cb1 = (CheckBox) findViewById(R.id.cbRestar);
        cb2 = (CheckBox) findViewById(R.id.cbSumar);
        tvResultado = (TextView) findViewById(R.id.tvResultado2);
    }

    //Este metódo se ejecutará cuando se presione el botón
    public void operar(View view){
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        String resu = "";
        if(cb1.isChecked() == true)
        {
            int resta = n1 - n2;
            resu = "La resta es: " + resta;
        }
        if(cb2.isChecked() == true)
        {
            int suma = n1 + n2;
            resu = resu + " La suma es: " + suma;
        }
        tvResultado.setText(resu);
    }
}