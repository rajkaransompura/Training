package raj.rkscode.training.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import raj.rkscode.training.R;
import raj.rkscode.training.prototype.RecyclerModule;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.MyViewHolder> {

    private Context mCtx;
    private List<RecyclerModule> moduleList;


    public ModuleAdapter(Context mCtx, List<RecyclerModule> moduleList){
        this.moduleList = moduleList;
        this.mCtx = mCtx;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView pic;
        public TextView title,year;

        public MyViewHolder(View view) {
            super(view);
            pic = view.findViewById(R.id.pic);
            title = view.findViewById(R.id.title);
            year = view.findViewById(R.id.year);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ModuleAdapter.MyViewHolder holder, int position) {
            RecyclerModule module = moduleList.get(position);
            holder.pic.setImageDrawable(mCtx.getResources().getDrawable(module.getPic()));
            holder.title.setText(module.getTitle());
            holder.year.setText(module.getYear());
    }

    @Override
    public int getItemCount() {
        return moduleList.size();
    }
}
