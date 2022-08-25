package com.fjar.app_practica2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_AdivinaElNumero extends AppCompatActivity {
    private EditText edt1;
    private TextView txtV, txt1;
    private Button btnAdivinar;
    int numeroAleatorio = 1;

    int[] numerosLogrados = new int[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_adivina_el_numero);

        //Referenciar los objetos con nuestras variables
        edt1 = (EditText) findViewById(R.id.edtNumero);
        btnAdivinar = (Button) findViewById(R.id.btnAdivinar);
        txtV = (TextView) findViewById(R.id.txtVeces);
        txt1 = (TextView) findViewById(R.id.txt1);

        //ThreadLocalRandom random = ThreadLocalRandom.current();
        //Random random = new Random();
        GenerarAleatorio();
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Ejercicio1) {
            finish();
            Intent ejercicio1 = new Intent(this, MainActivity.class);
            startActivity(ejercicio1);
        } else if (id == R.id.Ejercicio2) {
            finish();
            Intent ejercicio2 = new Intent(this, Ejercicio2_RadioGrpBtn.class);
            startActivity(ejercicio2);
        } else if (id == R.id.Ejercicio3) {
            finish();
            Intent ejercicio3 = new Intent(this, EjercicioCheckBox.class);
            startActivity(ejercicio3);
        } else if (id == R.id.Ejercicio4) {
            finish();
            Intent ejercicio4 = new Intent(this, EjercicioControlSpinner.class);
            startActivity(ejercicio4);
        } else if (id == R.id.Ejercicio5) {
            finish();
            Intent ejercicio5 = new Intent(this, EjercicioControlListView.class);
            startActivity(ejercicio5);
        } else if (id == R.id.Ejercicio6) {
            finish();
            Intent ejercicio6 = new Intent(this, Ejercicio_Control_ImageButton.class);
            startActivity(ejercicio6);
        }else if (id == R.id.Ejercicio7) {
            finish();
            Intent ejercicio7 = new Intent(this, Ejercicio_Toast.class);
            startActivity(ejercicio7);
        }else if (id == R.id.Ejercicio8) {
            finish();
            Intent ejercicio8 = new Intent(this, Ejercicio_EditText.class);
            startActivity(ejercicio8);
        }else if (id == R.id.Ejercicio9) {
            finish();
            Intent ejercicio9 = new Intent(this, Ejercicio_segundoActivity.class);
            startActivity(ejercicio9);
        }else if (id == R.id.Ejercicio10) {
            finish();
            Intent ejercicio10 = new Intent(this, Registrar.class);
            startActivity(ejercicio10);
        }else if (id == R.id.Ejercicio11) {
            finish();
            Intent ejercicio11 = new Intent(this, Ejercicio_segundaActivity2.class);
            startActivity(ejercicio11);

        }else if (id == R.id.EjercicioPractivo) {
            finish();
            Intent ejercicioP = new Intent(this, Ejercicio_AdivinaElNumero.class);
            startActivity(ejercicioP);
        }


        return super.onOptionsItemSelected(item);

    }

    public void Adivinar (View v)
    {
        int numero = Integer.parseInt(edt1.getText().toString());
        if(numero > numeroAleatorio){
            Toast.makeText(this, "El número es mayor al número a encontrarse", Toast.LENGTH_SHORT).show();
        }else if (numero < numeroAleatorio){
            Toast.makeText(this, "El número es menor al número a encontrarse", Toast.LENGTH_SHORT).show();
        }else if (numero == numeroAleatorio ){
            int logrado = Integer.parseInt(txtV.getText().toString());
            logrado += 1;
            numerosLogrados[logrado] = numero;
            String n = "";
            for (int i = 1; i <= logrado; i++){
                if(numerosLogrados[i] == numeroAleatorio){
                    GenerarAleatorio();
                }
            }
            GenerarAleatorio();
            Toast.makeText(this, "¡Advinaste el número, FELCIDADES!", Toast.LENGTH_SHORT).show();
            txtV.setText(String.valueOf(logrado));
        }
        if(numerosLogrados.length == 50){
            Toast.makeText(this, "Ha encontrado todos los números posibles", Toast.LENGTH_SHORT).show();
            btnAdivinar.setEnabled(false);
        }
    }

    public void GenerarAleatorio(){
        ThreadLocalRandom random = ThreadLocalRandom.current();
        numeroAleatorio = random.nextInt(1, 51);

    }
}