package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MenusEx extends AppCompatActivity {
    TextView textView;
    RelativeLayout relativeLayout;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuex);

        relativeLayout = findViewById(R.id.relLayout);
        textView = findViewById(R.id.text_long_menu);
        button = findViewById(R.id.bgcolor_btn);

        registerForContextMenu(textView);

    }
    public void changeBg(View view){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(), button);
        popupMenu.getMenuInflater().inflate(R.layout.menu_main, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.cyan));
                        break;
                    case R.id.setting:
                        relativeLayout.setBackgroundColor(getResources().getColor(R.color.pink));
                        break;
                    case R.id.exit:
                        finish();
                        break;
                }
                return true;
            }
        });
        popupMenu.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case R.id.setting:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.exit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose color");
        menu.add(0,v.getId(),0,"Yellow");
        menu.add(0,v.getId(),0,"Green");
        menu.add(0,v.getId(),0,"Blue");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle() == "Yellow"){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
        else if(item.getTitle()=="Green"){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.green));
        }
        else if(item.getTitle()=="Blue"){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.blue));
        }
        return true;
    }
}
