package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.LinkedList;

public class AlphaMorseActivity extends AppCompatActivity {

    private void startMessageActivity() {

        // Constrói uma Intent que corresponde ao pedido de "iniciar Activity".
        Intent intent = new Intent(this, MessageActivity.class);

        // Inicia a Activity especificada na Intent.
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_morse);
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

        LinkedList<String> listaLetras = new LinkedList<>();

        for (String code : lista) {
            String letra = String.valueOf(translator.morseToChar(code));
            listaLetras.add(letra);
        }

        Collections.sort(listaLetras);

        int tamanho = listaLetras.size();

        StringBuilder texto1 = new StringBuilder();
        StringBuilder texto2 = new StringBuilder();
        StringBuilder texto3 = new StringBuilder();
        StringBuilder texto4 = new StringBuilder();
        StringBuilder texto5 = new StringBuilder();
        StringBuilder texto6 = new StringBuilder();

        for (int i = listaLetras.subList(0, tamanho / 2).size() - 1; i >= 0; i--) {
            String letra = listaLetras.subList(0, tamanho / 2).get(i);
            texto1.insert(0, letra);
            texto1.insert(0, "\n");
            texto2.insert(0, "|");
            texto2.insert(0, "\n");
            texto3.insert(0, translator.charToMorse(letra.charAt(0)));
            texto3.insert(0, "\n");
        }

        lista1.setText(texto1);
        lista2.setText(texto2);
        lista3.setText(texto3);

        for (int i = listaLetras.subList(tamanho / 2, tamanho).size() - 1; i >= 0; i--) {
            String letra = listaLetras.subList(tamanho / 2, tamanho).get(i);
            texto4.insert(0, letra);
            texto4.insert(0, "\n");
            texto5.insert(0, "|");
            texto5.insert(0, "\n");
            texto6.insert(0, translator.charToMorse(letra.charAt(0)));
            texto6.insert(0, "\n");
        }

        lista4.setText(texto4);
        lista5.setText(texto5);
        lista6.setText(texto6);

    }
}
