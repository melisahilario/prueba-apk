package com.ejemplo.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView texto = new TextView(this);
        texto.setText("Hola esto es una prueba");
        texto.setTextSize(24);
        texto.setGravity(Gravity.CENTER);
        setContentView(texto);
    }
}
