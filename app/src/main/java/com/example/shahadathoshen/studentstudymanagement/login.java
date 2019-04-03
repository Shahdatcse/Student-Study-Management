package com.example.shahadathoshen.studentstudymanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity implements View.OnClickListener {


    private Button registration;
    private Button SignIn;
    private EditText email;
    private EditText password;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registration = (Button) findViewById(R.id.create);
        SignIn = (Button) findViewById(R.id.signin);
        email = (EditText) findViewById(R.id.user);
        password=(EditText)findViewById(R.id.roll);
        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();

        SignIn.setOnClickListener(this);
        registration.setOnClickListener(this);
    }

    private void userlogin(){
        String Email=email.getText().toString().trim();
        String Password=password.getText().toString().trim();

        progressDialog.setMessage("logging in ....");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(Email,Password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    finish();
                    startActivity(new Intent(getApplicationContext(),profile.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Email or password is incorrect",Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view==SignIn){
            userlogin();
        }
        if(view==registration){
            startActivity(new Intent(getApplicationContext(),registration.class));
        }

    }
}
