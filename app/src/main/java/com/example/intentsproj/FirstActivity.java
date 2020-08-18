package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        et1=findViewById(R.id.numb1);
        et2=findViewById(R.id.numb2);
        btns=findViewById(R.id.btnok);


        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {

                String n1 = et1.getText().toString();
                String n2 = et2.getText().toString();

                //Explicit Intent
                Intent i = new Intent(FirstActivity.this,SecondActivity.class);

                i.putExtra("Num1",n1);
                i.putExtra("Num2",n2);

                startActivity(i);

            }
        });

    }
}