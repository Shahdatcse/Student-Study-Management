package com.example.shahadathoshen.studentstudymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class dld extends AppCompatActivity {

    PDFView dld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dld);

        dld=(PDFView)findViewById(R.id.pdfdld);
        dld.fromAsset("dld.pdf").load();
    }
}
