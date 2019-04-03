package com.example.shahadathoshen.studentstudymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class clanguage extends AppCompatActivity {

    PDFView clanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);

        clanguage=(PDFView)findViewById(R.id.pdfc);
        clanguage.fromAsset("c.pdf").load();
    }
}
