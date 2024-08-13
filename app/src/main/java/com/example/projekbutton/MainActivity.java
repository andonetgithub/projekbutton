package com.example.projekbutton;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button bubahwarna, btampilpesan;
    TextView ttampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //ini adalah perintah memanggil button di View
        bubahwarna = (Button) findViewById(R.id.btnubahwarna);
        btampilpesan = (Button) findViewById(R.id.btnpesan);
        ttampil= (TextView) findViewById(R.id.txttampil);

        //ini adalah perintah click untuk button pesan ubah warna
        bubahwarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bubahwarna.setBackgroundColor(Color.RED);
            }
        });

        //ini adalah perintah click untuk button pesat toast
        btampilpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hai Nando", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

    }
}