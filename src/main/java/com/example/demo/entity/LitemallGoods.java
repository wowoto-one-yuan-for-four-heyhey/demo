package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "litemall_goods", schema = "litemall", catalog = "")
public class LitemallGoods {
    private int id;
    private String goodsSn;
    private String name;
    private Integer categoryId;
    private Integer brandId;
    private String gallery;
    private String keywords;
    private String brief;
    private Byte isOnSale;
    private Short sortOrder;
    private String picUrl;
    private String shareUrl;
    private Byte isNew;
    private Byte isHot;
    private String unit;
    private BigDecimal counterPrice;
    private BigDecimal retailPrice;
    private String detail;
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
    @Column(name = "goods_sn")
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
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
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "brand_id")
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "gallery")
    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "brief")
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Basic
    @Column(name = "is_on_sale")
    public Byte getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Basic
    @Column(name = "sort_order")
    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "pic_url")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Basic
    @Column(name = "share_url")
    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    @Basic
    @Column(name = "is_new")
    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "is_hot")
    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "counter_price")
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    @Basic
    @Column(name = "retail_price")
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
        LitemallGoods that = (LitemallGoods) o;
        return id == that.id &&
                Objects.equals(goodsSn, that.goodsSn) &&
                Objects.equals(name, that.name) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(gallery, that.gallery) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(brief, that.brief) &&
                Objects.equals(isOnSale, that.isOnSale) &&
                Objects.equals(sortOrder, that.sortOrder) &&
                Objects.equals(picUrl, that.picUrl) &&
                Objects.equals(shareUrl, that.shareUrl) &&
                Objects.equals(isNew, that.isNew) &&
                Objects.equals(isHot, that.isHot) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(counterPrice, that.counterPrice) &&
                Objects.equals(retailPrice, that.retailPrice) &&
                Objects.equals(detail, that.detail) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, goodsSn, name, categoryId, brandId, gallery, keywords, brief, isOnSale, sortOrder, picUrl, shareUrl, isNew, isHot, unit, counterPrice, retailPrice, detail, addTime, updateTime, deleted);
    }
}
