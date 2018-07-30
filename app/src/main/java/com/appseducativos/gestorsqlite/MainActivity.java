package com.appseducativos.gestorsqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText e_cod,e_nom,e_can,e_img;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Cursor registros_totales;
    SQLiteDatabase MiBasededatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_cod=findViewById(R.id.editText);
        e_nom=findViewById(R.id.editText2);
        e_can=findViewById(R.id.editText3);
        e_img=findViewById(R.id.editText4);


        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

       AUXILIARSQLITE miauxiliar=new AUXILIARSQLITE(/*getAppicatinContext*/MainActivity.this,"Tienda",null,1)
        MiBasededatos=miauxiliar.getWritableDatabase();
       registros_totales=MiBasededatos.rawQuery("SELECT * FROM productos", null);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.button:
                //TODO Nuevo Registro
                break;
            case R.id.button2:
                //TODO Modificar Registro
                break;
            case R.id.button3:
                //TODO Eliminar Registro
                break;
            case R.id.button4:
                //TODO Buscar algun Registro
                break;
            case R.id.button5:
                //TODO Ir al primer  Registro
                break;
            case R.id.button6:
                //TODO Ir al ultimo Registro siguiente
                break;
            case R.id.button7:
                //TODO Ir al siguiente Registro
                break;
            case R.id.button8:
                //TODO Ir al anterior Registro
                break;
            case R.id.button9:
                //TODO Limpiar campos de texto
                break;















        }







    }
}
