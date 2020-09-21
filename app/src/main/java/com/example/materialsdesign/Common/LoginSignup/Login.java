package com.example.materialsdesign.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.materialsdesign.MainActivity;
import com.example.materialsdesign.R;

public class Login extends AppCompatActivity {
    private Button loginbtn;
    private EditText username,password;
    private TextView info;
    private int counterr=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        username = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.lgn_btn);
        info = (TextView)findViewById(R.id.textView);
        info.setText("No of Attempts Remaining: 5");
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(),password.getText().toString());
            }
        });


    }
    private void validate(String username,String password){
        if((username.equals("trainer")) && (password.equals("trainer"))){
            Toast.makeText(getBaseContext(), "Welcome Trainer!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,.class);
            startActivity(intent);
        }else if((username.equals("user")) && (password.equals("user"))){
            Toast.makeText(getBaseContext(), "Welcome User!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else{
            counterr--;
            info.setText("No of Attempts Remaining: "+ String.valueOf(counterr));
            if(counterr==0){
                loginbtn.setEnabled(false);
            }
        }
    }
}