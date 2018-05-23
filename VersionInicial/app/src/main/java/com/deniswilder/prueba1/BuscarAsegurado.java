package com.deniswilder.prueba1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BuscarAsegurado extends AppCompatActivity {
    Button extension;
    Button btnCancelar;
    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_asegurado);

        extension = (Button) findViewById(R.id.BtnExtensionCI);
        btnCancelar = (Button) findViewById(R.id.BtnCarcelarBusqueda);
        listItems = getResources().getStringArray(R.array.array_extensiones);

        extension.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(BuscarAsegurado.this);
                mBuilder.setTitle("Pruebas zzz");
                mBuilder.setItems(listItems, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        extension.setText(listItems[which]);
                        dialogInterface.dismiss();
                    }
                });


                mBuilder.setNegativeButton("cancelar", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
