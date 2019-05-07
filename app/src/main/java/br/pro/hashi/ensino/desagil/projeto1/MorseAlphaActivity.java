package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

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

        StringBuilder texto1 = new StringBuilder();
        StringBuilder texto2 = new StringBuilder();
        StringBuilder texto3 = new StringBuilder();
        StringBuilder texto4 = new StringBuilder();
        StringBuilder texto5 = new StringBuilder();
        StringBuilder texto6 = new StringBuilder();

        for (int i = lista.subList(0, tamanho / 2).size() - 1; i >= 0; i--) {
            String code = lista.subList(0, tamanho / 2).get(i);
            texto1.insert(0, code);
            texto1.insert(0, "\n");
            texto2.insert(0, "|");
            texto2.insert(0, "\n");
            texto3.insert(0, translator.morseToChar(code));
            texto3.insert(0, "\n");
        }

        lista1.setText(texto1);
        lista2.setText(texto2);
        lista3.setText(texto3);

        for (int i = lista.subList(tamanho / 2, tamanho).size() - 1; i >= 0; i--) {
            String code = lista.subList(tamanho / 2, tamanho).get(i);
            texto4.insert(0, code);
            texto4.insert(0, "\n");
            texto5.insert(0, "|");
            texto5.insert(0, "\n");
            texto6.insert(0, translator.morseToChar(code));
            texto6.insert(0, "\n");
        }

        lista4.setText(texto4);
        lista5.setText(texto5);
        lista6.setText(texto6);
    }
}
