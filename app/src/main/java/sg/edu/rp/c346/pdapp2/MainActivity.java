package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivEvent, ivMap, ivFood, ivPlace, ivPlanner, ivSetting;
    CardView cvEvent, cvMap, cvFood, cvPlace, cvPlanner, cvSetting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivEvent = findViewById(R.id.ImageViewEvent);
        ivMap = findViewById(R.id.ImageViewMap);
        ivFood = findViewById(R.id.ImageViewFood);
        ivPlace = findViewById(R.id.ImageViewPlaces);


        cvEvent = findViewById(R.id.CardViewEvent);
        cvMap = findViewById(R.id.CardViewMap);
        cvFood = findViewById(R.id.CardViewFood);
        cvPlace = findViewById(R.id.CardViewPlace);


        cvEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, event.class);
                startActivity(intent);
            }
        });

        ivEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, event.class);
                startActivity(intent);
            }
        });

        cvMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        cvFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, food.class);
                startActivity(intent);
            }
        });

        ivFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, food.class);
                startActivity(intent);
            }
        });

    }

}

