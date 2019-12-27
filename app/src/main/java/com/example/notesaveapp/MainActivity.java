package com.example.notesaveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,pass;
Button lognBtn;
    String userName;
    String userPassword;
    String myname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameEdittExt);
        pass = findViewById(R.id.passEdittExt);
        lognBtn = findViewById(R.id.login_Btn);
        myname="arvil";

        lognBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });

    }

    private void check() {
        userName=name.getText().toString();
        userPassword=pass.getText().toString();
        if(userName.equals(myname) && userPassword.equals(myname)){
            Intent intent=new Intent(MainActivity.this,LoginActivity.class);
            intent.putExtra("name",userName);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(getApplicationContext(), "user name or password invalid", Toast.LENGTH_SHORT).show();
        }
    }
}
