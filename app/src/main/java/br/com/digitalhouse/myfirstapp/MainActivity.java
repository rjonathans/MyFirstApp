package br.com.digitalhouse.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutMusica;
    private FloatingActionButton btnAdd;
    private TextView txtNomeMusica;
    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutMusica = findViewById(R.id.textinputLayoutMusica);
        btnAdd = findViewById(R.id.btnAdd);
        txtNomeMusica = findViewById(R.id.textViewNomeMusica);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String musica = inputLayoutMusica.getEditText().getText().toString();

                if (musica.isEmpty() || musica == "" || musica == null){
                    inputLayoutMusica.setError("Digite o nome de uma musica");
                }else{
                    txtNomeMusica.setText(musica);
                    Snackbar.make(inputLayoutMusica,"Musica "+musica+"adicionada com sucesso!",Snackbar.LENGTH_LONG).show();
                }
            }
        });



    }
}
