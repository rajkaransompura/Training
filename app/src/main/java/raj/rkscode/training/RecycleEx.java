package raj.rkscode.training;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import raj.rkscode.training.adapter.ModuleAdapter;
import raj.rkscode.training.prototype.RecyclerModule;

public class RecycleEx extends AppCompatActivity {

    private List<RecyclerModule> moduleList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        moduleList = new ArrayList<>();

        moduleList.add(new RecyclerModule(R.drawable.icon2,"TITLE1","2018"));
        moduleList.add(new RecyclerModule(R.drawable.icon4,"TITLE2","2018"));
        moduleList.add(new RecyclerModule(R.drawable.icon9,"TITLE3","2018"));
        moduleList.add(new RecyclerModule(R.mipmap.ic_launcher_round,"TITLE4","2018"));
        moduleList.add(new RecyclerModule(R.drawable.icon2,"TITLE5","2018"));

        ModuleAdapter adapter = new ModuleAdapter(this, moduleList);
        recyclerView.setAdapter(adapter);
    }
}
