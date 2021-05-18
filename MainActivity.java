package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void euoroConversion(View view){
        EditText amt=(EditText) findViewById(R.id.editTextTextPersonName);
        double a=Integer.parseInt(amt.getText().toString());
        a=a*(0.011);

        Toast.makeText(this, "Your rupee amount in EURO is "+a, Toast.LENGTH_SHORT).show();

    }
    public void dollarConversion(View view){
        EditText amt=(EditText) findViewById(R.id.editTextTextPersonName);
        double a=Integer.parseInt(amt.getText().toString());
        a=a*(73);

        Toast.makeText(this, "Your rupee amount in DOLLAR is "+a, Toast.LENGTH_SHORT).show();
    }
    public void poundConversion(View view){
        EditText amt=(EditText) findViewById(R.id.editTextTextPersonName);
        double a=Integer.parseInt(amt.getText().toString());
        a=a*(0.0097);

        Toast.makeText(this, "Your rupee amount in POUND is "+a, Toast.LENGTH_SHORT).show();
    }
    public void yenConversion(View view){
        EditText amt=(EditText) findViewById(R.id.editTextTextPersonName);
        double a=Integer.parseInt(amt.getText().toString());
        a=a*(1.49);

        Toast.makeText(this, "Your rupee amount in YEN is "+a, Toast.LENGTH_SHORT).show();
    }
    public void remnibiConversion(View view){
        EditText amt=(EditText) findViewById(R.id.editTextTextPersonName);
        double a=Integer.parseInt(amt.getText().toString());
        a=a*(0.088);

        Toast.makeText(this, "Your rupee amount in YUAN is "+a, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}