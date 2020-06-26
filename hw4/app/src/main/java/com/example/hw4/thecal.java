package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thecal<b, Beeez> extends AppCompatActivity {

    float a, b, c;
    String scrtxt, sin, sint, calr;
    TextView textView;
    TextView textView0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thecal);
        textView0 = findViewById(R.id.textView0);
        textView = (TextView) findViewById(R.id.textView3);
        sint = "0";
        scrtxt = "";
        calr = "0";
    }

    public void onClicknumber(View view) {
        calr = "0";
        if (sint.equals("0")) {
            Button button = (Button) view;
            scrtxt += button.getText().toString();
            textView.setText(scrtxt);
            a = Float.parseFloat(scrtxt);
        } else {
            Button button = (Button) view;
            scrtxt += button.getText().toString();
            textView.setText(scrtxt);
            b = Float.parseFloat(scrtxt);
        }

    }

    public void onClickss(View view) {
        Button button = (Button) view;
        sin = button.getText().toString();
        textView.setText(sin);
        sint = "1";
        scrtxt = "";

    }

    public void onClickE(View view) {
        Button button = (Button) view;

        if (sin.equals("+")) {
            c = a + b;
        } else if (sin.equals("-")) {
            c = a - b;
        } else if (sin.equals("*")) {
            c = a * b;
        } else if (sin.equals("/")) {
            c = a / b;
        }
        calr = Float.toString(c);
        textView.setText(calr);
        color();
        scrtxt = "0";
        sint = "0";
    }

    public void rest(View view) {
        Button button = (Button) view;
        sint = "0";
        scrtxt = "";
        calr = "0";
        textView.setText("0");
    }

    public void color() {
        if (Double.parseDouble(calr) >= 90 && Double.parseDouble(calr) <= 100) {
            textView.setTextColor(Color.GREEN);
            textView0.setText(Gredso());
        } else if (Double.parseDouble(calr) >= 80 && Double.parseDouble(calr) < 90) {
            textView.setTextColor(Color.BLUE);
            textView0.setText(Greds());
        } else if (Double.parseDouble(calr) >= 70 && Double.parseDouble(calr) < 90) {
            textView.setTextColor(Color.YELLOW);
            textView0.setText(Greds2());
        } else if (Double.parseDouble(calr) >= 60 && Double.parseDouble(calr) < 70) {
            textView.setTextColor(Color.RED);
            textView0.setText(Greds3());
        }else if (Double.parseDouble(calr) >= 1 && Double.parseDouble(calr) < 60) {
            textView.setTextColor(Color.DKGRAY);
            textView0.setText(Greds4());
        }else  {
            textView.setTextColor(Color.WHITE);
            textView0.setText(Greds5());

        }
    }

    private String Greds5() {
        return "NO Cooment";
    }

    private String Greds4() {
        return "F";
    }

    private String Greds3() {
        return "D";
    }

    private String Gredso() {
        return "A";
    }

    private String Greds2() {
        return "C";
    }

    private String Greds() {
        return "B";
    }


}