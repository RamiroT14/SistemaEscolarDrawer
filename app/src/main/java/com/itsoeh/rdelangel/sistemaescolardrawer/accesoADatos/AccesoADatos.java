package com.itsoeh.rdelangel.sistemaescolardrawer.accesoADatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AccesoADatos extends SQLiteOpenHelper {

    public AccesoADatos(@Nullable Context context) {
        super(context,"SisEscolar", null, 3);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE usuario ("+
                "idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT,"+
                "app TEXT,"+
                "apm TEXT,"+
                "mail TEXT,"+
                "contra TEXT)"
        );
        db.execSQL("CREATE TABLE Proyecto("+
                "idProyecto INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "NombreProyecto TEXT,"+
                "categoria TEXT,"+
                "grado INT,"+
                "grupo INT,"+
                "descripcion TEXT)"
        );

        db.execSQL("CREATE TABLE Evaluacion("+
                "idEvaluaciom INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "pregunta TEXT,"+
                "calificacion INT,"+
                "FOREIGN KEY (idEvaluador) REFERENCES Evaluador(idEvaluador), "+
                "FOREIGN KEY (idProyecto) REFERENCES Proyecto(idProyecto))"
        );

    }








    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
