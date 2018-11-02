package com.example.przemo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String wynik;

    public void calc(View view) {
        Log.i("b", "przycisk pressed");

        EditText editText = (EditText) findViewById(R.id.editText1);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Tax tax = new Tax();

        textView.setText("Podatek do zapłaty: ");
        textView.append(tax.calculateTax(editText.getText().toString()));


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Podatek do zapłaty: ---");

    }
}
