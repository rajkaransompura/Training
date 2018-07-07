package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

/**
 * Created by Raj on 30-06-2018.
 */

public class DatePickerEx extends AppCompatActivity {
    DatePicker datePicker;
    Button showdate;
    TextView date;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepickex);

        date = findViewById(R.id.date_view);
        datePicker = findViewById(R.id.calender);
        showdate = findViewById(R.id.show_date);
    }
}
