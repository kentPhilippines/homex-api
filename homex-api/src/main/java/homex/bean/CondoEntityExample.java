package homex.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CondoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CondoEntityExample() {
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

        public Criteria andCondoIdIsNull() {
            addCriterion("condo_id is null");
            return (Criteria) this;
        }

        public Criteria andCondoIdIsNotNull() {
            addCriterion("condo_id is not null");
            return (Criteria) this;
        }

        public Criteria andCondoIdEqualTo(String value) {
            addCriterion("condo_id =", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdNotEqualTo(String value) {
            addCriterion("condo_id <>", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdGreaterThan(String value) {
            addCriterion("condo_id >", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdGreaterThanOrEqualTo(String value) {
            addCriterion("condo_id >=", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdLessThan(String value) {
            addCriterion("condo_id <", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdLessThanOrEqualTo(String value) {
            addCriterion("condo_id <=", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdLike(String value) {
            addCriterion("condo_id like", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdNotLike(String value) {
            addCriterion("condo_id not like", value, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdIn(List<String> values) {
            addCriterion("condo_id in", values, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdNotIn(List<String> values) {
            addCriterion("condo_id not in", values, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdBetween(String value1, String value2) {
            addCriterion("condo_id between", value1, value2, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoIdNotBetween(String value1, String value2) {
            addCriterion("condo_id not between", value1, value2, "condoId");
            return (Criteria) this;
        }

        public Criteria andCondoNameIsNull() {
            addCriterion("condo_name is null");
            return (Criteria) this;
        }

        public Criteria andCondoNameIsNotNull() {
            addCriterion("condo_name is not null");
            return (Criteria) this;
        }

        public Criteria andCondoNameEqualTo(String value) {
            addCriterion("condo_name =", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameNotEqualTo(String value) {
            addCriterion("condo_name <>", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameGreaterThan(String value) {
            addCriterion("condo_name >", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameGreaterThanOrEqualTo(String value) {
            addCriterion("condo_name >=", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameLessThan(String value) {
            addCriterion("condo_name <", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameLessThanOrEqualTo(String value) {
            addCriterion("condo_name <=", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameLike(String value) {
            addCriterion("condo_name like", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameNotLike(String value) {
            addCriterion("condo_name not like", value, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameIn(List<String> values) {
            addCriterion("condo_name in", values, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameNotIn(List<String> values) {
            addCriterion("condo_name not in", values, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameBetween(String value1, String value2) {
            addCriterion("condo_name between", value1, value2, "condoName");
            return (Criteria) this;
        }

        public Criteria andCondoNameNotBetween(String value1, String value2) {
            addCriterion("condo_name not between", value1, value2, "condoName");
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

        public Criteria andUpdataTimeIsNull() {
            addCriterion("updata_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIsNotNull() {
            addCriterion("updata_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeEqualTo(Date value) {
            addCriterion("updata_time =", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotEqualTo(Date value) {
            addCriterion("updata_time <>", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThan(Date value) {
            addCriterion("updata_time >", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updata_time >=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThan(Date value) {
            addCriterion("updata_time <", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("updata_time <=", value, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeIn(List<Date> values) {
            addCriterion("updata_time in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotIn(List<Date> values) {
            addCriterion("updata_time not in", values, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("updata_time between", value1, value2, "updataTime");
            return (Criteria) this;
        }

        public Criteria andUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("updata_time not between", value1, value2, "updataTime");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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