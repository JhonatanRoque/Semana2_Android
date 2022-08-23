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
import android.widget.RadioButton;
import android.widget.TextView;

public class Ejercicio2_RadioGrpBtn extends AppCompatActivity {
    private Button btnAccion;
    private RadioButton radB1, radB2;
    private TextView tvResultado;
    private EditText edt1, edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_radio_grp_btn);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        tvResultado = (TextView) findViewById(R.id.txtResultado);
        radB1 = (RadioButton) findViewById(R.id.r1);
        radB2 = (RadioButton) findViewById(R.id.r2);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view){
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        if(valor1.length() == 0){
            edt1.setError("Ingrese un número en el campo");
        }else if(valor2.length() == 0){
            edt2.setError("Ingrese un número en el campo");
        }else{
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            if(radB1.isChecked() == true){
                int suma = n1 + n2;
                tvResultado.setText(String.valueOf(suma));
            }else if (radB2.isChecked() == true){
                int restar = n1 - n2;
                tvResultado.setText(String.valueOf(restar));
            }
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