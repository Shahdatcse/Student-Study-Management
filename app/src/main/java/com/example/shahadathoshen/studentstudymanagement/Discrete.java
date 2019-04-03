package com.example.shahadathoshen.studentstudymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Discrete extends AppCompatActivity {

    PDFView discrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discrete);

        discrete=(PDFView)findViewById(R.id.pdfdescrete);
        discrete.fromAsset("Discrete Mathematics.pdf").load();
    }
}
