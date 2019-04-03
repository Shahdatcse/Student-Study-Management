package com.example.shahadathoshen.studentstudymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logfirst extends AppCompatActivity implements View.OnClickListener{

    private Button fundamental;
    private Button discrete;
    private Button basicseee;
    private Button DLD;
    private Button program;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logfirst);

        fundamental=(Button)findViewById(R.id.button1);
        discrete=(Button)findViewById(R.id.button2);
        basicseee=(Button)findViewById(R.id.button3);
        DLD=(Button)findViewById(R.id.button4);
        program=(Button)findViewById(R.id.button5);


        discrete.setOnClickListener(this);
        fundamental.setOnClickListener(this);
        basicseee.setOnClickListener(this);
        program.setOnClickListener(this);
        DLD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==fundamental){
            startActivity(new Intent(getApplicationContext(),cm.class));
        }

    }
}
