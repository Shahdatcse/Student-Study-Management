package com.example.shahadathoshen.studentstudymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Fundamental extends AppCompatActivity {

    PDFView fundamental;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamental);

        fundamental=(PDFView)findViewById(R.id.pdffundamental);
        fundamental.fromAsset("computer Fundamental.pdf").load();
    }
}
