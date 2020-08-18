package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String  Out1 , Out2 , Out3 , Out4 , Out5 , Out6 , Out7 , Out8;
    Button add , sub , mult , divide;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String n1=getIntent().getStringExtra("Num1");
        String n2=getIntent().getStringExtra("Num2");

        et1 = findViewById(R.id.numb1);
        et2 = findViewById(R.id.numb2);
        et1.setText(n1);
        et2.setText(n2);

    }

    public void addData(View view){

        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText eOut1 = findViewById(R.id.numb1);
                EditText eOut2 = findViewById(R.id.numb2);

                Out1 = eOut1.getText().toString();
                Out2 = eOut2.getText().toString();

                Integer i1 = Integer.parseInt(Out1);
                Integer i2 = Integer.parseInt(Out2);

                String result = "";

                result = i1 + "+" + i2 + "=" + (i1+i2);

                TextView Result = findViewById(R.id.result);
                Result.setText(result);
            }
        });

    }

    public void subData(View view){
        sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut3 = findViewById(R.id.numb1);
                EditText eOut4 = findViewById(R.id.numb2);

                Out3 = eOut3.getText().toString();
                Out4 = eOut4.getText().toString();

                Integer i3 = Integer.parseInt(Out3);
                Integer i4 = Integer.parseInt(Out4);

                String result2 = "";

                result2 =  i3 + "-" + i4 + "=" + (i3-i4);

                TextView Result = findViewById(R.id.result);
                Result.setText(result2);

            }
        });

    }

    public void multiData(View view){
        mult = findViewById(R.id.mul);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut5 = findViewById(R.id.numb1);
                EditText eOut6 = findViewById(R.id.numb2);

                Out5 = eOut5.getText().toString();
                Out6 = eOut6.getText().toString();

                Integer i5 = Integer.parseInt(Out5);
                Integer i6 = Integer.parseInt(Out6);

                String result3 = "";

                result3 = i5 + "*" + i6 + "=" + (i5*i6);

                TextView Result = findViewById(R.id.result);
                Result.setText(result3);

            }
        });
    }


    public void divideDate(View view){

        divide = findViewById(R.id.div);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eOut7 = findViewById(R.id.numb1);
                EditText eOut8 = findViewById(R.id.numb2);

                Out7 = eOut7.getText().toString();
                Out8 = eOut8.getText().toString();

                Integer i7 = Integer.parseInt(Out7);
                Integer i8 = Integer.parseInt(Out8);

                String result = "";

                result = i7  + "/" + i8 + "=" + (i7/i8);

                TextView divideResult = findViewById(R.id.result);
                divideResult.setText(result);

            }
        });

    }
}