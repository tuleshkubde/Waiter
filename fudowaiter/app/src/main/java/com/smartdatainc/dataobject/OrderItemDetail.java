package com.smartdatainc.dataobject;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by aniketraut on 24/1/18.
 */

public class OrderItemDetail implements Serializable {

    @SerializedName("OrderId")
    @Expose
    private Integer orderId;
    @SerializedName("HotelId")
    @Expose
    private Integer hotelId;
    @SerializedName("DishId")
    @Expose
    private Integer dishId;
    @SerializedName("Quantity")
    @Expose
    private Integer quantity;
    @SerializedName("DishName")
    @Expose
    private String dishName;
    @SerializedName("DishAmount")
    @Expose
    private Integer dishAmount;
    @SerializedName("CreateDate")
    @Expose
    private String createDate;

    protected OrderItemDetail(Parcel in) {
        if (in.readByte() == 0) {
            orderId = null;
        } else {
            orderId = in.readInt();
        }
        if (in.readByte() == 0) {
            hotelId = null;
        } else {
            hotelId = in.readInt();
        }
        if (in.readByte() == 0) {
            dishId = null;
        } else {
            dishId = in.readInt();
        }
        if (in.readByte() == 0) {
            quantity = null;
        } else {
            quantity = in.readInt();
        }
        dishName = in.readString();
        if (in.readByte() == 0) {
            dishAmount = null;
        } else {
            dishAmount = in.readInt();
        }
        createDate = in.readString();
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getDishAmount() {
        return dishAmount;
    }

    public void setDishAmount(Integer dishAmount) {
        this.dishAmount = dishAmount;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
