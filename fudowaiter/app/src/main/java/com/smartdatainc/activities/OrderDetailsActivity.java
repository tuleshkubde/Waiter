package com.smartdatainc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.smartdatainc.adapters.OrderListAdapter;
import com.smartdatainc.dataobject.OrderItemDetail;
import com.smartdatainc.dataobject.WaiterModel;
import com.smartdatainc.fudowaiter.R;

import java.util.ArrayList;

public class OrderDetailsActivity extends BaseActivity {

    private RecyclerView dishlist;
    private TextView accept,reject;
    private ArrayList<OrderItemDetail> orderItemDetails;
    private OrderListAdapter orderListAdapter;
    private WaiterModel waiterModel ;
    private String ordereId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        dishlist = (RecyclerView) findViewById(R.id.hotel_list);
        accept = (TextView)findViewById(R.id.accept);
        reject = (TextView)findViewById(R.id.reject);
        orderItemDetails = new ArrayList<>();
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        ordereId = intent.getStringExtra("orderId");
        orderItemDetails   = (ArrayList<OrderItemDetail>)bundle.getSerializable("hotel");
        orderListAdapter = new OrderListAdapter(OrderDetailsActivity.this,orderItemDetails);

        RecyclerView.LayoutManager recyclerViewLayoutManager = new LinearLayoutManager(OrderDetailsActivity.this);
        dishlist.setLayoutManager(recyclerViewLayoutManager);
        dishlist.setItemAnimator(new DefaultItemAnimator());
        dishlist.setAdapter(orderListAdapter);
    }



}
