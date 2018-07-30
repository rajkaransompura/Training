package raj.rkscode.training;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntAct2 extends AppCompatActivity {
    TextView textView;
    Button back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.int_act2);

        textView = findViewById(R.id.title_text);
        back = findViewById(R.id.int_act2_btn);

        String string = getIntent().getStringExtra("name");
        textView.setText("Last Inputed : "+ string.toUpperCase());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntAct1.class);
                startActivity(intent);
            }
        });
    }
}
