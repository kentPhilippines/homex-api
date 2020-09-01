package homex.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoveInEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoveInEntityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCondoIsNull() {
            addCriterion("condo is null");
            return (Criteria) this;
        }

        public Criteria andCondoIsNotNull() {
            addCriterion("condo is not null");
            return (Criteria) this;
        }

        public Criteria andCondoEqualTo(String value) {
            addCriterion("condo =", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoNotEqualTo(String value) {
            addCriterion("condo <>", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoGreaterThan(String value) {
            addCriterion("condo >", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoGreaterThanOrEqualTo(String value) {
            addCriterion("condo >=", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoLessThan(String value) {
            addCriterion("condo <", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoLessThanOrEqualTo(String value) {
            addCriterion("condo <=", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoLike(String value) {
            addCriterion("condo like", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoNotLike(String value) {
            addCriterion("condo not like", value, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoIn(List<String> values) {
            addCriterion("condo in", values, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoNotIn(List<String> values) {
            addCriterion("condo not in", values, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoBetween(String value1, String value2) {
            addCriterion("condo between", value1, value2, "condo");
            return (Criteria) this;
        }

        public Criteria andCondoNotBetween(String value1, String value2) {
            addCriterion("condo not between", value1, value2, "condo");
            return (Criteria) this;
        }

        public Criteria andTowerIsNull() {
            addCriterion("tower is null");
            return (Criteria) this;
        }

        public Criteria andTowerIsNotNull() {
            addCriterion("tower is not null");
            return (Criteria) this;
        }

        public Criteria andTowerEqualTo(String value) {
            addCriterion("tower =", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerNotEqualTo(String value) {
            addCriterion("tower <>", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerGreaterThan(String value) {
            addCriterion("tower >", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerGreaterThanOrEqualTo(String value) {
            addCriterion("tower >=", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerLessThan(String value) {
            addCriterion("tower <", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerLessThanOrEqualTo(String value) {
            addCriterion("tower <=", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerLike(String value) {
            addCriterion("tower like", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerNotLike(String value) {
            addCriterion("tower not like", value, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerIn(List<String> values) {
            addCriterion("tower in", values, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerNotIn(List<String> values) {
            addCriterion("tower not in", values, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerBetween(String value1, String value2) {
            addCriterion("tower between", value1, value2, "tower");
            return (Criteria) this;
        }

        public Criteria andTowerNotBetween(String value1, String value2) {
            addCriterion("tower not between", value1, value2, "tower");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMoveInIsNull() {
            addCriterion("move_in is null");
            return (Criteria) this;
        }

        public Criteria andMoveInIsNotNull() {
            addCriterion("move_in is not null");
            return (Criteria) this;
        }

        public Criteria andMoveInEqualTo(String value) {
            addCriterion("move_in =", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotEqualTo(String value) {
            addCriterion("move_in <>", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInGreaterThan(String value) {
            addCriterion("move_in >", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInGreaterThanOrEqualTo(String value) {
            addCriterion("move_in >=", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInLessThan(String value) {
            addCriterion("move_in <", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInLessThanOrEqualTo(String value) {
            addCriterion("move_in <=", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInLike(String value) {
            addCriterion("move_in like", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotLike(String value) {
            addCriterion("move_in not like", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInIn(List<String> values) {
            addCriterion("move_in in", values, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotIn(List<String> values) {
            addCriterion("move_in not in", values, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInBetween(String value1, String value2) {
            addCriterion("move_in between", value1, value2, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotBetween(String value1, String value2) {
            addCriterion("move_in not between", value1, value2, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveOutIsNull() {
            addCriterion("move_out is null");
            return (Criteria) this;
        }

        public Criteria andMoveOutIsNotNull() {
            addCriterion("move_out is not null");
            return (Criteria) this;
        }

        public Criteria andMoveOutEqualTo(String value) {
            addCriterion("move_out =", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotEqualTo(String value) {
            addCriterion("move_out <>", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutGreaterThan(String value) {
            addCriterion("move_out >", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutGreaterThanOrEqualTo(String value) {
            addCriterion("move_out >=", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutLessThan(String value) {
            addCriterion("move_out <", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutLessThanOrEqualTo(String value) {
            addCriterion("move_out <=", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutLike(String value) {
            addCriterion("move_out like", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotLike(String value) {
            addCriterion("move_out not like", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutIn(List<String> values) {
            addCriterion("move_out in", values, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotIn(List<String> values) {
            addCriterion("move_out not in", values, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutBetween(String value1, String value2) {
            addCriterion("move_out between", value1, value2, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotBetween(String value1, String value2) {
            addCriterion("move_out not between", value1, value2, "moveOut");
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

        public Criteria andBrokerIsNull() {
            addCriterion("broker is null");
            return (Criteria) this;
        }

        public Criteria andBrokerIsNotNull() {
            addCriterion("broker is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerEqualTo(String value) {
            addCriterion("broker =", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotEqualTo(String value) {
            addCriterion("broker <>", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerGreaterThan(String value) {
            addCriterion("broker >", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("broker >=", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLessThan(String value) {
            addCriterion("broker <", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLessThanOrEqualTo(String value) {
            addCriterion("broker <=", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerLike(String value) {
            addCriterion("broker like", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotLike(String value) {
            addCriterion("broker not like", value, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerIn(List<String> values) {
            addCriterion("broker in", values, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotIn(List<String> values) {
            addCriterion("broker not in", values, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerBetween(String value1, String value2) {
            addCriterion("broker between", value1, value2, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerNotBetween(String value1, String value2) {
            addCriterion("broker not between", value1, value2, "broker");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneIsNull() {
            addCriterion("broker_phone is null");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneIsNotNull() {
            addCriterion("broker_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneEqualTo(String value) {
            addCriterion("broker_phone =", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneNotEqualTo(String value) {
            addCriterion("broker_phone <>", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneGreaterThan(String value) {
            addCriterion("broker_phone >", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("broker_phone >=", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneLessThan(String value) {
            addCriterion("broker_phone <", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneLessThanOrEqualTo(String value) {
            addCriterion("broker_phone <=", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneLike(String value) {
            addCriterion("broker_phone like", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneNotLike(String value) {
            addCriterion("broker_phone not like", value, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneIn(List<String> values) {
            addCriterion("broker_phone in", values, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneNotIn(List<String> values) {
            addCriterion("broker_phone not in", values, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneBetween(String value1, String value2) {
            addCriterion("broker_phone between", value1, value2, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andBrokerPhoneNotBetween(String value1, String value2) {
            addCriterion("broker_phone not between", value1, value2, "brokerPhone");
            return (Criteria) this;
        }

        public Criteria andPhotoListIsNull() {
            addCriterion("photo_list is null");
            return (Criteria) this;
        }

        public Criteria andPhotoListIsNotNull() {
            addCriterion("photo_list is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoListEqualTo(String value) {
            addCriterion("photo_list =", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotEqualTo(String value) {
            addCriterion("photo_list <>", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListGreaterThan(String value) {
            addCriterion("photo_list >", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListGreaterThanOrEqualTo(String value) {
            addCriterion("photo_list >=", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLessThan(String value) {
            addCriterion("photo_list <", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLessThanOrEqualTo(String value) {
            addCriterion("photo_list <=", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListLike(String value) {
            addCriterion("photo_list like", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotLike(String value) {
            addCriterion("photo_list not like", value, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListIn(List<String> values) {
            addCriterion("photo_list in", values, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotIn(List<String> values) {
            addCriterion("photo_list not in", values, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListBetween(String value1, String value2) {
            addCriterion("photo_list between", value1, value2, "photoList");
            return (Criteria) this;
        }

        public Criteria andPhotoListNotBetween(String value1, String value2) {
            addCriterion("photo_list not between", value1, value2, "photoList");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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