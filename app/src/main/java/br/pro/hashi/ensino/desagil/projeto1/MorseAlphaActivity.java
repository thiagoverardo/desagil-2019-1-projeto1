package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import java.util.LinkedList;

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
        TextView lista3 = findViewById(R.id.dict_list3);
        TextView lista4 = findViewById(R.id.dict_list4);
        TextView lista5 = findViewById(R.id.dict_list5);
        TextView lista6 = findViewById(R.id.dict_list6);
        Translator translator = new Translator();

        bt_back.setOnClickListener((view) -> startMessageActivity());

        lista1.setText("");
        lista2.setText("");
        lista3.setText("");
        lista4.setText("");
        lista5.setText("");
        lista6.setText("");

        LinkedList<String> lista = translator.getCodes();

        int tamanho = lista.size();

        for (String code: lista.subList(0, tamanho / 2)) {
            lista1.setText(lista1.getText() + code + "\n");
            lista2.setText(lista2.getText() + "|\n");
            lista3.setText(lista3.getText() + "" + translator.morseToChar(code) + "\n");
        }

        for (String code: lista.subList(tamanho / 2, tamanho)) {
            lista4.setText(lista4.getText() + code + "\n");
            lista5.setText(lista5.getText() + "|\n");
            lista6.setText(lista6.getText() + "" + translator.morseToChar(code) + "\n");
        }
    }
}
