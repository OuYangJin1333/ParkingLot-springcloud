package cn.park.pojo;

import java.util.ArrayList;
import java.util.List;

public class PilInfoSmallchargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PilInfoSmallchargeExample() {
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

        public Criteria andHalfhourIsNull() {
            addCriterion("halfhour is null");
            return (Criteria) this;
        }

        public Criteria andHalfhourIsNotNull() {
            addCriterion("halfhour is not null");
            return (Criteria) this;
        }

        public Criteria andHalfhourEqualTo(Double value) {
            addCriterion("halfhour =", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourNotEqualTo(Double value) {
            addCriterion("halfhour <>", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourGreaterThan(Double value) {
            addCriterion("halfhour >", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourGreaterThanOrEqualTo(Double value) {
            addCriterion("halfhour >=", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourLessThan(Double value) {
            addCriterion("halfhour <", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourLessThanOrEqualTo(Double value) {
            addCriterion("halfhour <=", value, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourIn(List<Double> values) {
            addCriterion("halfhour in", values, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourNotIn(List<Double> values) {
            addCriterion("halfhour not in", values, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourBetween(Double value1, Double value2) {
            addCriterion("halfhour between", value1, value2, "halfhour");
            return (Criteria) this;
        }

        public Criteria andHalfhourNotBetween(Double value1, Double value2) {
            addCriterion("halfhour not between", value1, value2, "halfhour");
            return (Criteria) this;
        }

        public Criteria andAhourIsNull() {
            addCriterion("ahour is null");
            return (Criteria) this;
        }

        public Criteria andAhourIsNotNull() {
            addCriterion("ahour is not null");
            return (Criteria) this;
        }

        public Criteria andAhourEqualTo(Double value) {
            addCriterion("ahour =", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourNotEqualTo(Double value) {
            addCriterion("ahour <>", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourGreaterThan(Double value) {
            addCriterion("ahour >", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourGreaterThanOrEqualTo(Double value) {
            addCriterion("ahour >=", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourLessThan(Double value) {
            addCriterion("ahour <", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourLessThanOrEqualTo(Double value) {
            addCriterion("ahour <=", value, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourIn(List<Double> values) {
            addCriterion("ahour in", values, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourNotIn(List<Double> values) {
            addCriterion("ahour not in", values, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourBetween(Double value1, Double value2) {
            addCriterion("ahour between", value1, value2, "ahour");
            return (Criteria) this;
        }

        public Criteria andAhourNotBetween(Double value1, Double value2) {
            addCriterion("ahour not between", value1, value2, "ahour");
            return (Criteria) this;
        }

        public Criteria andMoreoneIsNull() {
            addCriterion("moreone is null");
            return (Criteria) this;
        }

        public Criteria andMoreoneIsNotNull() {
            addCriterion("moreone is not null");
            return (Criteria) this;
        }

        public Criteria andMoreoneEqualTo(Double value) {
            addCriterion("moreone =", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneNotEqualTo(Double value) {
            addCriterion("moreone <>", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneGreaterThan(Double value) {
            addCriterion("moreone >", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneGreaterThanOrEqualTo(Double value) {
            addCriterion("moreone >=", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneLessThan(Double value) {
            addCriterion("moreone <", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneLessThanOrEqualTo(Double value) {
            addCriterion("moreone <=", value, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneIn(List<Double> values) {
            addCriterion("moreone in", values, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneNotIn(List<Double> values) {
            addCriterion("moreone not in", values, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneBetween(Double value1, Double value2) {
            addCriterion("moreone between", value1, value2, "moreone");
            return (Criteria) this;
        }

        public Criteria andMoreoneNotBetween(Double value1, Double value2) {
            addCriterion("moreone not between", value1, value2, "moreone");
            return (Criteria) this;
        }

        public Criteria andMaxIsNull() {
            addCriterion("max is null");
            return (Criteria) this;
        }

        public Criteria andMaxIsNotNull() {
            addCriterion("max is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEqualTo(Double value) {
            addCriterion("max =", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotEqualTo(Double value) {
            addCriterion("max <>", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThan(Double value) {
            addCriterion("max >", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("max >=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThan(Double value) {
            addCriterion("max <", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThanOrEqualTo(Double value) {
            addCriterion("max <=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxIn(List<Double> values) {
            addCriterion("max in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotIn(List<Double> values) {
            addCriterion("max not in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxBetween(Double value1, Double value2) {
            addCriterion("max between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotBetween(Double value1, Double value2) {
            addCriterion("max not between", value1, value2, "max");
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