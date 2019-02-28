package com.e.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private EditText cTextBox;
    private EditText fTextBox;
    private EditText kmTextBox;
    private EditText miTextBox;
    private EditText kgTextBox;
    private EditText lbTextBox;
    private EditText liTextBox;
    private EditText gaTextBox;


    TextWatcher cWatcher = new TextWatcher() {

        double f, c;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                fTextBox.removeTextChangedListener(fWatcher);
                c = Double.parseDouble(s.toString());
                f = (((9 / 5) * c) + 32);
                fTextBox.setText("" + String.format("%.2f", f));
                fTextBox.addTextChangedListener(fWatcher);
                Log.i("MainActivity", "Celsius converted to " + f + ". Fahrenheit at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher fWatcher = new TextWatcher() {

        double f, c;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                cTextBox.removeTextChangedListener(cWatcher);
                f = Double.parseDouble(s.toString());
                c = ((f - 32) * 5 / 9);
                cTextBox.setText("" + String.format("%.2f", c));
                cTextBox.addTextChangedListener(cWatcher);
                Log.i("MainActivity", "Fahrenheit converted to " + c + ". Celsius at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher kmWatcher = new TextWatcher() {

        double k, m;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                miTextBox.removeTextChangedListener(miWatcher);
                k = Double.parseDouble(s.toString());
                m = 0.621371 * k;
                miTextBox.setText("" + String.format("%.2f", m));
                miTextBox.addTextChangedListener(miWatcher);
                Log.i("MainActivity", "Kilometers converted to " + m + ". Miles at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher miWatcher = new TextWatcher() {

        double k, m;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                kmTextBox.removeTextChangedListener(kmWatcher);
                m = Double.parseDouble(s.toString());
                k = 1.609344 * m;
                kmTextBox.setText("" + String.format("%.2f", k));
                kmTextBox.addTextChangedListener(kmWatcher);
                Log.i("MainActivity", "Miles converted to " + k + ". Kilometers at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher kgWatcher = new TextWatcher() {

        double k, l;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                lbTextBox.removeTextChangedListener(lbWatcher);
                l = Double.parseDouble(s.toString());
                k = 2.20462262 * l;
                lbTextBox.setText("" + String.format("%.2f", k));
                lbTextBox.addTextChangedListener(lbWatcher);
                Log.i("MainActivity", "Kilograms converted to " + l + ". Pounds at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher lbWatcher = new TextWatcher() {

        double k, l;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                kgTextBox.removeTextChangedListener(kgWatcher);
                k = Double.parseDouble(s.toString());
                l = 0.45359237 * k;
                kgTextBox.setText("" + String.format("%.2f", l));
                kgTextBox.addTextChangedListener(kgWatcher);
                Log.i("MainActivity", "Pounds converted to " + k + ". Kilograms at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher liWatcher = new TextWatcher() {

        double g, l;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                gaTextBox.removeTextChangedListener(gaWatcher);
                g = Double.parseDouble(s.toString());
                l = 0.26417205 * g;
                gaTextBox.setText("" + String.format("%.2f", l));
                gaTextBox.addTextChangedListener(gaWatcher);
                Log.i("MainActivity", "Liters converted to " + g + ". Gallons at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    TextWatcher gaWatcher = new TextWatcher() {

        double g, l;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if(!(s.toString().matches("") || s.toString().matches("-"))) {
                liTextBox.removeTextChangedListener(liWatcher);
                l = Double.parseDouble(s.toString());
                g = 3.78541178 * l;
                liTextBox.setText("" + String.format("%.2f", g));
                liTextBox.addTextChangedListener(liWatcher);
                Log.i("MainActivity", "Gallons converted to " + l + ". Liters at timestamp:  "
                        + System.currentTimeMillis() + "\n");
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cTextBox = findViewById(R.id.cTextBox);
        fTextBox = findViewById(R.id.fTextBox);
        cTextBox.addTextChangedListener(cWatcher);
        fTextBox.addTextChangedListener(fWatcher);

        kmTextBox = findViewById(R.id.kmTextBox);
        miTextBox = findViewById(R.id.miTextBox);
        kmTextBox.addTextChangedListener(kmWatcher);
        miTextBox.addTextChangedListener(miWatcher);

        kgTextBox = findViewById(R.id.kgTextBox);
        lbTextBox = findViewById(R.id.lbTextBox);
        kgTextBox.addTextChangedListener(kgWatcher);
        lbTextBox.addTextChangedListener(lbWatcher);

        liTextBox = findViewById(R.id.liTextBox);
        gaTextBox = findViewById(R.id.gaTextBox);
        liTextBox.addTextChangedListener(liWatcher);
        gaTextBox.addTextChangedListener(gaWatcher);

    }
}
