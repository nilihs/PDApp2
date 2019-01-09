package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class food extends AppCompatActivity {

    ImageView ivLocal, ivWorld, ivChinese, ivOthers;
    CardView cvLocal, cvWorld, cvChinese, cvOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ivLocal = findViewById(R.id.ImageViewLocal);
        ivWorld = findViewById(R.id.ImageViewWorld);
        ivChinese = findViewById(R.id.ImageViewChinese);
        ivOthers = findViewById(R.id.ImageViewOthers);

        cvLocal = findViewById(R.id.CardViewLocal);
        cvWorld = findViewById(R.id.CardViewWorld);
        cvChinese = findViewById(R.id.CardViewChinese);
        cvOthers = findViewById(R.id.CardViewOthers);

        cvLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food.this, foodextended.class);
                startActivity(intent);
            }
        });

        ivLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food.this, foodextended.class);
                startActivity(intent);
            }
        });


    }
}
