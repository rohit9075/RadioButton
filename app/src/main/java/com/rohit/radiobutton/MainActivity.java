package com.rohit.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    // RadioGroup object Declaration.
    private RadioGroup mRadioGroupGender;

    // RadioButton object Declaration.
    private RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RadioGroup object Instantiation
        mRadioGroupGender = findViewById(R.id.radioGroup);

        // register for button on change listener.
        mRadioGroupGender.setOnCheckedChangeListener(this);

        // button object instantiation
        Button mButton = findViewById(R.id.button);

        // handling the button click
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRadioGroupGender != null) {
                    String  mRegisterGender = mRadioButton.getText().toString().trim();

                    // showing the text from the radiobutton in the toast message.
                    Toast.makeText(MainActivity.this, mRegisterGender, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        // getting the checked button id.
        mRadioButton = (RadioButton) group.findViewById(checkedId);
    }
}
