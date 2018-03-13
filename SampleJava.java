package com.example.mca.sreeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mca on 10/1/18.
 */

public class SampleJava extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {super.onCreate(savedInstanceState);
    setContentView(R.layout.layout2);
    Button b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt=new Intent(SampleJava.this,MainActivity.class);
                startActivity(intt);
            }
        });}

}
