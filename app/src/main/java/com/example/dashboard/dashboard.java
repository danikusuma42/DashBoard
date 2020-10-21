package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void Sepeda(View view)
    {
        Intent intent =new Intent(dashboard.this,ActivitySepeda.class);
        startActivity(intent);
    }

    public void kalkulator(View view)
    {
        Intent intent = new Intent(dashboard.this,ActivityHeadset.class);
        startActivity(intent);
    }

    public void pesawat(View view) {
        Intent intent = new Intent(dashboard.this,ActivityPesawat.class);
        startActivity(intent);
    }

    public void restaurant(View view) {
        Intent intent = new Intent(dashboard.this,ActivityRestaurant.class);
        startActivity(intent);

    }


    public void mic(View view) {
        Intent intent = new Intent(dashboard.this,ActivityMic.class);
        startActivity(intent);
    }

    public void telpon(View view) {
        Intent intent = new Intent(dashboard.this,ActivityTelpon.class);
        startActivity(intent);
    }
}