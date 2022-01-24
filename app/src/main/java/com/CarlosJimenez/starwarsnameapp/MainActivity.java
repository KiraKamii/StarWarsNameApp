package com.CarlosJimenez.starwarsnameapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstName;
    private EditText mLastName;
    private EditText mMaidenName;
    private EditText mCityBorn;
    private TextView mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstName = findViewById(R.id.firstname_edit_text);
        mLastName = findViewById(R.id.lastname_edit_text);
        mMaidenName = findViewById(R.id.maidenname_edit_text);
        mCityBorn = findViewById(R.id.city_edit_text);
        mResult = findViewById(R.id.name_result);
    }

    public void generateName(View view){
        String firstName = mFirstName.getText().toString().substring(0,2);
        String lastName = mLastName.getText().toString().substring(0,3);
        String maidenName = mMaidenName.getText().toString().substring(0,2);
        String cityBorn = mCityBorn.getText().toString().substring(0,3);
        String resultName = lastName + firstName + " " + maidenName + cityBorn;
        mResult.setText(resultName);

    }

}