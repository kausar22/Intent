package com.myapp.intent_example3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClickMe,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe=findViewById(R.id.btn_click);
        btnGoogle=findViewById(R.id.btn_google);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,detailsActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Click ME", Toast.LENGTH_SHORT).show();

            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(i);
                Toast.makeText(MainActivity.this, "Click ME", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
