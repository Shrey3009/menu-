package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView head ;
    EditText name;
    EditText pass;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etName);
        pass=(EditText)findViewById(R.id.etPass);
        submit=(Button)findViewById(R.id.btnlogin);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),pass.getText().toString());
            }
        });
    }

    public void validate(String uname,String upass){
        if ((uname.equals("admin"))&& (upass.equals("123"))){
            Intent it = new Intent(MainActivity.this,login.class);

            startActivity(it);
        }
    }

}
