package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MessageActivity.MESSAGE);

        TextView mensagem = findViewById(R.id.text_message);

        mensagem.setText(message);
    }
}

