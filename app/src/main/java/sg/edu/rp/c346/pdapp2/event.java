package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class event extends AppCompatActivity {

    ImageView ivCarnival;
    Button buttonCarnival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ivCarnival = findViewById(R.id.ImageViewEventCarnival);
        buttonCarnival = findViewById(R.id.buttonCarnival);

        ivCarnival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(event.this, eventinfo.class);
                startActivity(intent);
            }
        });

        buttonCarnival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(event.this, eventinfo.class);
                startActivity(intent);
            }
        });

    }
}
