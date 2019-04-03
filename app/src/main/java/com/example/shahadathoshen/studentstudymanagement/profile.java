package com.example.shahadathoshen.studentstudymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile extends AppCompatActivity {

    String year[] = {"First Year", "Second Year", "Third Year","Fourth Year"};
    int[] pic = {R.drawable.fst,R.drawable.snd,R.drawable.thrd,R.drawable.frth};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ListView listView = findViewById(R.id.listprofile);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(profile.this,logfirst.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Intent intent = new Intent(profile.this,logsecond.class);
                    startActivity(intent);
                }

            }
        });

    }

   class CustomAdapter extends BaseAdapter{

       @Override
       public int getCount() {
           return pic.length;
       }

       @Override
       public Object getItem(int i) {
           return null;
       }

       @Override
       public long getItemId(int i) {
           return 0;
       }

       @Override
       public View getView(int i, View view, ViewGroup viewGroup) {
           view=getLayoutInflater().inflate(R.layout.profilelist,null);

           ImageView imageView= (ImageView) view.findViewById(R.id.imageView);
           TextView textView= (TextView) view.findViewById(R.id.textView);

           imageView.setImageResource(pic[i]);
           textView.setText(year[i]);

           return view;
       }
   }
}
