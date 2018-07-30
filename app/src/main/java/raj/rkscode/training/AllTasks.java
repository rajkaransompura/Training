package raj.rkscode.training;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Raj on 30-06-2018.
 */

public class AllTasks extends AppCompatActivity {

    private Button rating,seek,timepick,datepicker,progressbar,alertbox,acTextview,spinner,menus,intShare,actbar,phone,sms,email,recycle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alltasks);

        rating = findViewById(R.id.rating_bar_btn);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RatingBarEx.class);
                startActivity(i);
            }
        });

        seek = findViewById(R.id.seek_bar_btn);
        seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SeekBarEx.class);
                startActivity(i);
            }
        });

        timepick = findViewById(R.id.time_picker_btn);
        timepick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TimePickEx1.class);
                startActivity(i);
            }
        });

        datepicker = findViewById(R.id.date_picker_btn);
        datepicker.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("msg","error");
                Intent i = new Intent(getApplicationContext(), DatePickerEx.class);
                startActivity(i);
            }
        });

        progressbar = findViewById(R.id.progress_bar_btn);
        progressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProgressBarEx.class);
                startActivity(i);
            }
        });

        alertbox = findViewById(R.id.alert_box_btn);
        alertbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AlertBoxEx.class);
                startActivity(i);
            }
        });

        acTextview =findViewById(R.id.actextview_btn);
        acTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AcTextView.class);
                startActivity(i);
            }
        });

        spinner = findViewById(R.id.spinner_btn);
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SpinnerEx.class);
                startActivity(i);
            }
        });

        menus = findViewById(R.id.menu_btn);
        menus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenusEx.class);
                startActivity(i);
            }
        });

        intShare = findViewById(R.id.int_share_btn);
        intShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IntAct1.class);
                startActivity(i);
            }
        });

        actbar = findViewById(R.id.actionbar_btn);
        actbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActBarEx.class);
                startActivity(i);
            }
        });

        phone = findViewById(R.id.call_btn);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PhoneCallEx.class);
                startActivity(i);
            }
        });

        sms = findViewById(R.id.sms_btn);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SmsEx.class);
                startActivity(i);
            }
        });

        email = findViewById(R.id.email_btn);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EmailEx.class);
                startActivity(i);
            }
        });

        recycle = findViewById(R.id.recycle_btn);
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RecycleEx.class);
                startActivity(i);
            }
        });
    }
}
