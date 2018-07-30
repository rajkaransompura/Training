package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by Raj on 30-06-2018.
 */

public class TimePickEx1 extends AppCompatActivity {
    private TimePicker timePicker1;
    private Button set;
    private TextView seetime;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepickex);

        seetime = findViewById(R.id.timeview);
        timePicker1 = findViewById(R.id.timer);

        timePicker1.setIs24HourView(true);
        set = findViewById(R.id.settime);

        seetime.setText(getCurrentTime());

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seetime.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime() {
        String currentTime="Current Time: "+timePicker1.getCurrentHour()+" : "+timePicker1.getCurrentMinute();
        return currentTime;
    }
}
