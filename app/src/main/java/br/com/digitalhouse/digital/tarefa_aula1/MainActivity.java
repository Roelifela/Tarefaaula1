package br.com.digitalhouse.digital.tarefa_aula1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonEnviar;
    private EditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.edit_text_nome);
        editTextEmail = findViewById(R.id.edit_text_email);


        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editTextNome.getText().toString();
                if (nome.equals("")){
                    Toast.makeText(MainActivity.this,"Nome não pode ser vazio", Toast.LENGTH_SHORT).show();
                    return;
                }

                String email = editTextEmail.getText().toString();
                if (nome.equals("")){
                    Toast.makeText(MainActivity.this,"Email não pode ser vazio", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });



    }
}
