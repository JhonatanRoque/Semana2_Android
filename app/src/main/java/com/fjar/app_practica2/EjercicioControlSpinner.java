package com.fjar.app_practica2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class EjercicioControlSpinner extends AppCompatActivity {
    private Spinner spinner1;
    private EditText edt1, edt2;
    private TextView txtRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_control_spinner);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        txtRes = (TextView) findViewById(R.id.tXtResul);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view)
    {
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();
        if(selec.equals("sumar")){
            int suma = n1 + n2;
            String resu = String.valueOf(suma);
            txtRes.setText(resu);
        }else if(selec.equals("restar")){
            int resta = n1 - n2;
            String resu = String.valueOf(resta);
            txtRes.setText(resu);
        }else if(selec.equals("multiplicar")){
            int multi = n1 * n2;
            String resu = String.valueOf(multi);
            txtRes.setText(resu);
        }else if(selec.equals("dividir")){
            int divicion = n1 / n2;
            String resu = String.valueOf(divicion);
            txtRes.setText(resu);
        }
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
        }
        return super.onOptionsItemSelected(item);
    }
}