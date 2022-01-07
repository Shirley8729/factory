package com.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class ManufactureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufactureExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRep30050IsNull() {
            addCriterion("REP30050 is null");
            return (Criteria) this;
        }

        public Criteria andRep30050IsNotNull() {
            addCriterion("REP30050 is not null");
            return (Criteria) this;
        }

        public Criteria andRep30050EqualTo(String value) {
            addCriterion("REP30050 =", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050NotEqualTo(String value) {
            addCriterion("REP30050 <>", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050GreaterThan(String value) {
            addCriterion("REP30050 >", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050GreaterThanOrEqualTo(String value) {
            addCriterion("REP30050 >=", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050LessThan(String value) {
            addCriterion("REP30050 <", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050LessThanOrEqualTo(String value) {
            addCriterion("REP30050 <=", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050Like(String value) {
            addCriterion("REP30050 like", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050NotLike(String value) {
            addCriterion("REP30050 not like", value, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050In(List<String> values) {
            addCriterion("REP30050 in", values, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050NotIn(List<String> values) {
            addCriterion("REP30050 not in", values, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050Between(String value1, String value2) {
            addCriterion("REP30050 between", value1, value2, "rep30050");
            return (Criteria) this;
        }

        public Criteria andRep30050NotBetween(String value1, String value2) {
            addCriterion("REP30050 not between", value1, value2, "rep30050");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseIsNull() {
            addCriterion("中文厂商 is null");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseIsNotNull() {
            addCriterion("中文厂商 is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseEqualTo(String value) {
            addCriterion("中文厂商 =", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseNotEqualTo(String value) {
            addCriterion("中文厂商 <>", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseGreaterThan(String value) {
            addCriterion("中文厂商 >", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseGreaterThanOrEqualTo(String value) {
            addCriterion("中文厂商 >=", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseLessThan(String value) {
            addCriterion("中文厂商 <", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseLessThanOrEqualTo(String value) {
            addCriterion("中文厂商 <=", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseLike(String value) {
            addCriterion("中文厂商 like", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseNotLike(String value) {
            addCriterion("中文厂商 not like", value, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseIn(List<String> values) {
            addCriterion("中文厂商 in", values, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseNotIn(List<String> values) {
            addCriterion("中文厂商 not in", values, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseBetween(String value1, String value2) {
            addCriterion("中文厂商 between", value1, value2, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andManufactureChineseNotBetween(String value1, String value2) {
            addCriterion("中文厂商 not between", value1, value2, "manufactureChinese");
            return (Criteria) this;
        }

        public Criteria andE01IsNull() {
            addCriterion("E0_1 is null");
            return (Criteria) this;
        }

        public Criteria andE01IsNotNull() {
            addCriterion("E0_1 is not null");
            return (Criteria) this;
        }

        public Criteria andE01EqualTo(Integer value) {
            addCriterion("E0_1 =", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotEqualTo(Integer value) {
            addCriterion("E0_1 <>", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01GreaterThan(Integer value) {
            addCriterion("E0_1 >", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01GreaterThanOrEqualTo(Integer value) {
            addCriterion("E0_1 >=", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01LessThan(Integer value) {
            addCriterion("E0_1 <", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01LessThanOrEqualTo(Integer value) {
            addCriterion("E0_1 <=", value, "e01");
            return (Criteria) this;
        }

        public Criteria andE01In(List<Integer> values) {
            addCriterion("E0_1 in", values, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotIn(List<Integer> values) {
            addCriterion("E0_1 not in", values, "e01");
            return (Criteria) this;
        }

        public Criteria andE01Between(Integer value1, Integer value2) {
            addCriterion("E0_1 between", value1, value2, "e01");
            return (Criteria) this;
        }

        public Criteria andE01NotBetween(Integer value1, Integer value2) {
            addCriterion("E0_1 not between", value1, value2, "e01");
            return (Criteria) this;
        }

        public Criteria andE1IsNull() {
            addCriterion("E1 is null");
            return (Criteria) this;
        }

        public Criteria andE1IsNotNull() {
            addCriterion("E1 is not null");
            return (Criteria) this;
        }

        public Criteria andE1EqualTo(Integer value) {
            addCriterion("E1 =", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotEqualTo(Integer value) {
            addCriterion("E1 <>", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1GreaterThan(Integer value) {
            addCriterion("E1 >", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1GreaterThanOrEqualTo(Integer value) {
            addCriterion("E1 >=", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1LessThan(Integer value) {
            addCriterion("E1 <", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1LessThanOrEqualTo(Integer value) {
            addCriterion("E1 <=", value, "e1");
            return (Criteria) this;
        }

        public Criteria andE1In(List<Integer> values) {
            addCriterion("E1 in", values, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotIn(List<Integer> values) {
            addCriterion("E1 not in", values, "e1");
            return (Criteria) this;
        }

        public Criteria andE1Between(Integer value1, Integer value2) {
            addCriterion("E1 between", value1, value2, "e1");
            return (Criteria) this;
        }

        public Criteria andE1NotBetween(Integer value1, Integer value2) {
            addCriterion("E1 not between", value1, value2, "e1");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBarIsNull() {
            addCriterion("厂商码 is null");
            return (Criteria) this;
        }

        public Criteria andBarIsNotNull() {
            addCriterion("厂商码 is not null");
            return (Criteria) this;
        }

        public Criteria andBarEqualTo(String value) {
            addCriterion("厂商码 =", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotEqualTo(String value) {
            addCriterion("厂商码 <>", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarGreaterThan(String value) {
            addCriterion("厂商码 >", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarGreaterThanOrEqualTo(String value) {
            addCriterion("厂商码 >=", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLessThan(String value) {
            addCriterion("厂商码 <", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLessThanOrEqualTo(String value) {
            addCriterion("厂商码 <=", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLike(String value) {
            addCriterion("厂商码 like", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotLike(String value) {
            addCriterion("bar not like", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarIn(List<String> values) {
            addCriterion("厂商码 in", values, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotIn(List<String> values) {
            addCriterion("厂商码 not in", values, "bar");
            return (Criteria) this;
        }

        public Criteria andBarBetween(String value1, String value2) {
            addCriterion("bar between", value1, value2, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotBetween(String value1, String value2) {
            addCriterion("厂商码 not between", value1, value2, "bar");
            return (Criteria) this;
        }

        public Criteria andWhetherIsNull() {
            addCriterion("whether is null");
            return (Criteria) this;
        }

        public Criteria andWhetherIsNotNull() {
            addCriterion("whether is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherEqualTo(String value) {
            addCriterion("whether =", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherNotEqualTo(String value) {
            addCriterion("whether<>", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherGreaterThan(String value) {
            addCriterion("whether >", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherGreaterThanOrEqualTo(String value) {
            addCriterion("whether >=", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherLessThan(String value) {
            addCriterion("whether <", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherLessThanOrEqualTo(String value) {
            addCriterion("whether <=", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherLike(String value) {
            addCriterion("whether like", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherNotLike(String value) {
            addCriterion("whether not like", value, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherIn(List<String> values) {
            addCriterion("whether in", values, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherNotIn(List<String> values) {
            addCriterion("whether not in", values, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherBetween(String value1, String value2) {
            addCriterion("whether between", value1, value2, "whether");
            return (Criteria) this;
        }

        public Criteria andWhetherNotBetween(String value1, String value2) {
            addCriterion("whether not between", value1, value2, "whether");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNull() {
            addCriterion("InfoType is null");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNotNull() {
            addCriterion("InfoType is not null");
            return (Criteria) this;
        }

        public Criteria andInfotypeEqualTo(String value) {
            addCriterion("InfoType =", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotEqualTo(String value) {
            addCriterion("InfoType <>", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThan(String value) {
            addCriterion("InfoType >", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThanOrEqualTo(String value) {
            addCriterion("InfoType >=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThan(String value) {
            addCriterion("InfoType <", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThanOrEqualTo(String value) {
            addCriterion("InfoType <=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLike(String value) {
            addCriterion("InfoType like", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotLike(String value) {
            addCriterion("InfoType not like", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeIn(List<String> values) {
            addCriterion("InfoType in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotIn(List<String> values) {
            addCriterion("InfoType not in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeBetween(String value1, String value2) {
            addCriterion("InfoType between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotBetween(String value1, String value2) {
            addCriterion("InfoType not between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNull() {
            addCriterion("Manufacture is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNotNull() {
            addCriterion("Manufacture is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureEqualTo(String value) {
            addCriterion("Manufacture =", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotEqualTo(String value) {
            addCriterion("Manufacture <>", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThan(String value) {
            addCriterion("Manufacture >", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThanOrEqualTo(String value) {
            addCriterion("Manufacture >=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThan(String value) {
            addCriterion("Manufacture <", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThanOrEqualTo(String value) {
            addCriterion("Manufacture <=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLike(String value) {
            addCriterion("Manufacture like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotLike(String value) {
            addCriterion("Manufacture not like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureIn(List<String> values) {
            addCriterion("Manufacture in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotIn(List<String> values) {
            addCriterion("Manufacture not in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureBetween(String value1, String value2) {
            addCriterion("Manufacture between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotBetween(String value1, String value2) {
            addCriterion("Manufacture not between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIsNull() {
            addCriterion("Manufacture_code is null");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIsNotNull() {
            addCriterion("Manufacture_code is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeEqualTo(Integer value) {
            addCriterion("Manufacture_code =", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotEqualTo(Integer value) {
            addCriterion("Manufacture_code <>", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeGreaterThan(Integer value) {
            addCriterion("Manufacture_code >", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Manufacture_code >=", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeLessThan(Integer value) {
            addCriterion("Manufacture_code <", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeLessThanOrEqualTo(Integer value) {
            addCriterion("Manufacture_code <=", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIn(List<Integer> values) {
            addCriterion("Manufacture_code in", values, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotIn(List<Integer> values) {
            addCriterion("Manufacture_code not in", values, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeBetween(Integer value1, Integer value2) {
            addCriterion("Manufacture_code between", value1, value2, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Manufacture_code not between", value1, value2, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andNewBrandIsNull() {
            addCriterion("new_brand is null");
            return (Criteria) this;
        }

        public Criteria andNewBrandIsNotNull() {
            addCriterion("new_brand is not null");
            return (Criteria) this;
        }

        public Criteria andNewBrandEqualTo(String value) {
            addCriterion("new_brand =", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandNotEqualTo(String value) {
            addCriterion("new_brand <>", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandGreaterThan(String value) {
            addCriterion("new_brand >", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandGreaterThanOrEqualTo(String value) {
            addCriterion("new_brand >=", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandLessThan(String value) {
            addCriterion("new_brand <", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandLessThanOrEqualTo(String value) {
            addCriterion("new_brand <=", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandLike(String value) {
            addCriterion("new_brand like", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandNotLike(String value) {
            addCriterion("new_brand not like", value, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandIn(List<String> values) {
            addCriterion("new_brand in", values, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandNotIn(List<String> values) {
            addCriterion("new_brand not in", values, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandBetween(String value1, String value2) {
            addCriterion("new_brand between", value1, value2, "newBrand");
            return (Criteria) this;
        }

        public Criteria andNewBrandNotBetween(String value1, String value2) {
            addCriterion("new_brand not between", value1, value2, "newBrand");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIsNull() {
            addCriterion("UpdateType is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIsNotNull() {
            addCriterion("UpdateType is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeEqualTo(Integer value) {
            addCriterion("UpdateType =", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotEqualTo(Integer value) {
            addCriterion("UpdateType <>", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeGreaterThan(Integer value) {
            addCriterion("UpdateType >", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdateType >=", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeLessThan(Integer value) {
            addCriterion("UpdateType <", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("UpdateType <=", value, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeIn(List<Integer> values) {
            addCriterion("UpdateType in", values, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotIn(List<Integer> values) {
            addCriterion("UpdateType not in", values, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeBetween(Integer value1, Integer value2) {
            addCriterion("UpdateType between", value1, value2, "updatetype");
            return (Criteria) this;
        }

        public Criteria andUpdatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdateType not between", value1, value2, "updatetype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}