package cn.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PilAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PilAccountsExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSicidIsNull() {
            addCriterion("sicid is null");
            return (Criteria) this;
        }

        public Criteria andSicidIsNotNull() {
            addCriterion("sicid is not null");
            return (Criteria) this;
        }

        public Criteria andSicidEqualTo(Integer value) {
            addCriterion("sicid =", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidNotEqualTo(Integer value) {
            addCriterion("sicid <>", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidGreaterThan(Integer value) {
            addCriterion("sicid >", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sicid >=", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidLessThan(Integer value) {
            addCriterion("sicid <", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidLessThanOrEqualTo(Integer value) {
            addCriterion("sicid <=", value, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidIn(List<Integer> values) {
            addCriterion("sicid in", values, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidNotIn(List<Integer> values) {
            addCriterion("sicid not in", values, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidBetween(Integer value1, Integer value2) {
            addCriterion("sicid between", value1, value2, "sicid");
            return (Criteria) this;
        }

        public Criteria andSicidNotBetween(Integer value1, Integer value2) {
            addCriterion("sicid not between", value1, value2, "sicid");
            return (Criteria) this;
        }

        public Criteria andTopilIsNull() {
            addCriterion("topil is null");
            return (Criteria) this;
        }

        public Criteria andTopilIsNotNull() {
            addCriterion("topil is not null");
            return (Criteria) this;
        }

        public Criteria andTopilEqualTo(Double value) {
            addCriterion("topil =", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilNotEqualTo(Double value) {
            addCriterion("topil <>", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilGreaterThan(Double value) {
            addCriterion("topil >", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilGreaterThanOrEqualTo(Double value) {
            addCriterion("topil >=", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilLessThan(Double value) {
            addCriterion("topil <", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilLessThanOrEqualTo(Double value) {
            addCriterion("topil <=", value, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilIn(List<Double> values) {
            addCriterion("topil in", values, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilNotIn(List<Double> values) {
            addCriterion("topil not in", values, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilBetween(Double value1, Double value2) {
            addCriterion("topil between", value1, value2, "topil");
            return (Criteria) this;
        }

        public Criteria andTopilNotBetween(Double value1, Double value2) {
            addCriterion("topil not between", value1, value2, "topil");
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