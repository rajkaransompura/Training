package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerEx extends AppCompatActivity {
    private Spinner spinner;
    private TextView capital;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerlay);

        spinner = findViewById(R.id.spinner);
        capital = findViewById(R.id.txtcapital);

        String[] countries = {"India","Amarica","China","Pakishthan","Spain"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countries);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        capital.setText("Dehli");
                        break;
                    case 1:
                        capital.setText("Washington DC");
                        break;
                    case 2:
                        capital.setText("Bejing");
                        break;
                    case 3:
                        capital.setText("Ishlamabad");
                        break;
                    case 4:
                        capital.setText("Madrid");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
