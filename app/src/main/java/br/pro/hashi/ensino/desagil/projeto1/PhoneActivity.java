package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }

    private void startMessageActivity() {

        // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
        Intent intent = new Intent(this, MessageActivity.class);

        // Inicia a Activity especificada na Intent.
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MessageActivity.MESSAGE);

        TextView mensagem = findViewById(R.id.text_message);
        TextView numero = findViewById(R.id.edit_number);
        TextView morse = findViewById(R.id.morse_field);
        Button bt_morse = findViewById(R.id.morse_button);
        Button bt_send = findViewById(R.id.send_button);
        Button bt_backspace = findViewById(R.id.backspace_button);
        Button bt_back = findViewById(R.id.back_button);
        Button bt_cuidador = findViewById(R.id.number_cuidador);
        Button bt_brother = findViewById(R.id.number_brother);
        Translator translator = new Translator();

        mensagem.setText(message);

        bt_morse.setOnLongClickListener((view) -> {
            morse.setText(morse.getText() + "-");
            return true;
        });

        bt_morse.setOnClickListener((view) -> morse.setText(morse.getText() + "."));

        bt_send.setOnClickListener((view) -> {
            String code = morse.getText().toString();
            if (code.length() == 5) {
                char letra = translator.morseToChar(code);
                if (letra == ' ') {
                    numero.setText(numero.getText());
                    showToast("Caractere inválido!");
                } else {
                    numero.setText(numero.getText().toString() + letra);
                }
            } else {
                numero.setText(numero.getText());
                showToast("Caractere inválido!");
            }
            morse.setText("");
        });

        bt_send.setOnLongClickListener((view) -> {
            String send_message = mensagem.getText().toString();
            String phone = numero.getText().toString();

            if (!PhoneNumberUtils.isGlobalPhoneNumber(phone)) {
                showToast("Número inválido!");
                return true;
            }

            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(phone, null, send_message, null, null);

            showToast("Mensagem enviada!");

            startMessageActivity();
            return true;
        });

        bt_backspace.setOnClickListener((view) -> {
            String escrito = numero.getText().toString();
            int tamanho = escrito.length();
            if (tamanho != 0) {
                String novo = escrito.substring(0, tamanho - 1);
                numero.setText(novo);
            } else {
                numero.setText("");
            }
        });

        bt_backspace.setOnLongClickListener((view) -> {
            numero.setText("");
            return true;
        });

        bt_back.setOnClickListener((view) -> startMessageActivity());


        bt_brother.setOnClickListener((view) -> numero.setText("11111111"));

        bt_cuidador.setOnClickListener((view) -> numero.setText("22222222"));
    }
}

