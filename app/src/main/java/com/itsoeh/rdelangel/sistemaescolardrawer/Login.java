package com.itsoeh.rdelangel.sistemaescolardrawer;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.itsoeh.rdelangel.sistemaescolardrawer.accesoADatos.AUsuario;

public class Login extends AppCompatActivity {
    private Button btnEntrada;
    private TextView btnRegistrar,btnRecuperar;
    private EditText txtCorreo, txtcontrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnEntrada = findViewById(R.id.login_btn_entrar);
        btnRegistrar = findViewById(R.id.login_txt_registrate);
        btnRecuperar = findViewById(R.id.login_txt_recuperar);
        txtcontrasenia = findViewById(R.id.login_txt_contrasenia);
        txtCorreo = findViewById(R.id.login_txt_usuario);
        btnEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicEntrar();
                limpiarCampos();
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicRegistro();
                limpiarCampos();
            }
        });
        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicRecuperar();
                limpiarCampos();
            }
        });

    }

    private void clicRecuperar() {
        Intent vamosARecuperar = new Intent(this, Recuperar.class);
        startActivity(vamosARecuperar);
    }

    private void clicRegistro() {
        Intent vamosARegistro = new Intent(this, Registro.class);
        startActivity(vamosARegistro);
    }

    private void clicEntrar() {
        String correo = txtCorreo.getText().toString().trim();
        String contra = txtcontrasenia.getText().toString().trim();

        if (correo.isEmpty() || contra.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        AUsuario usu = new AUsuario(this);
        String[] datos = usu.buscarContrasenia(correo);


        if (contra.equals(datos[1])) {
            Toast.makeText(this, "Bienvenido " + datos[0], Toast.LENGTH_LONG).show();
            Intent brinco = new Intent(this, MainActivity.class);
            startActivity(brinco);
        } else {
            AlertDialog.Builder aviso = new AlertDialog.Builder(this);
            aviso.setTitle("Error al ingresar ")
                    .setMessage("El usuario o contraseña son incorrectos")
                    .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();
        }
    }

    private void limpiarCampos() {
        // Limpiar el contenido de los EditText
        txtCorreo.setText("");
        txtcontrasenia.setText("");

    }
}