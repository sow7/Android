package com.example.songsong.sow7application;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

/**
 * Created by SONGSONG on 2015/4/1.
 */
public class personalpage extends ActionBarActivity {
    private Button user_logout_button;
    private TextView username;
    private Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = this.getIntent().getExtras();
        String name = bundle.getString("UserName");
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.personalpage);
        username=(TextView)findViewById(R.id.title);
        username.setText("Name: "+name);
        user_logout_button=(Button)findViewById(R.id.logout);
        user_logout_button.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(personalpage.this,user_login.class);
                startActivity(intent);
            }

        });
    }
}
