package team.triplog.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import team.triplog.R;
import team.triplog.vo.MainHomeVo;

public class MainHomeAdapter extends RecyclerView.Adapter<MainHomeAdapter.ViewHolder> {
    private ArrayList<MainHomeVo> tripList;
    private Context mContext;
    private View.OnClickListener onClickListener;

    public MainHomeAdapter(Context mContext, ArrayList<MainHomeVo> tripList, View.OnClickListener onClickListener){
        this.mContext=mContext;
        this.tripList=tripList;
        this.onClickListener=onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_main_home_trip,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MainHomeVo mainHomeVo = tripList.get(position);

        holder.txtTripTitle.setText(mainHomeVo.title);
        holder.txtTripTitle.setTag(mainHomeVo.title);
        holder.txtTripTitle.setOnClickListener(onClickListener);
        holder.imageView.setImageResource(mainHomeVo.drawbleId);
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtTripTitle;
        public ImageView imageView;

        public ViewHolder (View view){
            super(view);
            txtTripTitle = view.findViewById(R.id.txt_trip_title);
            imageView = view.findViewById(R.id.imageView);
        }
    }
}
