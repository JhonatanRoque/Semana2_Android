package com.fjar.app_practica2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
        private EditText et2;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registrar);


            et2=(EditText) findViewById(R.id.editTextPassword);
        }
        @Override
        public boolean onCreateOptionsMenu (Menu menu) {
            //Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_registrar, menu);
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

        public void verificar2(View v){
            String clave=et2.getText().toString();
                 if(clave.equals("abc123")){
                Intent i = new Intent(this, Bienvenido.class);
                startActivity(i);
                startActivity(i);
            }
            else if(clave.length() ==0){
                Toast.makeText(this, "La clave no puede quedar vacia.",Toast.LENGTH_LONG).show();
            }
                else{
                     Toast.makeText(this, "La clave es incorrecta.",Toast.LENGTH_LONG).show();
                 }




            }
}


