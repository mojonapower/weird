package com.example.ditha.flexlarnmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Index extends AppCompatActivity {

    private TextView title;
    private EditText code_field;
    private Button ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        ingreso= (Button) findViewById(R.id.Ingresar);
        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nexr= new Intent(Index.this, Sensor_list.class);
                startActivity(nexr);

            }
        });

    }
}
