package com.example.ea2soa;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {

    private EditText txtUsuario;
    private EditText txtPassword;
    Button btnIniciarSesion;
    Button btnRegistrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnRegistrarUsuario = (Button) findViewById(R.id.btnRegistrarse);

        btnIniciarSesion.setOnClickListener(botonesListeners);
        btnRegistrarUsuario.setOnClickListener(botonesListeners);

        //Log.i( tag: "Ejecuto", msg: "Ejecuto onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    //actua como listerner de los eventos que ocurren en los componentes graficos de la activity
    private View.OnClickListener botonesListeners = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent;

            //Se determina que componente genero un evento
            switch (v.getId()) {
                //Si ocurrio un evento en Iniciar Sesionn
                case R.id.btnRegistrarse:

                    //se le agrega un intent para lanzar la activity de registro
                    intent = new Intent( MainActivity.this, RegistroActivity.class);

                    startActivity(intent);

                    break;

                default:
                    Toast.makeText(getApplicationContext(),  "Error en listener de botones", Toast.LENGTH_LONG).show();
            }
        }
    };
}
