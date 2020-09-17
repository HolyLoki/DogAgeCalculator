package com.example.dogagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String selectedSpecie = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.species,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        final EditText editText = findViewById(R.id.ageInput);
        final TextView humanAge = findViewById(R.id.txtHumanAge);

        editText.setText("0");

        final Button buttonConvert = findViewById(R.id.btnConvert);
        buttonConvert.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                String dogAge = editText.getText().toString();
                if (dogAge.equals("1")) humanAge.setText("15");
                if (dogAge.equals("2")) humanAge.setText("23");
                if (dogAge.equals("3")) humanAge.setText("28");
                if (dogAge.equals("4")) humanAge.setText("31");
                if (dogAge.equals("5")) humanAge.setText("36");
                switch (selectedSpecie) {
                    case "Pug":
                        if (dogAge.equals("6")) humanAge.setText("38");
                        if (dogAge.equals("7")) humanAge.setText("42");
                        if (dogAge.equals("8")) humanAge.setText("45");
                        if (dogAge.equals("9")) humanAge.setText("49");
                        if (dogAge.equals("10")) humanAge.setText("52");
                        if (dogAge.equals("11")) humanAge.setText("56");
                        if (dogAge.equals("12")) humanAge.setText("59");
                        if (dogAge.equals("13")) humanAge.setText("68");
                        if (dogAge.equals("14")) humanAge.setText("72");
                        if (dogAge.equals("15")) humanAge.setText("63");
                        if (dogAge.equals("16")) humanAge.setText("66");
                        if (dogAge.equals("17")) humanAge.setText("70");
                        if (dogAge.equals("18")) humanAge.setText("74");
                        if (Integer.parseInt(dogAge) > 18)
                            humanAge.setText("Age must be between 1 and 18!");
                        break;
                    case "Dalmatian":
                        if (dogAge.equals("6")) humanAge.setText("42");
                        if (dogAge.equals("7")) humanAge.setText("47");
                        if (dogAge.equals("8")) humanAge.setText("51");
                        if (dogAge.equals("9")) humanAge.setText("56");
                        if (dogAge.equals("10")) humanAge.setText("61");
                        if (dogAge.equals("11")) humanAge.setText("65");
                        if (dogAge.equals("12")) humanAge.setText("70");
                        if (dogAge.equals("13")) humanAge.setText("74");
                        if (dogAge.equals("14")) humanAge.setText("79");
                        if (dogAge.equals("15")) humanAge.setText("84");
                        if (dogAge.equals("16")) humanAge.setText("88");
                        if (dogAge.equals("17")) humanAge.setText("93");
                        if (dogAge.equals("18")) humanAge.setText("98");
                        if (Integer.parseInt(dogAge) > 18)
                            humanAge.setText("Age must be between 1 and 18!");
                        break;
                    case "Rottweiler":
                        if (dogAge.equals("6")) humanAge.setText("47");
                        if (dogAge.equals("7")) humanAge.setText("53");
                        if (dogAge.equals("8")) humanAge.setText("59");
                        if (dogAge.equals("9")) humanAge.setText("65");
                        if (dogAge.equals("10")) humanAge.setText("70");
                        if (dogAge.equals("11")) humanAge.setText("76");
                        if (dogAge.equals("12")) humanAge.setText("82");
                        if (dogAge.equals("13")) humanAge.setText("88");
                        if (dogAge.equals("14")) humanAge.setText("94");
                        if (dogAge.equals("15")) humanAge.setText("100");
                        if (dogAge.equals("16")) humanAge.setText("106");
                        if (dogAge.equals("17")) humanAge.setText("112");
                        if (dogAge.equals("18")) humanAge.setText("117");
                        if (Integer.parseInt(dogAge) > 18)
                            humanAge.setText("Age must be between 1 and 18!");
                        break;
                    case "Gordon Setter":
                        if (dogAge.equals("6")) humanAge.setText("43");
                        if (dogAge.equals("7")) humanAge.setText("48");
                        if (dogAge.equals("8")) humanAge.setText("53");
                        if (dogAge.equals("9")) humanAge.setText("58");
                        if (dogAge.equals("10")) humanAge.setText("63");
                        if (dogAge.equals("11")) humanAge.setText("68");
                        if (dogAge.equals("12")) humanAge.setText("72");
                        if (dogAge.equals("13")) humanAge.setText("77");
                        if (dogAge.equals("14")) humanAge.setText("82");
                        if (dogAge.equals("15")) humanAge.setText("87");
                        if (dogAge.equals("16")) humanAge.setText("92");
                        if (dogAge.equals("17")) humanAge.setText("97");
                        if (dogAge.equals("18")) humanAge.setText("102");
                        if (Integer.parseInt(dogAge) > 18)
                            humanAge.setText("Age must be between 1 and 18!");
                        break;
                }
            }
        });

        final Button buttonReset = findViewById(R.id.btnReset);
        buttonReset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText("0");
                humanAge.setText("0");
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {
        selectedSpecie = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), selectedSpecie,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}