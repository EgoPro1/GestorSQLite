package com.appseducativos.gestorsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AUXILIARSQLITE extends SQLiteOpenHelper{
    //Aqui se encarga la creacion de la base de datos de la estructura interna de la base de datos,tablas y campos.
    String cadena1="CREATE TABLE productos(codigo_producto INT(4) PRIMARY KEY AUTOINCREMENT,"+
            "nombre_producto VARCHAR(255),"+
            "cantidad_producto INT (3)," +
            "imagen_producto VARCHAR(255)),";
    String cadena2="DROP TABLE IF EXISTS productos";

    public AUXILIARSQLITE(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(cadena1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(cadena2);
        sqLiteDatabase.execSQL(cadena1);
    }
}
