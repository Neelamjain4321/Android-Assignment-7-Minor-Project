package com.scott.annie.convertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Currency extends AppCompatActivity {
    float a;
    Button b1,b2;
    EditText usd,inr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency);
    }
    void convertINRToUSD()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText inr=(EditText) findViewById(R.id.inr);
        inr.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(inr.getText().toString());
        double result=a/65.21;
        usd.setText(String.valueOf(result));
    }



    private void convertUSDToINR() {
        {  EditText usd= (EditText) findViewById(R.id.usd);
            usd.setInputType(InputType.TYPE_CLASS_NUMBER);

            EditText  inr=(EditText) findViewById(R.id.inr);
            inr.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a=Integer.parseInt(usd.getText().toString());
            double result=a*65.21;
            inr.setText(String.valueOf(result));

        }
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.usdtoinr);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.inrtousd);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  bdt=(EditText) findViewById(R.id.inr);
        usd.setText("");
        bdt.setText("");

    }

    public void click2(View view)
    {
        convertINRToUSD();
        Button b1=(Button) findViewById(R.id.usdtoinr);
        b1.setEnabled(false);

    }

    public void click(View view)
    {
        convertUSDToINR();
        Button b2=(Button) findViewById(R.id.inrtousd);
        b2.setEnabled(false);
    }

}
