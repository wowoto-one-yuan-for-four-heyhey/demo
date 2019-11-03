package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "litemall_coupon", schema = "litemall", catalog = "")
public class LitemallCoupon {
    private int id;
    private String name;
    private String desc;
    private String tag;
    private int total;
    private BigDecimal discount;
    private BigDecimal min;
    private Short limit;
    private Short type;
    private Short status;
    private Short goodsType;
    private String goodsValue;
    private String code;
    private Short timeType;
    private Short days;
    private Timestamp startTime;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "total")
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Basic
    @Column(name = "discount")
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "min")
    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    @Basic
    @Column(name = "limit")
    public Short getLimit() {
        return limit;
    }

    public void setLimit(Short limit) {
        this.limit = limit;
    }

    @Basic
    @Column(name = "type")
    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "goods_type")
    public Short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    @Basic
    @Column(name = "goods_value")
    public String getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "time_type")
    public Short getTimeType() {
        return timeType;
    }

    public void setTimeType(Short timeType) {
        this.timeType = timeType;
    }

    @Basic
    @Column(name = "days")
    public Short getDays() {
        return days;
    }

    public void setDays(Short days) {
        this.days = days;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
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
        LitemallCoupon that = (LitemallCoupon) o;
        return id == that.id &&
                total == that.total &&
                Objects.equals(name, that.name) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(tag, that.tag) &&
                Objects.equals(discount, that.discount) &&
                Objects.equals(min, that.min) &&
                Objects.equals(limit, that.limit) &&
                Objects.equals(type, that.type) &&
                Objects.equals(status, that.status) &&
                Objects.equals(goodsType, that.goodsType) &&
                Objects.equals(goodsValue, that.goodsValue) &&
                Objects.equals(code, that.code) &&
                Objects.equals(timeType, that.timeType) &&
                Objects.equals(days, that.days) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, tag, total, discount, min, limit, type, status, goodsType, goodsValue, code, timeType, days, startTime, endTime, addTime, updateTime, deleted);
    }
}
