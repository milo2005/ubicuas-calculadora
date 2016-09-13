package com.unicauca.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button btnSumar, btnRestar, btnDiv, btnMul;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);

        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);

        result = (TextView) findViewById(R.id.resultado);

        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);

        int r = 0;

        switch (view.getId()){
            case R.id.btnSumar:
                r = ni1 + ni2;
                break;
            case R.id.btnRestar:
                r = ni1 - ni2;
                break;
            case R.id.btnMul:
                r = ni1 * ni2;
                break;
            case R.id.btnDiv:
                r = ni1 / ni2;
                break;
        }

        result.setText(""+r);
    }
}
