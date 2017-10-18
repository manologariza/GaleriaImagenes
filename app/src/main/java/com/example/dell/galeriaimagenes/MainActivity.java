package com.example.dell.galeriaimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int []obraId={
            R.drawable.boti,
            R.drawable.cara,
            R.drawable.dega,
            R.drawable.gaug,
            R.drawable.goya,
            R.drawable.klim,
            R.drawable.leon,
            R.drawable.mane,
            R.drawable.remb,
            R.drawable.reno
    };

    String descripcion[]={
            "Boticelli: 'El nacimiento de la Primavera'",
            "Caravaggio: 'La conversión de San Pablo'",
            "Degas: 'La clase de baile'",
            "Gauguin:'Autoretrato con crucifijo'",
            "Goya: 'Los fusilamientos del 3 de mayo'",
            "Klimt: 'Madame Fritz",
            "Leonardo Da Vinci: 'La Gioconda'",
            "Manet: 'Desayuno sobre la hierba",
            "Rembrandt:'La ronda de noche",
            "Renoir: 'Mujer en el tocador'"
    };

    int i=0;
    int totalObras;

    Button btnPrevio, btnSiguiente;
    TextView tvDescripcionCuadro;
    ImageView imgvCuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrevio=(Button)findViewById(R.id.btnPrevio);
        btnSiguiente=(Button)findViewById(R.id.btnSiguiente);
        imgvCuadro=(ImageView)findViewById(R.id.imgvCuadro);
        tvDescripcionCuadro=(TextView)findViewById(R.id.tvDescripcionCuadro);

        //Hacemos los botones sensibles al clicado
        btnPrevio.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        totalObras = obraId.length;

    }

    //Desarramos el manejador de eventos de clicado sobre boton
    @Override
    public void onClick(View view) {
        int id=view.getId();
        if (id==R.id.btnSiguiente){
            i++;
            if(i==totalObras)
                i=0;
        }

        if (id==R.id.btnPrevio){
            i--;
            if(i==-1)
                i=totalObras-1;
        }

        imgvCuadro.setImageResource(obraId[i]);
        tvDescripcionCuadro.setText(descripcion[i]);

    }
}
