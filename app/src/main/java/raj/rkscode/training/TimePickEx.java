package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Raj on 30-06-2018.
 */

public class TimePickEx extends AppCompatActivity {
    private TextView showtime;
    private TimePicker timePicker;
    private Calendar calendar;
    private String formate = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepickex);

        timePicker = findViewById(R.id.timer);
        showtime = findViewById(R.id.timeview);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        showTime(hour,min);

    }

    private void showTime(int hour, int min) {
        if(hour == 0){
            hour += 12;
            formate = "AM";
        }
        else if(hour == 12){
            hour = 12;
            formate = "PM";
        }
        else if(hour > 12){
            hour -= 12;
            formate = "PM";
        }
        else{
            formate = "AM";
        }
        showtime.setText(new StringBuilder().append(hour).append(" : ").append(min).append(" ").append(formate));
    }

    public void setTime(View view){
        int hour = timePicker.getCurrentHour();
        int min = timePicker.getCurrentMinute();
        showTime(hour,min);

    }
}
