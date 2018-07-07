package raj.rkscode.training;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Raj on 30-06-2018.
 */

public class AllTasks extends AppCompatActivity {

    Button rating,seek,timepick,datepicker;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alltasks);

        rating = findViewById(R.id.rating_bar);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RatingBarEx.class);
                startActivity(i);
            }
        });

        seek = findViewById(R.id.seek_bar);
        seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SeekBarEx.class);
                startActivity(i);

            }
        });

        timepick = findViewById(R.id.time_picker);
        timepick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TimePickEx1.class);
                startActivity(i);

            }
        });

        datepicker = findViewById(R.id.date_picker);
        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DatePickerEx.class);
                startActivity(i);
            }
        });

    }
}
