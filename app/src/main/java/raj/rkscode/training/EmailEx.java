package raj.rkscode.training;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailEx extends AppCompatActivity {

    EditText emailadd,emailsub,emailmsg;
    Button emailsend;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_lay);

        emailadd = findViewById(R.id.email_add);
        emailsub = findViewById(R.id.email_sub);
        emailmsg = findViewById(R.id.email_msg);

        emailsend = findViewById(R.id.send_email);
        emailsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = emailadd.getText().toString();
                String subject = emailsub.getText().toString();
                String message = emailmsg.getText().toString();
                if(to.length()==0){
                    emailmsg.setText("Enter Email Id");
                }
                else {
                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                    email.putExtra(Intent.EXTRA_SUBJECT, subject);
                    email.putExtra(Intent.EXTRA_TEXT, message);

                    email.setType("message/rfc822");

                    startActivity(Intent.createChooser(email, "Choose Email App : "));
                    finish();
                }
            }
        });
    }
}
