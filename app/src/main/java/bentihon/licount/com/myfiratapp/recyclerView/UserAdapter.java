package bentihon.licount.com.myfiratapp.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bentihon.licount.com.myfiratapp.R;
import bentihon.licount.com.myfiratapp.storage.BirthDayEntity;

import java.util.List;


class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<BirthDayEntity> birthDay;

    public UserAdapter(List<BirthDayEntity> birthDay){
        this.birthDay = birthDay;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_birth_day_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(birthDay.get(position).getName());
        holder.datee.setText(birthDay.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return birthDay.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView datee;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            datee = itemView.findViewById(R.id.datee);
        }
    }
}