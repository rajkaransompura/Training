package raj.rkscode.training;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntAct1 extends AppCompatActivity {
    TextView textView;
    EditText inputed;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.int_act1);

        inputed = findViewById(R.id.text_name);
        button = findViewById(R.id.int_act1_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = inputed.getText().toString();
                if(string.length() == 0){
                    inputed.setError("Enter String to go");
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), IntAct2.class);
                    intent.putExtra("name", string);
                    startActivity(intent);
                }
            }
        });

    }
}
