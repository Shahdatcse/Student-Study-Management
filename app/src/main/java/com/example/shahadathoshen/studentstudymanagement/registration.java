package com.example.shahadathoshen.studentstudymanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class registration extends AppCompatActivity implements View.OnClickListener {

    private Button SignUp;
    private EditText Email;
    private EditText Password;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);
        SignUp = (Button) findViewById(R.id.signup);
        Email = (EditText) findViewById(R.id.email);
        Password=(EditText)findViewById(R.id.pass);
        textView=findViewById(R.id.textview);

       SignUp.setOnClickListener(this);
       textView.setOnClickListener(this);
    }

    private void registerUser(){
    String email=Email.getText().toString().trim();
    String password= Password.getText().toString().trim();

       if(email.isEmpty())
       {
           Email.setError("Required an Email");
           Email.requestFocus();
           return;
       }
       if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
       {
           Email.setError("Required a valid Email");
           Email.requestFocus();
           return;
       }

        if(password.isEmpty())
        {
            Password.setError("Required a password");
            Password.requestFocus();
            return;
        }

        progressDialog.setMessage("Registering User....");
        progressDialog.show();

    firebaseAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {

            if (task.isSuccessful()) {

                Toast.makeText(getApplicationContext(),"Register Successfully", Toast.LENGTH_SHORT).show();

            }
            else {

            if(task.getException()instanceof FirebaseAuthUserCollisionException)
            {
                Toast.makeText(getApplicationContext(),"Already Registered",Toast.LENGTH_SHORT).show();
            }
            else{
                    Toast.makeText(getApplicationContext(), "Could not Register.Try Again", Toast.LENGTH_SHORT).show();
                }
            }
            progressDialog.cancel();
        }
    });
    }

    @Override
    public void onClick(View view) {

        if(view == SignUp){
            registerUser();
        }
        if(view==textView){
            startActivity(new Intent(getApplicationContext(),login.class));
        }
    }
}
