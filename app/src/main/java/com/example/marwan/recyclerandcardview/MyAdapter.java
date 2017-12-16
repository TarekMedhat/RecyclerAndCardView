package com.example.marwan.recyclerandcardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marwan on 12/14/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHoler> {

    private ArrayList<ItemData> DataItem;
    private Context context;

    public MyAdapter(ArrayList<ItemData> dataItem, Context context) {
        DataItem = dataItem;
        this.context = context;
    }

    //called when another viewHolder is created
    @Override
    public ViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHoler(view);
    }


    //will bind the data to ViewHolder ... Show the actual data to RecyclerView
    @Override
    public void onBindViewHolder(ViewHoler holder, int position) {
        ItemData itemData=DataItem.get(position);
        holder.header.setText(itemData.getHead());
        holder.Desc.setText(itemData.getDesc());

    }


    //
    @Override
    public int getItemCount() {
        return DataItem.size();
    }



    public class ViewHoler extends RecyclerView.ViewHolder {
        public TextView header,Desc;

        public ViewHoler(View itemView) {
            super(itemView);
            header=(TextView) itemView.findViewById(R.id.heading);
            Desc=(TextView) itemView.findViewById(R.id.description);
        }
    }
}
