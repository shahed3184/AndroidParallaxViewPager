package com.shahed.parallaxviewpager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.DessertVh> {


    private List<ItemModel> itemModels = new ArrayList<>();

    private Context context;

    public MyRecyclerAdapter(Context context) {
        this.context = context;

        itemModels = ItemModel.prepareDesserts(
                context.getResources().getStringArray(R.array.dessert_names),
                context.getResources().getStringArray(R.array.dessert_descriptions));
    }

    @Override
    public DessertVh onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        return new MyRecyclerAdapter.DessertVh(view);
    }

    @Override
    public void onBindViewHolder(DessertVh holder, int position) {
        ItemModel itemModel = itemModels.get(position);

        holder.mName.setText(itemModel.getName());
        holder.mDescription.setText(itemModel.getDescription());
        holder.mFirstLetter.setText(String.valueOf(itemModel.getFirstLetter()));

    }

    @Override
    public int getItemCount() {
        return itemModels == null ? 0 : itemModels.size();
    }

    public static class DessertVh extends RecyclerView.ViewHolder {

        private TextView mName;
        private TextView mDescription;
        private TextView mFirstLetter;

        public DessertVh(View itemView) {
            super(itemView);

            mName = (TextView) itemView.findViewById(R.id.txt_name);
            mDescription = (TextView) itemView.findViewById(R.id.txt_desc);
            mFirstLetter = (TextView) itemView.findViewById(R.id.txt_firstletter);
        }
    }
}
