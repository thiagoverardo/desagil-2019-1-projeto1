package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        Button bt  = findViewById(R.id.morse_button);
        EditText edit = findViewById(R.id.morse_converted);

        bt.setOnLongClickListener((view) -> {
            edit.setText("1");
            //Toast.makeText(this, "LongClick", Toast.LENGTH_SHORT).show();
            return true;
        });

        bt.setOnClickListener((view) -> {
            edit.setText("0");
            //Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        });
    }
}
