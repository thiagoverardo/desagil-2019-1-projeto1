package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Button bt_morse  = findViewById(R.id.morse_button);
        Button bt_enter = findViewById(R.id.enter_button);
        EditText morse = findViewById(R.id.morse_converted);
        TextView alphanum = findViewById(R.id.text_alpha);
        Translator translator = new Translator();

        bt_morse.setOnLongClickListener((view) -> {
            morse.setText(morse.getText() + "-");
            //Toast.makeText(this, "LongClick", Toast.LENGTH_SHORT).show();
            return true;
        });

        bt_morse.setOnClickListener((view) -> {
            morse.setText(morse.getText() + ".");
            //Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        });

        bt_enter.setOnClickListener((view) -> {
            String code = morse.getText().toString();
            String letra = translator.morseToChar(code);
            if (letra == null) {
                alphanum.setText(alphanum.getText() + "");
                showToast("Caracter inválido!");
            } else {
                alphanum.setText(alphanum.getText() + letra);
                }
            morse.setText("");

        });
    }
}
