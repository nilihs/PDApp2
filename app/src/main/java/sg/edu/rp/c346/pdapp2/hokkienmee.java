package sg.edu.rp.c346.pdapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class hokkienmee extends AppCompatActivity {

    Spinner spinnerPax;
    DatePicker dpLocalFood;
    TimePicker tpLocalFood;
    Button btnConfirm, btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hokkienmee);

        spinnerPax = findViewById(R.id.spinnerPax);
        dpLocalFood = findViewById(R.id.datePickerLocalFood);
        tpLocalFood = findViewById(R.id.timePickerLocalFood);
        btnConfirm = findViewById(R.id.buttonConfirmBooking);
        btnHome = findViewById(R.id.buttonHome);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hokkienmee.this, "A booking of " + spinnerPax.getSelectedItem() + " on " + dpLocalFood.getDayOfMonth() + "/" + (dpLocalFood.getMonth()+1) + "/" + dpLocalFood.getYear() +  " at " + tpLocalFood.getCurrentHour() + ":" + tpLocalFood.getCurrentMinute() + " has been booked for you.", Toast.LENGTH_LONG ).show();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hokkienmee.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
