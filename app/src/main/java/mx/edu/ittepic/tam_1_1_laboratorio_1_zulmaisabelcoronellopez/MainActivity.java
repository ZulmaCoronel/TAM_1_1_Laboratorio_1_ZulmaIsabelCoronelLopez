package mx.edu.ittepic.tam_1_1_laboratorio_1_zulmaisabelcoronellopez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvTexto1, tvSalida;
    EditText caja;
    View boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTexto1 =(TextView) findViewById(R.id.tv1);
        tvSalida =(TextView) findViewById(R.id.tv2);
        caja =(EditText) findViewById(R.id.cajita);
        boton =(TextView) findViewById(R.id.boton1);
        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String salida;
        int resultado;
        tvSalida.setText("");
        String valor = caja.getText().toString();
        int tabla = Integer.parseInt(valor);
        for(int i=1; i<=10; i++){
            resultado = tabla * i;
            salida = tabla + " X " + i + " = " + resultado;
            tvSalida.append("\n" + salida);
        }

    }
}
