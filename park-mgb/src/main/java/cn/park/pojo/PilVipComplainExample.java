package cn.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PilVipComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PilVipComplainExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(String value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(String value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(String value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(String value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(String value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(String value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLike(String value) {
            addCriterion("vid like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotLike(String value) {
            addCriterion("vid not like", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<String> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<String> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(String value1, String value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(String value1, String value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNull() {
            addCriterion("complain_time is null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNotNull() {
            addCriterion("complain_time is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeEqualTo(Date value) {
            addCriterion("complain_time =", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotEqualTo(Date value) {
            addCriterion("complain_time <>", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThan(Date value) {
            addCriterion("complain_time >", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complain_time >=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThan(Date value) {
            addCriterion("complain_time <", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThanOrEqualTo(Date value) {
            addCriterion("complain_time <=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIn(List<Date> values) {
            addCriterion("complain_time in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotIn(List<Date> values) {
            addCriterion("complain_time not in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeBetween(Date value1, Date value2) {
            addCriterion("complain_time between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotBetween(Date value1, Date value2) {
            addCriterion("complain_time not between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAdviceIsNull() {
            addCriterion("advice is null");
            return (Criteria) this;
        }

        public Criteria andAdviceIsNotNull() {
            addCriterion("advice is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceEqualTo(String value) {
            addCriterion("advice =", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotEqualTo(String value) {
            addCriterion("advice <>", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceGreaterThan(String value) {
            addCriterion("advice >", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("advice >=", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLessThan(String value) {
            addCriterion("advice <", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLessThanOrEqualTo(String value) {
            addCriterion("advice <=", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLike(String value) {
            addCriterion("advice like", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotLike(String value) {
            addCriterion("advice not like", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceIn(List<String> values) {
            addCriterion("advice in", values, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotIn(List<String> values) {
            addCriterion("advice not in", values, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceBetween(String value1, String value2) {
            addCriterion("advice between", value1, value2, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotBetween(String value1, String value2) {
            addCriterion("advice not between", value1, value2, "advice");
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