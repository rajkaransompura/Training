package raj.rkscode.training;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertBoxEx extends AppCompatActivity{
    private Button singlebtn,dublebtn,triplebtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertboxex);

        singlebtn = findViewById(R.id.single_alert_btn);
        singlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertBoxEx.this);
                builder.setTitle("Sample Alert !!");
                builder.setMessage("Singel Action Button Alert");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "Yes is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });


        dublebtn = findViewById(R.id.double_alert_btn);
        dublebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertBoxEx.this);
                builder.setTitle("Sample Alert !!");
                builder.setMessage("Double Action Button Alert");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "No clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

        triplebtn = findViewById(R.id.triple_alert_btn);
        triplebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertBoxEx.this);
                builder.setTitle("Sample Alert");
                builder.setMessage("Triple Action Button Alert");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "No Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxEx.this, "Cancled", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }
}
