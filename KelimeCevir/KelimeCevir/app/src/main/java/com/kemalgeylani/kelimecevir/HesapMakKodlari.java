package com.kemalgeylani.kelimecevir;

public class HesapMakKodlari {
    /*
    import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resulText);

    }

    public void sum (View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter the Number !");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }
    }

    public void deduct (View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter the Number !");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }

    }

    public void multiply (View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter the Number !");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }

    }

    public void divide (View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter the Number !");
        } else if (Integer.parseInt(number2Text.getText().toString()) == 0) {
            resultText.setText("Uncertain");
        } else {
            double number1 = Integer.parseInt(number1Text.getText().toString());
            double number2 = Integer.parseInt(number2Text.getText().toString());

            double result = number1 / number2;
            String str = String.format("%.3f",result);

            resultText.setText("Result : " + str);
        }
    }

    public void average(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter the Number !");
        }
        else {
            double number1 = Integer.parseInt(number1Text.getText().toString());
            double number2 = Integer.parseInt(number2Text.getText().toString());
            double average = (number1 + number2) / 2;

            resultText.setText("Result: " + average);
        }


    }
     */
}
