package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MorseAlphaActivity extends AppCompatActivity {

        private void startMessageActivity() {

            // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
            Intent intent = new Intent(this, MessageActivity.class);

            // Inicia a Activity especificada na Intent.
            startActivity(intent);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_alpha);
        Button bt_back = findViewById(R.id.back_button);
        TextView lista1 = findViewById(R.id.dict_list1);
        TextView lista2 = findViewById(R.id.dict_list2);
        Translator translator = new Translator();

        bt_back.setOnClickListener((view) -> {
            startMessageActivity();
        });

        lista1.setText("");
        lista2.setText("");

        lista1.setText(".  |  " + translator.morseToChar(".") + "\n");
        lista1.setText(lista1.getText() + "-  |  " + translator.morseToChar("-") + "\n");
        lista1.setText(lista1.getText() + "..  |  " + translator.morseToChar("..") + "\n");
        lista1.setText(lista1.getText() + ".-  |  " + translator.morseToChar(".-") + "\n");
        lista1.setText(lista1.getText() + "-.  |  " + translator.morseToChar("-.") + "\n");
        lista1.setText(lista1.getText() + "--  |  " + translator.morseToChar("--") + "\n");
        lista1.setText(lista1.getText() + "...  |  " + translator.morseToChar("...") + "\n");
        lista1.setText(lista1.getText() + "..-  |  " + translator.morseToChar("..-") + "\n");
        lista1.setText(lista1.getText() + ".-.  |  " + translator.morseToChar(".-.") + "\n");
        lista1.setText(lista1.getText() + ".--  |  " + translator.morseToChar(".--") + "\n");
        lista1.setText(lista1.getText() + "-..  |  " + translator.morseToChar("-..") + "\n");
        lista1.setText(lista1.getText() + "-.-  |  " + translator.morseToChar("-.-") + "\n");
        lista1.setText(lista1.getText() + "--.  |  " + translator.morseToChar("--.") + "\n");
        lista1.setText(lista1.getText() + "---  |  " + translator.morseToChar("---") + "\n");
        lista1.setText(lista1.getText() + "....  |  " + translator.morseToChar("....") + "\n");
        lista1.setText(lista1.getText() + "...-  |  " + translator.morseToChar("...-") + "\n");
        lista1.setText(lista1.getText() + "..-.  |  " + translator.morseToChar("..-.") + "\n");
        lista1.setText(lista1.getText() + ".-..  |  " + translator.morseToChar(".-..") + "\n");

        lista2.setText(".--.  |  " + translator.morseToChar(".--.") + "\n");
        lista2.setText(lista2.getText() + ".---  |  " + translator.morseToChar(".---") + "\n");
        lista2.setText(lista2.getText() + "-...  |  " + translator.morseToChar("-...") + "\n");
        lista2.setText(lista2.getText() + "-..-  |  " + translator.morseToChar("-..-") + "\n");
        lista2.setText(lista2.getText() + "-.-.  |  " + translator.morseToChar("-.-.") + "\n");
        lista2.setText(lista2.getText() + "-.--  |  " + translator.morseToChar("-.--") + "\n");
        lista2.setText(lista2.getText() + "--..  |  " + translator.morseToChar("--..") + "\n");
        lista2.setText(lista2.getText() + "--.-  |  " + translator.morseToChar("--.-") + "\n");
        lista2.setText(lista2.getText() + ".....  |  " + translator.morseToChar(".....") + "\n");
        lista2.setText(lista2.getText() + "....-  |  " + translator.morseToChar("....-") + "\n");
        lista2.setText(lista2.getText() + "...--  |  " + translator.morseToChar("...--") + "\n");
        lista2.setText(lista2.getText() + "..---  |  " + translator.morseToChar("..---") + "\n");
        lista2.setText(lista2.getText() + ".----  |  " + translator.morseToChar(".----") + "\n");
        lista2.setText(lista2.getText() + "-....  |  " + translator.morseToChar("-....") + "\n");
        lista2.setText(lista2.getText() + "--...  |  " + translator.morseToChar("--...") + "\n");
        lista2.setText(lista2.getText() + "---..  |  " + translator.morseToChar("---..") + "\n");
        lista2.setText(lista2.getText() + "----.  |  " + translator.morseToChar("----.") + "\n");
        lista2.setText(lista2.getText() + "-----  |  " + translator.morseToChar("-----") + "\n");
    }
}
