package com.example.shahadathoshen.studentstudymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class fstyear extends AppCompatActivity  {

    String items[] = new String[]{"Computer Fundamental", "Discrete Mathematics",
            "Basic Electrical Engineering","Programming Language C", "Digital Logic Design"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fstyear);

        ListView ListView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, R.id.txt, items);
        ListView.setAdapter(adapter);

      ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              if (position==0){
                  Intent intent = new Intent(fstyear.this,Fundamental.class);
                  startActivity(intent);
              }
              else if (position==1){
                  Intent intent = new Intent(fstyear.this,Discrete.class);
                  startActivity(intent);
              }
              else if (position==2){
                  Intent intent = new Intent(fstyear.this,EEE11.class);
                  startActivity(intent);
              }
              else if (position==3){
                  Intent intent = new Intent(fstyear.this,clanguage.class);
                  startActivity(intent);
              }
              else if (position==4){
                  Intent intent = new Intent(fstyear.this,dld.class);
                  startActivity(intent);
              }
          }
      });

    }
}