package com.example.mx.tesoem.isc.njrcgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GridView gvdatos;
        contenido contenido;
        contenido contenido2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos=findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo= new ArrayList<String>();
        arreglo.add("El Versa");
        arreglo.add("Mitzi");
        arreglo.add("Tecoya");
        arreglo.add("Guadalupe");
        arreglo.add("Shio");
        arreglo.add("Yayo");
        arreglo.add("Simi");
        arreglo.add("Pedro");
        arreglo.add("Alma");
        arreglo.add("Kike");
        arreglo.add("Nashh");
        arreglo.add("Nashh");
        arreglo.add("Nashh");
        arreglo.add("Nashh");
        arreglo.add("Nashh");
        arreglo.add("Nashh");







        contenido= new contenido(this,arreglo);
        gvdatos.setAdapter(contenido);

    }
}
