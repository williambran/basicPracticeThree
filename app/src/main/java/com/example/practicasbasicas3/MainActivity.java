package com.example.practicasbasicas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numDecimal;
    private TextView hora,mins,segs,desegs;
    private Button btnConverte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numDecimal = findViewById(R.id.et_number);
        hora = findViewById(R.id.tv_hora);
        mins = findViewById(R.id.tv_minuto);
        segs = findViewById(R.id.tv_segundo);
        desegs = findViewById(R.id.tv_desima);

        btnConverte = findViewById(R.id.btn_convert);
        
        btnConverte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirDecimal();
            }
        });

    }

    public void convertirDecimal(){
        String numReal = numDecimal.getText().toString();
        int hor, min,seg,dseg;
        double numero1 = Double.parseDouble(numReal);
        //conversion a unidades pedidas
        hor = (int)numero1;
        numero1 = (numero1 - hor) * 60;
        min = (int) numero1 ;
        numero1 =  (numero1 - min ) * 60;
        seg = (int) numero1;
        numero1 = (seg - numero1) * 60;
        dseg =  (int) numero1;

        String result = "";
        String result1 = "";
        String result2= "";
        String result3 = "";

        result  = "El total de Horas es :"+ hor + "\n";
        result1 = "El total de Minutos es : " + min + "\n";
        result2 = "El total de Segundos es :"+ seg + "\n";
        result3 = "El total de Decimos de segundos es :" + seg +"\n";


        hora.setText(result);
        mins.setText(result1);
        segs.setText(result2);
        desegs.setText(result3);
    }
}