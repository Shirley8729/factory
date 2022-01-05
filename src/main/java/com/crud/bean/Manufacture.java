package com.crud.bean;

public class Manufacture {
    private Integer id;

    private Integer e0;

    private Integer e1;

    private String bar;

    private String manufacture;

    private Integer manufactureCode;

    private Integer updateType;

    private String remark;

    private String brand;

    public Manufacture() {
    }

    public Manufacture(Integer id, Integer e0, Integer e1, String bar, String manufacture, Integer manufactureCode, Integer updateType, String remark, String brand) {
        this.id = id;
        this.e0 = e0;
        this.e1 = e1;
        this.bar = bar;
        this.manufacture = manufacture;
        this.manufactureCode = manufactureCode;
        this.updateType = updateType;
        this.remark = remark;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getE0() {
        return e0;
    }

    public void setE0(Integer e0) {
        this.e0 = e0;
    }

    public Integer getE1() {
        return e1;
    }

    public void setE1(Integer e1) {
        this.e1 = e1;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture == null ? null : manufacture.trim();
    }

    public Integer getManufactureCode() {
        return manufactureCode;
    }

    public void setManufactureCode(Integer manufactureCode) {
        this.manufactureCode = manufactureCode;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }
}