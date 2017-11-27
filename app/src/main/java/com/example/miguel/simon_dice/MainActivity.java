package com.example.miguel.simon_dice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String cadena = "¿Estas seguro de que deseas salir y finalizar la partida?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetPart(View view) { //para reiniciar la partida
        Toast toast =
                Toast.makeText(getApplicationContext(), "Reiniciando Partida", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startPart(View view) { //para iniciar la partida
        Toast toast =
                Toast.makeText(getApplicationContext(), "Comenzando Partida", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void salir (View view){ //para salir de la aplicacion con un dialogo de confirmacion

            //se prepara la alerta creando nueva instancia
            AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
            //seleccionamos la cadena a mostrar
            alertbox.setMessage(cadena);
            //elegimos un positivo SI y creamos un Listener
            alertbox.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent salida=new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
                    finish();
                }
            });

            //elegimos un positivo NO y creamos un Listener
            alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            //mostramos el alertbox
            alertbox.show();

    }


}