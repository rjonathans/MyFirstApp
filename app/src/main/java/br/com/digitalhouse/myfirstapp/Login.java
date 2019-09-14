package br.com.digitalhouse.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private TextInputLayout inputLayoutName;
    private TextInputLayout inputLayoutTel;
    private Button btnAdd;

    public static final String NOME_KEY = "nome";  // isso é uma constante
    public static final String TELEFONE_KEY = "telefone"; // isso tambem é uma constante


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLayoutName = findViewById(R.id.inputName);
        inputLayoutTel = findViewById(R.id.inputTelefone);
        btnAdd = findViewById(R.id.btnAddLogin);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = inputLayoutName.getEditText().getText().toString();
                String telefone = inputLayoutTel.getEditText().getText().toString();

                if(name.isEmpty() || name == null){
                    inputLayoutName.setError("Nome Inválido");
                }else{
                    Intent intent = new Intent(Login.this, Home.class);

                    Bundle bundle = new Bundle();
                    bundle.putString(NOME_KEY, name);
                    bundle.putString(TELEFONE_KEY, telefone);

                    intent.putExtras(bundle);

                    startActivity(intent);
                }

            }
        });


    }
}
