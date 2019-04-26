package cn.park.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PilLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PilLogExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNull() {
            addCriterion("terminal_name is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNotNull() {
            addCriterion("terminal_name is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameEqualTo(String value) {
            addCriterion("terminal_name =", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotEqualTo(String value) {
            addCriterion("terminal_name <>", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThan(String value) {
            addCriterion("terminal_name >", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_name >=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThan(String value) {
            addCriterion("terminal_name <", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThanOrEqualTo(String value) {
            addCriterion("terminal_name <=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLike(String value) {
            addCriterion("terminal_name like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotLike(String value) {
            addCriterion("terminal_name not like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIn(List<String> values) {
            addCriterion("terminal_name in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotIn(List<String> values) {
            addCriterion("terminal_name not in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameBetween(String value1, String value2) {
            addCriterion("terminal_name between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotBetween(String value1, String value2) {
            addCriterion("terminal_name not between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIsNull() {
            addCriterion("terminal_ip is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIsNotNull() {
            addCriterion("terminal_ip is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIpEqualTo(String value) {
            addCriterion("terminal_ip =", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotEqualTo(String value) {
            addCriterion("terminal_ip <>", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpGreaterThan(String value) {
            addCriterion("terminal_ip >", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_ip >=", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLessThan(String value) {
            addCriterion("terminal_ip <", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLessThanOrEqualTo(String value) {
            addCriterion("terminal_ip <=", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLike(String value) {
            addCriterion("terminal_ip like", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotLike(String value) {
            addCriterion("terminal_ip not like", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIn(List<String> values) {
            addCriterion("terminal_ip in", values, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotIn(List<String> values) {
            addCriterion("terminal_ip not in", values, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpBetween(String value1, String value2) {
            addCriterion("terminal_ip between", value1, value2, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotBetween(String value1, String value2) {
            addCriterion("terminal_ip not between", value1, value2, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
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