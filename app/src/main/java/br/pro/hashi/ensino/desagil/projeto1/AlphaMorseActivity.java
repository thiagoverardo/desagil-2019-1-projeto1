package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
        Translator translator = new Translator();

        bt_back.setOnClickListener((view) -> {
            startMessageActivity();
        });

        lista1.setText("");
        lista2.setText("");

        lista1.setText("A  |  " + translator.charToMorse('A') + "\n");
        lista1.setText(lista1.getText() + "B  |  " + translator.charToMorse('B') + "\n");
        lista1.setText(lista1.getText() + "C  |  " + translator.charToMorse('C') + "\n");
        lista1.setText(lista1.getText() + "D  |  " + translator.charToMorse('D') + "\n");
        lista1.setText(lista1.getText() + "E  |  " + translator.charToMorse('E') + "\n");
        lista1.setText(lista1.getText() + "F  |  " + translator.charToMorse('F') + "\n");
        lista1.setText(lista1.getText() + "G  |  " + translator.charToMorse('G') + "\n");
        lista1.setText(lista1.getText() + "H  |  " + translator.charToMorse('H') + "\n");
        lista1.setText(lista1.getText() + "I  |  " + translator.charToMorse('I') + "\n");
        lista1.setText(lista1.getText() + "J  |  " + translator.charToMorse('J') + "\n");
        lista1.setText(lista1.getText() + "K  |  " + translator.charToMorse('K') + "\n");
        lista1.setText(lista1.getText() + "L  |  " + translator.charToMorse('L') + "\n");
        lista1.setText(lista1.getText() + "M  |  " + translator.charToMorse('M') + "\n");
        lista1.setText(lista1.getText() + "N  |  " + translator.charToMorse('N') + "\n");
        lista1.setText(lista1.getText() + "O  |  " + translator.charToMorse('O') + "\n");
        lista1.setText(lista1.getText() + "P  |  " + translator.charToMorse('P') + "\n");
        lista1.setText(lista1.getText() + "Q  |  " + translator.charToMorse('Q') + "\n");
        lista1.setText(lista1.getText() + "R  |  " + translator.charToMorse('R') + "\n");

        lista2.setText("S  |  " + translator.charToMorse('S') + "\n");
        lista2.setText(lista2.getText() + "T  |  " + translator.charToMorse('T') + "\n");
        lista2.setText(lista2.getText() + "U  |  " + translator.charToMorse('U') + "\n");
        lista2.setText(lista2.getText() + "V  |  " + translator.charToMorse('V') + "\n");
        lista2.setText(lista2.getText() + "W  |  " + translator.charToMorse('W') + "\n");
        lista2.setText(lista2.getText() + "X  |  " + translator.charToMorse('X') + "\n");
        lista2.setText(lista2.getText() + "Y  |  " + translator.charToMorse('Y') + "\n");
        lista2.setText(lista2.getText() + "Z  |  " + translator.charToMorse('Z') + "\n");
        lista2.setText(lista2.getText() + "1  |  " + translator.charToMorse('1') + "\n");
        lista2.setText(lista2.getText() + "2  |  " + translator.charToMorse('2') + "\n");
        lista2.setText(lista2.getText() + "3  |  " + translator.charToMorse('3') + "\n");
        lista2.setText(lista2.getText() + "4  |  " + translator.charToMorse('4') + "\n");
        lista2.setText(lista2.getText() + "5  |  " + translator.charToMorse('5') + "\n");
        lista2.setText(lista2.getText() + "6  |  " + translator.charToMorse('6') + "\n");
        lista2.setText(lista2.getText() + "7  |  " + translator.charToMorse('7') + "\n");
        lista2.setText(lista2.getText() + "8  |  " + translator.charToMorse('8') + "\n");
        lista2.setText(lista2.getText() + "9  |  " + translator.charToMorse('9') + "\n");
        lista2.setText(lista2.getText() + "0  |  " + translator.charToMorse('0') + "\n");
    }
}
