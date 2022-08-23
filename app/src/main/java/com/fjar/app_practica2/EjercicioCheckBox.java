package com.fjar.app_practica2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.Ejercicio1){
            finish();
            Intent ejercicio1 = new Intent(this, MainActivity.class);
            startActivity(ejercicio1);
        }else if (id == R.id.Ejercicio2){
            finish();
            Intent ejercicio2 = new Intent(this, Ejercicio2_RadioGrpBtn.class);
            startActivity(ejercicio2);
        }else if (id == R.id.Ejercicio3){
            finish();
            Intent ejercicio3 = new Intent(this, EjercicioCheckBox.class);
            startActivity(ejercicio3);
        }else if (id == R.id.Ejercicio4){
            finish();
            Intent ejercicio4 = new Intent(this, EjercicioControlSpinner.class);
            startActivity(ejercicio4);
        }else if (id == R.id.Ejercicio5){
            finish();
            Intent ejercicio5 = new Intent(this, EjercicioControlListView.class);
            startActivity(ejercicio5);
        }
        else if (id == R.id.Ejercicio6){
            finish();
            Intent  ejercicio6 = new Intent(this, Ejercicio_Control_ImageButton.class);
            startActivity(ejercicio6);
        }else if(id == R.id.Ejercicio7){
            Intent  ejercicio7 = new Intent(this, Ejercicio_Toast.class);
            startActivity(ejercicio7);
        }else if (id == R.id.EjercicioPractivo) {
            finish();
            Intent ejercicioP = new Intent(this, Ejercicio_AdivinaElNumero.class);
            startActivity(ejercicioP);
        }
        return super.onOptionsItemSelected(item);
    }
}