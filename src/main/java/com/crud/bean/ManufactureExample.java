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

        public Criteria andE0IsNull() {
            addCriterion("E0 is null");
            return (Criteria) this;
        }

        public Criteria andE0IsNotNull() {
            addCriterion("E0 is not null");
            return (Criteria) this;
        }

        public Criteria andE0EqualTo(Integer value) {
            addCriterion("E0 =", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0NotEqualTo(Integer value) {
            addCriterion("E0 <>", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0GreaterThan(Integer value) {
            addCriterion("E0 >", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0GreaterThanOrEqualTo(Integer value) {
            addCriterion("E0 >=", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0LessThan(Integer value) {
            addCriterion("E0 <", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0LessThanOrEqualTo(Integer value) {
            addCriterion("E0 <=", value, "e0");
            return (Criteria) this;
        }

        public Criteria andE0In(List<Integer> values) {
            addCriterion("E0 in", values, "e0");
            return (Criteria) this;
        }

        public Criteria andE0NotIn(List<Integer> values) {
            addCriterion("E0 not in", values, "e0");
            return (Criteria) this;
        }

        public Criteria andE0Between(Integer value1, Integer value2) {
            addCriterion("E0 between", value1, value2, "e0");
            return (Criteria) this;
        }

        public Criteria andE0NotBetween(Integer value1, Integer value2) {
            addCriterion("E0 not between", value1, value2, "e0");
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

        public Criteria andBarIsNull() {
            addCriterion("bar is null");
            return (Criteria) this;
        }

        public Criteria andBarIsNotNull() {
            addCriterion("bar is not null");
            return (Criteria) this;
        }

        public Criteria andBarEqualTo(String value) {
            addCriterion("bar =", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotEqualTo(String value) {
            addCriterion("bar <>", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarGreaterThan(String value) {
            addCriterion("bar >", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarGreaterThanOrEqualTo(String value) {
            addCriterion("bar >=", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLessThan(String value) {
            addCriterion("bar <", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLessThanOrEqualTo(String value) {
            addCriterion("bar <=", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarLike(String value) {
            addCriterion("bar like", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotLike(String value) {
            addCriterion("bar not like", value, "bar");
            return (Criteria) this;
        }

        public Criteria andBarIn(List<String> values) {
            addCriterion("bar in", values, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotIn(List<String> values) {
            addCriterion("bar not in", values, "bar");
            return (Criteria) this;
        }

        public Criteria andBarBetween(String value1, String value2) {
            addCriterion("bar between", value1, value2, "bar");
            return (Criteria) this;
        }

        public Criteria andBarNotBetween(String value1, String value2) {
            addCriterion("bar not between", value1, value2, "bar");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNull() {
            addCriterion("manufacture is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNotNull() {
            addCriterion("manufacture is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureEqualTo(String value) {
            addCriterion("manufacture =", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotEqualTo(String value) {
            addCriterion("manufacture <>", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThan(String value) {
            addCriterion("manufacture >", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture >=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThan(String value) {
            addCriterion("manufacture <", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThanOrEqualTo(String value) {
            addCriterion("manufacture <=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLike(String value) {
            addCriterion("manufacture like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotLike(String value) {
            addCriterion("manufacture not like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureIn(List<String> values) {
            addCriterion("manufacture in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotIn(List<String> values) {
            addCriterion("manufacture not in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureBetween(String value1, String value2) {
            addCriterion("manufacture between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotBetween(String value1, String value2) {
            addCriterion("manufacture not between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIsNull() {
            addCriterion("manufacture_code is null");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIsNotNull() {
            addCriterion("manufacture_code is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeEqualTo(Integer value) {
            addCriterion("manufacture_code =", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotEqualTo(Integer value) {
            addCriterion("manufacture_code <>", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeGreaterThan(Integer value) {
            addCriterion("manufacture_code >", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacture_code >=", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeLessThan(Integer value) {
            addCriterion("manufacture_code <", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeLessThanOrEqualTo(Integer value) {
            addCriterion("manufacture_code <=", value, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeIn(List<Integer> values) {
            addCriterion("manufacture_code in", values, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotIn(List<Integer> values) {
            addCriterion("manufacture_code not in", values, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeBetween(Integer value1, Integer value2) {
            addCriterion("manufacture_code between", value1, value2, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andManufactureCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacture_code not between", value1, value2, "manufactureCode");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNull() {
            addCriterion("update_type is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNotNull() {
            addCriterion("update_type is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeEqualTo(Integer value) {
            addCriterion("update_type =", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotEqualTo(Integer value) {
            addCriterion("update_type <>", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThan(Integer value) {
            addCriterion("update_type >", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_type >=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThan(Integer value) {
            addCriterion("update_type <", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("update_type <=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIn(List<Integer> values) {
            addCriterion("update_type in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotIn(List<Integer> values) {
            addCriterion("update_type not in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeBetween(Integer value1, Integer value2) {
            addCriterion("update_type between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_type not between", value1, value2, "updateType");
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