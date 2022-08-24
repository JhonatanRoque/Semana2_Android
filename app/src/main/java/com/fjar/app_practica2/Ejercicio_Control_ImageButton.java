package com.fjar.app_practica2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Ejercicio_Control_ImageButton extends AppCompatActivity {
    private TextView tv1;
    private ImageButton bi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_control_image_button);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu;this adds items to the action bar if it is present.
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
        }else if (id == R.id.EjercicioPractivo) {
            finish();
            Intent ejercicioP = new Intent(this, Ejercicio_AdivinaElNumero.class);
            startActivity(ejercicioP);
        }

        return super.onOptionsItemSelected(item);

    }
    //Este método se ejecutará cuando se presione el imageButton
    public void llamar (View view) {
        tv1.setText("Llamando");

    }
}
