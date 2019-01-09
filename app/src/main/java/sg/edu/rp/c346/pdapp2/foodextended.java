package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class foodextended extends AppCompatActivity {

    ImageView ivHokkien;
    Button btnHokkien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodextended);

        ivHokkien = findViewById(R.id.ImageViewFood);
        btnHokkien = findViewById(R.id.buttonFood);

        ivHokkien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodextended.this, hokkienmee.class);
                startActivity(intent);
            }
        });

        btnHokkien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(foodextended.this, hokkienmee.class);
                startActivity(intent);
            }
        });

    }
}
