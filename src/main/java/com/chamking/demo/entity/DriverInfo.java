package com.chamking.demo.entity;

import java.util.Date;

/**
 * projectName:logistics
 * ourther:范崇博
 * time：2020/10/98:47
 * description:
 */
public class DriverInfo {
    private String id;
    private String driverName;
    private String idCard;
    private String phone;
    private String gender;
    private Date birthday;
    private String state;
    private String carNo;

    @Override
    public String toString() {
        return "DriverInfo{" +
                "id='" + id + '\'' +
                ", driverName='" + driverName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", state='" + state + '\'' +
                ", carNo='" + carNo + '\'' +
                ", address='" + address + '\'' +
                ", companyCar='" + companyCar + '\'' +
                ", allowCarryVolume=" + allowCarryVolume +
                ", allowCarryWeight=" + allowCarryWeight +
                ", bizLicence='" + bizLicence + '\'' +
                ", carDept='" + carDept + '\'' +
                ", carDeptTel='" + carDeptTel + '\'' +
                ", carFrameNo='" + carFrameNo + '\'' +
                ", carLength='" + carLength + '\'' +
                ", carType='" + carType + '\'' +
                ", carWidth='" + carWidth + '\'' +
                ", driveLicence='" + driveLicence + '\'' +
                ", engineNo='" + engineNo + '\'' +
                ", goodsHeight='" + goodsHeight + '\'' +
                ", insuranceCard='" + insuranceCard + '\'' +
                ", remark='" + remark + '\'' +
                ", runLicence='" + runLicence + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(String companyCar) {
        this.companyCar = companyCar;
    }

    public double getAllowCarryVolume() {
        return allowCarryVolume;
    }

    public void setAllowCarryVolume(double allowCarryVolume) {
        this.allowCarryVolume = allowCarryVolume;
    }

    public double getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(double allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight;
    }

    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence;
    }

    public String getCarDept() {
        return carDept;
    }

    public void setCarDept(String carDept) {
        this.carDept = carDept;
    }

    public String getCarDeptTel() {
        return carDeptTel;
    }

    public void setCarDeptTel(String carDeptTel) {
        this.carDeptTel = carDeptTel;
    }

    public String getCarFrameNo() {
        return carFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo;
    }

    public String getCarLength() {
        return carLength;
    }

    public void setCarLength(String carLength) {
        this.carLength = carLength;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth;
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight;
    }

    public String getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(String insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRunLicence() {
        return runLicence;
    }

    public void setRunLicence(String runLicence) {
        this.runLicence = runLicence;
    }

    private String address;
    private String companyCar;
    private double allowCarryVolume;
    private double allowCarryWeight;
    private String bizLicence;
    private String carDept;
    private String carDeptTel;
    private String carFrameNo;
    private String carLength;
    private String carType;
    private String carWidth;
    private String driveLicence;
    private String engineNo;
    private String goodsHeight;
    private String insuranceCard;
    private String remark;
    private String runLicence;


}
