package com.example.shahadathoshen.studentstudymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class EEE11 extends AppCompatActivity {

    PDFView eee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee11);

        eee=(PDFView)findViewById(R.id.pdfeee11);
        eee.fromAsset("Basic electrical engineering.pdf").load();
    }
}
