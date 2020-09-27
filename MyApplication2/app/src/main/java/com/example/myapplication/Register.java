package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private EditText Name;
    private EditText Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void submit(View view){


        Name = (EditText)findViewById(R.id.inputName);
        String getName = Name.getText().toString();

        Email = (EditText)findViewById(R.id.inputEmail);
        String email = Email.getText().toString();

        Phone = (EditText)findViewById(R.id.inputPhone);
        String getPhone = Phone.getText().toString();

        Password = (EditText)findViewById(R.id.inputPassword);
        String password = Password.getText().toString();
        CheckBox hasChecked = (CheckBox) findViewById(R.id.checkBox2);
        boolean hasWhippedCream = hasChecked.isChecked();
        if (hasWhippedCream == false) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Agree All terms and conditions",
                    Toast.LENGTH_SHORT);
            toast.show();

        }
        else if(getName.length()==0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Write your name",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else if(email.length()==0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Write your email",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else if(getPhone.length()==0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Write your phone number",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else if(password.length()==0){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Write your password",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else{



            Intent intent = new Intent(Register.this, MainActivity.class);
            startActivity(intent);
        }
    }
}