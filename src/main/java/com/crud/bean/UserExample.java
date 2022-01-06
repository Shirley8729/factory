package com.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeIsNull() {
            addCriterion("Person_Incharge is null");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeIsNotNull() {
            addCriterion("Person_Incharge is not null");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeEqualTo(String value) {
            addCriterion("Person_Incharge =", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeNotEqualTo(String value) {
            addCriterion("Person_Incharge <>", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeGreaterThan(String value) {
            addCriterion("Person_Incharge >", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Incharge >=", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeLessThan(String value) {
            addCriterion("Person_Incharge <", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeLessThanOrEqualTo(String value) {
            addCriterion("Person_Incharge <=", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeLike(String value) {
            addCriterion("Person_Incharge like", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeNotLike(String value) {
            addCriterion("Person_Incharge not like", value, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeIn(List<String> values) {
            addCriterion("Person_Incharge in", values, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeNotIn(List<String> values) {
            addCriterion("Person_Incharge not in", values, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeBetween(String value1, String value2) {
            addCriterion("Person_Incharge between", value1, value2, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andPersonInchargeNotBetween(String value1, String value2) {
            addCriterion("Person_Incharge not between", value1, value2, "personIncharge");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNull() {
            addCriterion("Email_Address is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNotNull() {
            addCriterion("Email_Address is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressEqualTo(String value) {
            addCriterion("Email_Address =", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotEqualTo(String value) {
            addCriterion("Email_Address <>", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThan(String value) {
            addCriterion("Email_Address >", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Email_Address >=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThan(String value) {
            addCriterion("Email_Address <", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("Email_Address <=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLike(String value) {
            addCriterion("Email_Address like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotLike(String value) {
            addCriterion("Email_Address not like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIn(List<String> values) {
            addCriterion("Email_Address in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotIn(List<String> values) {
            addCriterion("Email_Address not in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressBetween(String value1, String value2) {
            addCriterion("Email_Address between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotBetween(String value1, String value2) {
            addCriterion("Email_Address not between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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