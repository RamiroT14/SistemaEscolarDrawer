package com.itsoeh.rdelangel.sistemaescolardrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.itsoeh.rdelangel.sistemaescolardrawer.accesoADatos.AUsuario;
import com.itsoeh.rdelangel.sistemaescolardrawer.modelo.MUsuario;

public class Registro extends AppCompatActivity {

    private Button btnGuardar;
    private EditText txtNombre,txtApg,txtDep,txtMail,txtContra,txtContra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombre = findViewById(R.id.registrate_txt_nombre);
        txtApg = findViewById(R.id.registrate_txt_app);
        txtDep = findViewById(R.id.registrate_txt_apm);
        txtMail = findViewById(R.id.registrate_txt_correo);
        txtContra = findViewById(R.id.registrate_txt_contra1);
        txtContra2= findViewById(R.id.registrate_txt_contra1);
        btnGuardar= findViewById(R.id.registrate_btn_guardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clicGuardar();
                limpiarCampos();
                regresaLogin();
            }
        });

    }



    private void clicGuardar() {
        // Obtener el texto de los campos
        String nombre = txtNombre.getText().toString();
        String app = txtApg.getText().toString();
        String apm = txtDep.getText().toString();
        String email = txtMail.getText().toString();
        String contraseña = txtContra.getText().toString();
        String confirmarContraseña = txtContra2.getText().toString();

        // Verificar si algún campo está vacío
        if (nombre.isEmpty() || app.isEmpty() || apm.isEmpty() || email.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_LONG).show();
            return;  // No continúa con el proceso si hay campos vacíos
        }

        // Verificar si las contraseñas coinciden
        if (!contraseña.equals(confirmarContraseña)) {
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
            return;  // No continúa con el proceso si las contraseñas no coinciden
        }

        // Guardar la información
        AUsuario g = new AUsuario(this);
        MUsuario x = new MUsuario();
        x.setNombre(nombre);
        x.setApp(app);
        x.setApm(apm);
        x.setEmail(email);
        x.setContra(contraseña);

        try {
            g.guardar(x);
            Toast.makeText(this, "El registro se guardó con éxito", Toast.LENGTH_LONG).show();
            limpiarCampos();
        } catch (Exception ex) {
            Toast.makeText(this, "Error al guardar el registro", Toast.LENGTH_LONG).show();
        }
    }

    private void limpiarCampos() {
        // Limpiar el contenido de los EditText
        txtNombre.setText("");
        txtApg.setText("");
        txtDep.setText("");
        txtMail.setText("");
        txtContra.setText("");
        txtContra2.setText("");
    }

    private void regresaLogin() {
        Toast.makeText(this, "Inicia secion", Toast.LENGTH_LONG).show();
        Intent brinco = new Intent(this, Login.class);
        startActivity(brinco);
    }
}