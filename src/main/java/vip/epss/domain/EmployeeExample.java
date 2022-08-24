package vip.epss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEpassIsNull() {
            addCriterion("epass is null");
            return (Criteria) this;
        }

        public Criteria andEpassIsNotNull() {
            addCriterion("epass is not null");
            return (Criteria) this;
        }

        public Criteria andEpassEqualTo(String value) {
            addCriterion("epass =", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassNotEqualTo(String value) {
            addCriterion("epass <>", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassGreaterThan(String value) {
            addCriterion("epass >", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassGreaterThanOrEqualTo(String value) {
            addCriterion("epass >=", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassLessThan(String value) {
            addCriterion("epass <", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassLessThanOrEqualTo(String value) {
            addCriterion("epass <=", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassLike(String value) {
            addCriterion("epass like", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassNotLike(String value) {
            addCriterion("epass not like", value, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassIn(List<String> values) {
            addCriterion("epass in", values, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassNotIn(List<String> values) {
            addCriterion("epass not in", values, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassBetween(String value1, String value2) {
            addCriterion("epass between", value1, value2, "epass");
            return (Criteria) this;
        }

        public Criteria andEpassNotBetween(String value1, String value2) {
            addCriterion("epass not between", value1, value2, "epass");
            return (Criteria) this;
        }

        public Criteria andEdidIsNull() {
            addCriterion("edid is null");
            return (Criteria) this;
        }

        public Criteria andEdidIsNotNull() {
            addCriterion("edid is not null");
            return (Criteria) this;
        }

        public Criteria andEdidEqualTo(Integer value) {
            addCriterion("edid =", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidNotEqualTo(Integer value) {
            addCriterion("edid <>", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidGreaterThan(Integer value) {
            addCriterion("edid >", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("edid >=", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidLessThan(Integer value) {
            addCriterion("edid <", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidLessThanOrEqualTo(Integer value) {
            addCriterion("edid <=", value, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidIn(List<Integer> values) {
            addCriterion("edid in", values, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidNotIn(List<Integer> values) {
            addCriterion("edid not in", values, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidBetween(Integer value1, Integer value2) {
            addCriterion("edid between", value1, value2, "edid");
            return (Criteria) this;
        }

        public Criteria andEdidNotBetween(Integer value1, Integer value2) {
            addCriterion("edid not between", value1, value2, "edid");
            return (Criteria) this;
        }

        public Criteria andEuptimeIsNull() {
            addCriterion("euptime is null");
            return (Criteria) this;
        }

        public Criteria andEuptimeIsNotNull() {
            addCriterion("euptime is not null");
            return (Criteria) this;
        }

        public Criteria andEuptimeEqualTo(Date value) {
            addCriterion("euptime =", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeNotEqualTo(Date value) {
            addCriterion("euptime <>", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeGreaterThan(Date value) {
            addCriterion("euptime >", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("euptime >=", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeLessThan(Date value) {
            addCriterion("euptime <", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeLessThanOrEqualTo(Date value) {
            addCriterion("euptime <=", value, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeIn(List<Date> values) {
            addCriterion("euptime in", values, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeNotIn(List<Date> values) {
            addCriterion("euptime not in", values, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeBetween(Date value1, Date value2) {
            addCriterion("euptime between", value1, value2, "euptime");
            return (Criteria) this;
        }

        public Criteria andEuptimeNotBetween(Date value1, Date value2) {
            addCriterion("euptime not between", value1, value2, "euptime");
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