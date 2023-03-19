package com.example.antinlaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput1 = findViewById(R.id.Luku1);
        textInput2 = findViewById(R.id.Luku2);
        textOutput = findViewById(R.id.Tuloste);
    }
    public void LaskePlus(View view){
        float Luku1;
        float Luku2;

        if (textInput1.getText().toString().equals("")){
            Luku1 = 0;}
        else {
            Luku1 = Float.parseFloat(textInput1.getText().toString());
        }
        if (textInput2.getText().toString().equals("")){
            Luku2 = 0;}
        else{
        Luku2 = Float.parseFloat(textInput2.getText().toString());}

        float Summa = (Luku1 + Luku2);

        // System.out.println((Summa));
        StringBuilder sb = new StringBuilder(String.valueOf(Summa));
        textOutput.setText(sb.toString());
    }
    public void LaskeMinus(View view){
        float Luku1;
        float Luku2;

        if (textInput1.getText().toString().equals("")){
            Luku1 = 0;}
        else {
            Luku1 = Float.parseFloat(textInput1.getText().toString());
        }
        if (textInput2.getText().toString().equals("")){
            Luku2 = 0;}
        else{
            Luku2 = Float.parseFloat(textInput2.getText().toString());}

        float Erotus = (Luku1 - Luku2);
        // System.out.println((Erotus));
        StringBuilder sb = new StringBuilder(String.valueOf(Erotus));
        textOutput.setText(sb.toString());
    }
    public void LaskeJako(View view){
        float Luku1;
        float Luku2;

        if (textInput1.getText().toString().equals("")){
            Luku1 = 0;}
        else {
            Luku1 = Float.parseFloat(textInput1.getText().toString());
        }
        if (textInput2.getText().toString().equals("")){
            Luku2 = 0;}
        else{
            Luku2 = Float.parseFloat(textInput2.getText().toString());}

        if (Luku2 == 0){
            StringBuilder sb = new StringBuilder("Nollalla ei voi jakaa!");
            textOutput.setText(sb.toString());
        }
        else {
            float Jako = (Luku1 / Luku2);
            // System.out.println((Jako));
            StringBuilder sb = new StringBuilder(String.valueOf(Jako));
            textOutput.setText(sb.toString());
        }
    }

    public void LaskeKerto(View view){
        float Luku1;
        float Luku2;

        if (textInput1.getText().toString().equals("")){
            Luku1 = 0;}
        else {
            Luku1 = Float.parseFloat(textInput1.getText().toString());
        }
        if (textInput2.getText().toString().equals("")){
            Luku2 = 0;}
        else{
            Luku2 = Float.parseFloat(textInput2.getText().toString());}
        float Kerto = (Luku1 * Luku2);
        // System.out.println((Kerto));
        StringBuilder sb = new StringBuilder(String.valueOf(Kerto));
        textOutput.setText(sb);
    }

}