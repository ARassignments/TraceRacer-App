package com.example.traceracer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Reset_Passwrord_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reset_passwrord);
        Button contBtn = findViewById(R.id.continueBtn);
        contBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reset_Passwrord_Activity.this, confirm_PassordActivity.class);
                startActivity(intent);
            }
        });
        TextView forgotBtn = findViewById(R.id.rstlogin);
        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reset_Passwrord_Activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}