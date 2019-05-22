package com.example.a123.managerhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText userId;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userId = (EditText) findViewById(R.id.userids);
        pass = (EditText) findViewById(R.id.pass);

        final String USERID = userId.getText().toString();
        String PASS = pass.getText().toString();
        Log.e("before ","heyy"+PASS);
        Log.e("user id printing ",""+USERID);
        Button b = (Button) findViewById(R.id.submitbuttonlogin);
        final Intent i = new Intent(this,HomeEmployee.class);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Log.e("came into","onc.ick "+USERID);
                if(USERID.equals("80760")){
                    Log.e("if","came");
                    startActivity(i);
                }
                else if(USERID.equals("81751") || USERID.equals("82621") || USERID.equals("89126") || USERID.equals("76251") || USERID.equals("62151") || USERID.equals("7286") || USERID.equals("51297")){

                    startActivity(i);
                }
                else{

                }
            }
        });
        Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG);

    }

}
