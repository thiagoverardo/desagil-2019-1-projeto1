package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MessageActivity extends AppCompatActivity {
    public static final String MESSAGE = "br.pro.hashi.ensino.desagil.projeto1.MESSAGE";

    private String mensagem;

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }

    private void startPhoneActivity() {

        // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
        Intent intent = new Intent(this, PhoneActivity.class);
        intent.putExtra(MESSAGE, mensagem);
        // Inicia a Activity especificada na Intent.
        startActivity(intent);
    }

    private void startAlphaMorseActivity() {

        // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
        Intent intent = new Intent(this, AlphaMorseActivity.class);
        // Inicia a Activity especificada na Intent.
        startActivity(intent);
    }

    private void startMorseAlphaActivity() {

        // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
        Intent intent = new Intent(this, MorseAlphaActivity.class);
        // Inicia a Activity especificada na Intent.
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Button bt_message1 = findViewById(R.id.message1);
        Button bt_message2 = findViewById(R.id.message2);
        Button bt_message3 = findViewById(R.id.message3);
        Button bt_message4 = findViewById(R.id.message4);
        Button bt_morse = findViewById(R.id.morse_button);
        Button bt_enter = findViewById(R.id.enter_button);
        Button bt_back = findViewById(R.id.backspace_button);
        Button bt_alphamorse = findViewById(R.id.alpha_morse);
        Button bt_morsealpha = findViewById(R.id.morse_alpha);
        TextView morse = findViewById(R.id.morse_field);
        TextView alfanum = findViewById(R.id.text_alpha);
        Translator translator = new Translator();

        bt_message1.setOnClickListener((view) -> alfanum.setText("ESTOU COM FOME"));

        bt_message2.setOnClickListener((view) -> alfanum.setText("ESTOU COM SEDE"));

        bt_message3.setOnClickListener((view) -> alfanum.setText("QUERO IR AO BANHEIRO"));

        bt_message4.setOnClickListener((view) -> alfanum.setText("ESTOU COM SONO"));

        bt_morse.setOnLongClickListener((view) -> {
            morse.setText(morse.getText() + "-");
            return true;
        });

        bt_morse.setOnClickListener((view) -> morse.setText(morse.getText() + "."));

        bt_enter.setOnClickListener((view) -> {
            String code = morse.getText().toString();
            if (code.length() <= 5) {
                char letra = translator.morseToChar(code);
                if (Objects.equals(code, "")) {
                    alfanum.setText(alfanum.getText() + " ");
                } else if (letra == ' ') {
                    alfanum.setText(alfanum.getText());
                    showToast("Caractere inválido!");
                } else {
                    alfanum.setText(alfanum.getText().toString() + letra);
                }
            } else {
                alfanum.setText(alfanum.getText());
                showToast("Caractere inválido!");
            }
            morse.setText("");
        });

        bt_enter.setOnLongClickListener((view) -> {
            String message = alfanum.getText().toString();

            if (message.isEmpty()) {
                showToast("Mensagem inválida!");
                return true;
            }

            this.mensagem = alfanum.getText().toString();

            startPhoneActivity();

            alfanum.setText("");
            return true;
        });

        bt_back.setOnClickListener((view) -> {
            String escrito = alfanum.getText().toString();
            int tamanho = escrito.length();
            if (tamanho != 0) {
                String novo = escrito.substring(0, tamanho - 1);
                alfanum.setText(novo);
            } else {
                alfanum.setText("");
            }
        });

        bt_back.setOnLongClickListener((view) -> {
            alfanum.setText("");
            return true;
        });

        bt_alphamorse.setOnClickListener((view) -> startAlphaMorseActivity());

        bt_morsealpha.setOnClickListener((view) -> startMorseAlphaActivity());
    }
}
