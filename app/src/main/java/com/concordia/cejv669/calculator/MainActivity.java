package com.concordia.cejv669.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.btn_add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //               int num1 = Integer.parseInt(editNum1.getText().toString());

                InputMethodManager imm =
                        (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                EditText n1=findViewById(R.id.number1);
                int num1 = Integer.parseInt(n1.getText().toString());

                EditText n2=findViewById(R.id.number2);
                int num2 = Integer.parseInt(n2.getText().toString());

                int r = num1 + num2;
                TextView tv1 = findViewById(R.id.result);

                tv1.setText(""+r);
            }
        });
    }
}
