package org.jplas.android.temperature.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputText);
    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.farenheitBtn:
                Converter celsiustofahr = new Converter();
                Button fahrenheitButton = (Button) findViewById(R.id.farenheitBtn);
                TextView output = (TextView) findViewById(R.id.resultText);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                double inputValue = Double.parseDouble(text.getText().toString());
                if (fahrenheitButton.isClickable()) {
                    String result = String.valueOf(celsiustofahr.getCelcius());
                    output.setText("= " + result + " farenheit");
                }
                break;

        }
    }
}
