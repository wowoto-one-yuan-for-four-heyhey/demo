package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "litemall_user_formid", schema = "litemall", catalog = "")
public class LitemallUserFormid {
    private int id;
    private String formId;
    private byte isprepay;
    private int useAmount;
    private Timestamp expireTime;
    private String openId;
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
    @Column(name = "formId")
    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Basic
    @Column(name = "isprepay")
    public byte getIsprepay() {
        return isprepay;
    }

    public void setIsprepay(byte isprepay) {
        this.isprepay = isprepay;
    }

    @Basic
    @Column(name = "useAmount")
    public int getUseAmount() {
        return useAmount;
    }

    public void setUseAmount(int useAmount) {
        this.useAmount = useAmount;
    }

    @Basic
    @Column(name = "expire_time")
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "openId")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
        LitemallUserFormid that = (LitemallUserFormid) o;
        return id == that.id &&
                isprepay == that.isprepay &&
                useAmount == that.useAmount &&
                Objects.equals(formId, that.formId) &&
                Objects.equals(expireTime, that.expireTime) &&
                Objects.equals(openId, that.openId) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formId, isprepay, useAmount, expireTime, openId, addTime, updateTime, deleted);
    }
}
