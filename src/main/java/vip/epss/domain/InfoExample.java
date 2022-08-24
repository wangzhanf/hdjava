package vip.epss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNull() {
            addCriterion("iphone is null");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNotNull() {
            addCriterion("iphone is not null");
            return (Criteria) this;
        }

        public Criteria andIphoneEqualTo(String value) {
            addCriterion("iphone =", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotEqualTo(String value) {
            addCriterion("iphone <>", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThan(String value) {
            addCriterion("iphone >", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("iphone >=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThan(String value) {
            addCriterion("iphone <", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThanOrEqualTo(String value) {
            addCriterion("iphone <=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLike(String value) {
            addCriterion("iphone like", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotLike(String value) {
            addCriterion("iphone not like", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneIn(List<String> values) {
            addCriterion("iphone in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotIn(List<String> values) {
            addCriterion("iphone not in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneBetween(String value1, String value2) {
            addCriterion("iphone between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotBetween(String value1, String value2) {
            addCriterion("iphone not between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andIeidIsNull() {
            addCriterion("ieid is null");
            return (Criteria) this;
        }

        public Criteria andIeidIsNotNull() {
            addCriterion("ieid is not null");
            return (Criteria) this;
        }

        public Criteria andIeidEqualTo(Integer value) {
            addCriterion("ieid =", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidNotEqualTo(Integer value) {
            addCriterion("ieid <>", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidGreaterThan(Integer value) {
            addCriterion("ieid >", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ieid >=", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidLessThan(Integer value) {
            addCriterion("ieid <", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidLessThanOrEqualTo(Integer value) {
            addCriterion("ieid <=", value, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidIn(List<Integer> values) {
            addCriterion("ieid in", values, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidNotIn(List<Integer> values) {
            addCriterion("ieid not in", values, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidBetween(Integer value1, Integer value2) {
            addCriterion("ieid between", value1, value2, "ieid");
            return (Criteria) this;
        }

        public Criteria andIeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ieid not between", value1, value2, "ieid");
            return (Criteria) this;
        }

        public Criteria andIuptimeIsNull() {
            addCriterion("iuptime is null");
            return (Criteria) this;
        }

        public Criteria andIuptimeIsNotNull() {
            addCriterion("iuptime is not null");
            return (Criteria) this;
        }

        public Criteria andIuptimeEqualTo(Date value) {
            addCriterion("iuptime =", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeNotEqualTo(Date value) {
            addCriterion("iuptime <>", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeGreaterThan(Date value) {
            addCriterion("iuptime >", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("iuptime >=", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeLessThan(Date value) {
            addCriterion("iuptime <", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeLessThanOrEqualTo(Date value) {
            addCriterion("iuptime <=", value, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeIn(List<Date> values) {
            addCriterion("iuptime in", values, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeNotIn(List<Date> values) {
            addCriterion("iuptime not in", values, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeBetween(Date value1, Date value2) {
            addCriterion("iuptime between", value1, value2, "iuptime");
            return (Criteria) this;
        }

        public Criteria andIuptimeNotBetween(Date value1, Date value2) {
            addCriterion("iuptime not between", value1, value2, "iuptime");
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