package com.fjar.app_practica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fjar.app_practica2.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnSumar;
    private EditText edt1, edt2;
    private TextView tvResultado;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tvResultado = (TextView) findViewById(R.id.txtResultado);
        btnSumar = findViewById(R.id.btnSumar);

    }
     //Este método se ejecutará cuando se presione el botón
    public void Sumar(View view){
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        if(valor1.length() == 0){
            edt1.setError("Ingrese un dato para el valor 1");
        }else if(valor2.length() == 0){
            edt2.setError("Ingrese un dato para el valor 2");
        }else {
            int num1 = Integer.parseInt(valor1);
            int num2 = Integer.parseInt(valor2);
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            tvResultado.setText(resultado);
        }
    }

    public void ejercicio2(View view){
        Intent ejercicio2 = new Intent(MainActivity.this, Ejercicio2_RadioGrpBtn.class);
        startActivity(ejercicio2);
    }
    public void ejercicio3(View view){
        Intent ejercicio3 = new Intent(MainActivity.this, EjercicioCheckBox.class);
        startActivity(ejercicio3);
    }
}