package com.crud.bean;

public class Manufacture {
    private String rep30050;

    private String 中文厂商;

    private Integer e01;

    private Integer e1;

    private String brand;

    private String 厂商码;

    private String use;

    private String infotype;

    private String manufacture;

    private Integer manufactureCode;

    private String newBrand;

    private Integer updatetype;

    private String remark;

    private Integer id;

    public String getRep30050() {
        return rep30050;
    }

    public void setRep30050(String rep30050) {
        this.rep30050 = rep30050 == null ? null : rep30050.trim();
    }

    public String get中文厂商() {
        return 中文厂商;
    }

    public void set中文厂商(String 中文厂商) {
        this.中文厂商 = 中文厂商 == null ? null : 中文厂商.trim();
    }

    public Integer getE01() {
        return e01;
    }

    public void setE01(Integer e01) {
        this.e01 = e01;
    }

    public Integer getE1() {
        return e1;
    }

    public void setE1(Integer e1) {
        this.e1 = e1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String get厂商码() {
        return 厂商码;
    }

    public void set厂商码(String 厂商码) {
        this.厂商码 = 厂商码 == null ? null : 厂商码.trim();
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use == null ? null : use.trim();
    }

    public String getInfotype() {
        return infotype;
    }

    public void setInfotype(String infotype) {
        this.infotype = infotype == null ? null : infotype.trim();
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

    public String getNewBrand() {
        return newBrand;
    }

    public void setNewBrand(String newBrand) {
        this.newBrand = newBrand == null ? null : newBrand.trim();
    }

    public Integer getUpdatetype() {
        return updatetype;
    }

    public void setUpdatetype(Integer updatetype) {
        this.updatetype = updatetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}