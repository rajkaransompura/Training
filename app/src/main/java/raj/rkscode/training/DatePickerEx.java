package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Raj on 30-06-2018.
 */

public class DatePickerEx extends AppCompatActivity {
    private DatePicker datePicker;
    private Button showdate;
    private TextView date;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepickex);

        date = findViewById(R.id.date_view);
        datePicker = findViewById(R.id.calender);
        showdate = findViewById(R.id.show_date);

        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.setText(dayOfMonth+" / "+monthOfYear+" / "+year);
            }
        });

        showdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DatePickerEx.this, date.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
