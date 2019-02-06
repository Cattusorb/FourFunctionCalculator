package com.example.four_functioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    /** Calculator to Calculate Input */
    private Calculator calculate =  new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateView();
    }

    /**
     * Does an action based on the button/key pressed
     * @param view - view that received the click
     */
    public void buttonClick(View view) {
        // I know this doesn't look good.
        if (view.getId() == R.id.clear_all) {
            calculate.allClear();
        } else if (view.getId() == R.id.clear) {
            calculate.clear();
        } else if (view.getId() == R.id.equal) {
            calculate.keyPress('=');
        } else if(view.getId() == R.id.nine) {
            calculate.keyPress('9');
        } else if(view.getId() == R.id.eight) {
            calculate.keyPress('8');
        } else if(view.getId() == R.id.seven) {
            calculate.keyPress('7');
        } else if(view.getId() == R.id.six) {
            calculate.keyPress('6');
        } else if(view.getId() == R.id.five) {
            calculate.keyPress('5');
        } else if(view.getId() == R.id.four) {
            calculate.keyPress('4');
        } else if(view.getId() == R.id.three) {
            calculate.keyPress('3');
        } else if(view.getId() == R.id.two) {
            calculate.keyPress('2');
        } else if(view.getId() == R.id.one) {
            calculate.keyPress('1');
        } else if(view.getId() == R.id.zero) {
            calculate.keyPress('0');
        } else if(view.getId() == R.id.decimal) {
            calculate.keyPress('.');
        } else if(view.getId() == R.id.plus) {
            calculate.keyPress('+');
        } else if(view.getId() == R.id.minus) {
            calculate.keyPress('-');
        } else if(view.getId() == R.id.multiply) {
            calculate.keyPress('*');
        } else if(view.getId() == R.id.divide) {
            calculate.keyPress('/');
        } else {
            throw new RuntimeException("The button you just pressed does not have a place here...");
        }

        updateView();
    }

    private void updateView() {
        TextView display = findViewById(R.id.output);
        display.setText(String.format(Locale.US, "%s", calculate.getDisplay()));

        /** String displayNumber = calculate.getDisplay();
         String[] numbers = displayNumber.split(".");
         int n = Integer.parseInt(numbers[1]);
         if(numbers[0] != null) {
                if(n == 0) {
                     display.setText(String.format(Locale.US, "%s", numbers[0]));
                 } else {
                    display.setText(String.format(Locale.US, "%s", displayNumber));
                 }
         } else {
         display.setText(String.format(Locale.US, "%s", displayNumber));
         } */
    }
}
