package com.example.jesus.numerosprimos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PrimosActivity extends Activity implements View.OnClickListener{

    // referencias a los elementos utilizados
    Button boton;
    TextView titulo;
    TextView problema;
    TextView posicion;
    TextView resultado;


    EditText eTNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primos);



        boton= (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        eTNumero=(EditText) findViewById(R.id.editText);
        


    }

    public TextView getPosicion() {


        return posicion;
    }
}
