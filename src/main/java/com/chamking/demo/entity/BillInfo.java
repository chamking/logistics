package com.chamking.demo.entity;

import java.util.Date;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/814:37
 * description:
 */
public class BillInfo {
    private long id;
    private String billType;
    private  String billCode;
    private Date writeDate;
    private String acceptStation;

    @Override
    public String toString() {
        return "BillInfo{" +
                "id=" + id +
                ", billType='" + billType + '\'' +
                ", billCode='" + billCode + '\'' +
                ", writeDate=" + writeDate +
                ", acceptStation='" + acceptStation + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }
}
