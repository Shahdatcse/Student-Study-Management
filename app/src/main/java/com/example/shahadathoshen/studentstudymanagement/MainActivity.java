package com.example.shahadathoshen.studentstudymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    int [] image ={R.drawable.fst,R.drawable.snd,R.drawable.thrd,R.drawable.frth};
    String[] title;
    private GridView gridview;
    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin=findViewById(R.id.log);
        buttonlogin.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,login.class);
                startActivity(intent);
            }
        });

        title = getResources().getStringArray(R.array.title);
        gridview = findViewById(R.id.gridview);
        CustomAdapter adapter = new CustomAdapter(this, title, image);
        gridview.setAdapter(adapter);

    }
}