package com.crud.bean;

public class Manufacture {
    private String rep30050;

    private String manufactureChinese;

    private Integer e01;

    private Integer e1;

    private String brand;

    private String bar;

    private String whether;

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

    public String getManufactureChinese() {
        return manufactureChinese;
    }

    public void setManufactureChinese(String manufactureChinese) {
        this.manufactureChinese = manufactureChinese == null ? null : manufactureChinese.trim();
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

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar == null ? null : bar.trim();
    }

    public String getWhether() {
        return whether;
    }

    public void setWhether(String whether) {
        this.whether = whether == null ? null : whether.trim();
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