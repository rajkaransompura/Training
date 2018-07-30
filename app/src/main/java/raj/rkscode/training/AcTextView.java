package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AcTextView extends AppCompatActivity {
    private AutoCompleteTextView acTextView;
    private TextView textView;
    String[] inputs = {"asia","america","australia","africa","antarctica","europe"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actxtview);

        acTextView =findViewById(R.id.actextview);
        textView = findViewById(R.id.txtview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, inputs);
        acTextView.setAdapter(adapter);
    }
}
