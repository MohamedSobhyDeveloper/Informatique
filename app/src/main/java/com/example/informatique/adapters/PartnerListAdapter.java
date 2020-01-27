package com.example.informatique.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informatique.R;
import com.example.informatique.models.HumanPartners;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PartnerListAdapter extends RecyclerView.Adapter<PartnerListAdapter.ViewHolder> {

    private List<HumanPartners> items;
    private Context context;


    public PartnerListAdapter(List<HumanPartners> items, Context context) {

        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.partner_list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.nameTitleTv.setText(items.get(position).getNameAr()+"");
        holder.nationalityTv.setText(items.get(position).getNationality()+"");
        holder.ninTv.setText(items.get(position).getNIN()+"");

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.name_title_tv)
        TextView nameTitleTv;
        @BindView(R.id.nationality_tv)
        TextView nationalityTv;
        @BindView(R.id.nin_tv)
        TextView ninTv;

        ViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
