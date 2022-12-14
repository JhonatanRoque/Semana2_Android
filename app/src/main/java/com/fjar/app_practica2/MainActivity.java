package com.fjar.app_practica2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
            Intent  ejercicio6 = new Intent(this, Ejercicio_Control_ImageButton.class);
            startActivity(ejercicio6);
        }else if(id == R.id.Ejercicio7){
            Intent  ejercicio7 = new Intent(this, Ejercicio_Toast.class);
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


    //Este m??todo se ejecutar?? cuando se presione el bot??n
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
}