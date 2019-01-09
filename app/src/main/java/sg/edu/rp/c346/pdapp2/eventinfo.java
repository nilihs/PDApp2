package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class eventinfo extends AppCompatActivity {

    DatePicker dpEvent;
    Button btnConfirm, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventinfo);

        dpEvent = findViewById(R.id.datePickerEvent);
        btnConfirm = findViewById(R.id.buttonConfirm);
        btnHome = findViewById(R.id.buttonHome);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eventinfo.this, dpEvent.getDayOfMonth() + "/" + (dpEvent.getMonth()+1) + "/" + dpEvent.getYear() + " has been booked for you.", Toast.LENGTH_LONG ).show();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eventinfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
