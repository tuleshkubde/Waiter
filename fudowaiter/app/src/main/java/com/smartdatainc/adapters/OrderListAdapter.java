package com.smartdatainc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdatainc.dataobject.OrderItemDetail;
import com.smartdatainc.fudowaiter.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aniketraut on 24/1/18.
 */

public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<OrderItemDetail> orderItemDetails;

    public OrderListAdapter(Context context, ArrayList<OrderItemDetail> orderItemDetails) {
        this.context = context;
        this.orderItemDetails = orderItemDetails;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public OrderListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_dish, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(OrderListAdapter.MyViewHolder holder, int position) {

        final OrderItemDetail orderItemDetail = orderItemDetails.get(position);


        holder.dishName.setText(orderItemDetail.getDishName());
        holder.dishPrice.setText(""+orderItemDetail.getDishAmount());

        if (position % 2 == 0) {
            holder.mImageView.setBackgroundResource(R.drawable.restaurant_first);
        } else {
            holder.mImageView.setBackgroundResource(R.drawable.restaurant_second);
        }


    }

    @Override
    public int getItemCount() {
        return orderItemDetails.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView dishName, dishPrice;
        private ImageView mImageView;

        public MyViewHolder(View view) {
            super(view);
            dishName = (TextView) view.findViewById(R.id.dish_name);
            dishPrice = (TextView) view.findViewById(R.id.dish_price);
            mImageView = (ImageView) view.findViewById(R.id.dish_image);

        }
    }
}
