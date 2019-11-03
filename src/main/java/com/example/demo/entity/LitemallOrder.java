package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "litemall_order", schema = "litemall", catalog = "")
public class LitemallOrder {
    private int id;
    private int userId;
    private String orderSn;
    private short orderStatus;
    private String consignee;
    private String mobile;
    private String address;
    private String message;
    private BigDecimal goodsPrice;
    private BigDecimal freightPrice;
    private BigDecimal couponPrice;
    private BigDecimal integralPrice;
    private BigDecimal grouponPrice;
    private BigDecimal orderPrice;
    private BigDecimal actualPrice;
    private String payId;
    private Timestamp payTime;
    private String shipSn;
    private String shipChannel;
    private Timestamp shipTime;
    private Timestamp confirmTime;
    private Short comments;
    private Timestamp endTime;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Byte deleted;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "order_sn")
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Basic
    @Column(name = "order_status")
    public short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(short orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "goods_price")
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "freight_price")
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    @Basic
    @Column(name = "coupon_price")
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    @Basic
    @Column(name = "integral_price")
    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    @Basic
    @Column(name = "groupon_price")
    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

    public void setGrouponPrice(BigDecimal grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    @Basic
    @Column(name = "order_price")
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "actual_price")
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    @Basic
    @Column(name = "pay_id")
    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "pay_time")
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "ship_sn")
    public String getShipSn() {
        return shipSn;
    }

    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    @Basic
    @Column(name = "ship_channel")
    public String getShipChannel() {
        return shipChannel;
    }

    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    @Basic
    @Column(name = "ship_time")
    public Timestamp getShipTime() {
        return shipTime;
    }

    public void setShipTime(Timestamp shipTime) {
        this.shipTime = shipTime;
    }

    @Basic
    @Column(name = "confirm_time")
    public Timestamp getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Basic
    @Column(name = "comments")
    public Short getComments() {
        return comments;
    }

    public void setComments(Short comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "add_time")
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "deleted")
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LitemallOrder that = (LitemallOrder) o;
        return id == that.id &&
                userId == that.userId &&
                orderStatus == that.orderStatus &&
                Objects.equals(orderSn, that.orderSn) &&
                Objects.equals(consignee, that.consignee) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(address, that.address) &&
                Objects.equals(message, that.message) &&
                Objects.equals(goodsPrice, that.goodsPrice) &&
                Objects.equals(freightPrice, that.freightPrice) &&
                Objects.equals(couponPrice, that.couponPrice) &&
                Objects.equals(integralPrice, that.integralPrice) &&
                Objects.equals(grouponPrice, that.grouponPrice) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(actualPrice, that.actualPrice) &&
                Objects.equals(payId, that.payId) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(shipSn, that.shipSn) &&
                Objects.equals(shipChannel, that.shipChannel) &&
                Objects.equals(shipTime, that.shipTime) &&
                Objects.equals(confirmTime, that.confirmTime) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, orderSn, orderStatus, consignee, mobile, address, message, goodsPrice, freightPrice, couponPrice, integralPrice, grouponPrice, orderPrice, actualPrice, payId, payTime, shipSn, shipChannel, shipTime, confirmTime, comments, endTime, addTime, updateTime, deleted);
    }
}
