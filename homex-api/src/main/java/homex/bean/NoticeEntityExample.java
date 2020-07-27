package homex.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeEntityExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(String value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(String value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(String value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(String value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLike(String value) {
            addCriterion("notice_id like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotLike(String value) {
            addCriterion("notice_id not like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<String> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<String> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(String value1, String value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(String value1, String value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("author_id like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("author_id not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
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

        public Criteria andToTowerIsNull() {
            addCriterion("to_tower is null");
            return (Criteria) this;
        }

        public Criteria andToTowerIsNotNull() {
            addCriterion("to_tower is not null");
            return (Criteria) this;
        }

        public Criteria andToTowerEqualTo(String value) {
            addCriterion("to_tower =", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerNotEqualTo(String value) {
            addCriterion("to_tower <>", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerGreaterThan(String value) {
            addCriterion("to_tower >", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerGreaterThanOrEqualTo(String value) {
            addCriterion("to_tower >=", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerLessThan(String value) {
            addCriterion("to_tower <", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerLessThanOrEqualTo(String value) {
            addCriterion("to_tower <=", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerLike(String value) {
            addCriterion("to_tower like", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerNotLike(String value) {
            addCriterion("to_tower not like", value, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerIn(List<String> values) {
            addCriterion("to_tower in", values, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerNotIn(List<String> values) {
            addCriterion("to_tower not in", values, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerBetween(String value1, String value2) {
            addCriterion("to_tower between", value1, value2, "toTower");
            return (Criteria) this;
        }

        public Criteria andToTowerNotBetween(String value1, String value2) {
            addCriterion("to_tower not between", value1, value2, "toTower");
            return (Criteria) this;
        }

        public Criteria andUnitMaxIsNull() {
            addCriterion("unit_max is null");
            return (Criteria) this;
        }

        public Criteria andUnitMaxIsNotNull() {
            addCriterion("unit_max is not null");
            return (Criteria) this;
        }

        public Criteria andUnitMaxEqualTo(String value) {
            addCriterion("unit_max =", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxNotEqualTo(String value) {
            addCriterion("unit_max <>", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxGreaterThan(String value) {
            addCriterion("unit_max >", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxGreaterThanOrEqualTo(String value) {
            addCriterion("unit_max >=", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxLessThan(String value) {
            addCriterion("unit_max <", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxLessThanOrEqualTo(String value) {
            addCriterion("unit_max <=", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxLike(String value) {
            addCriterion("unit_max like", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxNotLike(String value) {
            addCriterion("unit_max not like", value, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxIn(List<String> values) {
            addCriterion("unit_max in", values, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxNotIn(List<String> values) {
            addCriterion("unit_max not in", values, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxBetween(String value1, String value2) {
            addCriterion("unit_max between", value1, value2, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMaxNotBetween(String value1, String value2) {
            addCriterion("unit_max not between", value1, value2, "unitMax");
            return (Criteria) this;
        }

        public Criteria andUnitMinIsNull() {
            addCriterion("unit_min is null");
            return (Criteria) this;
        }

        public Criteria andUnitMinIsNotNull() {
            addCriterion("unit_min is not null");
            return (Criteria) this;
        }

        public Criteria andUnitMinEqualTo(String value) {
            addCriterion("unit_min =", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotEqualTo(String value) {
            addCriterion("unit_min <>", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinGreaterThan(String value) {
            addCriterion("unit_min >", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinGreaterThanOrEqualTo(String value) {
            addCriterion("unit_min >=", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinLessThan(String value) {
            addCriterion("unit_min <", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinLessThanOrEqualTo(String value) {
            addCriterion("unit_min <=", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinLike(String value) {
            addCriterion("unit_min like", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotLike(String value) {
            addCriterion("unit_min not like", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinIn(List<String> values) {
            addCriterion("unit_min in", values, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotIn(List<String> values) {
            addCriterion("unit_min not in", values, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinBetween(String value1, String value2) {
            addCriterion("unit_min between", value1, value2, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotBetween(String value1, String value2) {
            addCriterion("unit_min not between", value1, value2, "unitMin");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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