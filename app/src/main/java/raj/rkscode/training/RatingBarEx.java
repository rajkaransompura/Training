package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Raj on 30-06-2018.
 */

public class RatingBarEx extends AppCompatActivity {

    private Button button;
    private RatingBar ratingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbarex);

        TextView textView = findViewById(R.id.txt);

        addListenerOnButtonClick();

    }

    private void addListenerOnButtonClick() {
        ratingBar = findViewById(R.id.rate);
        button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(RatingBarEx.this, rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
