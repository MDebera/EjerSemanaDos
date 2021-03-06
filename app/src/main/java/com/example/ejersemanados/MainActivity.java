package com.example.ejersemanados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*esto de abajo seria para vovler de la ACTB a esta */
        Intent i = getIntent();

        String nombreIngresado=i.getStringExtra( "nombre");
        ((TextView)findViewById(R.id.nombre)).setText(nombreIngresado);

        String fechaIngresada=i.getStringExtra( "fecha");
        ((TextView)findViewById(R.id.fecha)).setText(fechaIngresada);

        String descripcionIngresada=i.getStringExtra( "descripcion");
        ((TextView)findViewById(R.id.descripcion)).setText(descripcionIngresada);

        String fonoIngresado=i.getStringExtra( "fono");
        ((TextView)findViewById(R.id.fono)).setText(fonoIngresado);

        String mailIngresado=i.getStringExtra( "mail");
        ((TextView)findViewById(R.id.mail)).setText(mailIngresado);

    }


/* Un solo campo, anda bien
    public void callB(View v){
        Intent i = new Intent(this, ActB.class);
        TextView t = findViewById(R.id.nombre);
        String nombreIngresado = t.getText().toString();
        i.putExtra("nombre", nombreIngresado);
        startActivity(i);
        }
*/

    public void callB(View v){
        Intent i = new Intent(this, ActB.class);

        TextView t = findViewById(R.id.nombre);
        String nombreIngresado = t.getText().toString();
        i.putExtra("nombre", nombreIngresado);

        TextView f = findViewById(R.id.fecha);
        String fechaIngresada = f.getText().toString();
        i.putExtra("fecha", fechaIngresada);

        TextView d = findViewById(R.id.descripcion);
        String descripcionIngresada = d.getText().toString();
        i.putExtra("descripcion", descripcionIngresada);

        TextView ph = findViewById(R.id.fono);
        String fonoIngresado = ph.getText().toString();
        i.putExtra("fono", fonoIngresado);

        TextView m = findViewById(R.id.mail);
        String mailIngresado = m.getText().toString();
        i.putExtra("mail", mailIngresado);



        startActivity(i);
    }

}