package raj.rkscode.training;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsEx extends AppCompatActivity {
    EditText phoneno,msg;
    Button send1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_lay);

        phoneno = findViewById(R.id.sms_num);
        msg = findViewById(R.id.sms_msg);
        send1 = findViewById(R.id.send);

        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String numner = phoneno.getText().toString();
                String message = msg.getText().toString();

//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms"+numner));
//                intent.putExtra("SMS body",message);
//                startActivity(intent);
//                String mno = phoneno.getText().toString();
//                String sms = msg.getText().toString();
//                Intent intent = new Intent(getApplicationContext(), AllTasks.class);
//                PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),0,intent,0);

                try {
                    //Using SmsManager API
                    SmsManager smss = SmsManager.getDefault();
                    smss.sendTextMessage(numner, null, message, null, null);
                    Toast.makeText(SmsEx.this, "SMS sent!", Toast.LENGTH_SHORT).show();

                    //Using Default Sms App

                    /*Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.putExtra("sms_body","default content");
                    sendIntent.setType("vnd.android-dir/mms-sms");
                    startActivity(sendIntent);
                    Toast.makeText(SmsEx.this, "Sent!", Toast.LENGTH_SHORT).show();*/

                    }
                catch (Exception e){
//                    Log.d("err","error");
                    Toast.makeText(SmsEx.this, "SMS sending failed!", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
