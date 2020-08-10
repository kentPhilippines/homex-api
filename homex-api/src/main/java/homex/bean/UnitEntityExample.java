package homex.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitEntityExample() {
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

        public Criteria andTowerIdIsNull() {
            addCriterion("tower_id is null");
            return (Criteria) this;
        }

        public Criteria andTowerIdIsNotNull() {
            addCriterion("tower_id is not null");
            return (Criteria) this;
        }

        public Criteria andTowerIdEqualTo(String value) {
            addCriterion("tower_id =", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotEqualTo(String value) {
            addCriterion("tower_id <>", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThan(String value) {
            addCriterion("tower_id >", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("tower_id >=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThan(String value) {
            addCriterion("tower_id <", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThanOrEqualTo(String value) {
            addCriterion("tower_id <=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLike(String value) {
            addCriterion("tower_id like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotLike(String value) {
            addCriterion("tower_id not like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdIn(List<String> values) {
            addCriterion("tower_id in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotIn(List<String> values) {
            addCriterion("tower_id not in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdBetween(String value1, String value2) {
            addCriterion("tower_id between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotBetween(String value1, String value2) {
            addCriterion("tower_id not between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParkingIsNull() {
            addCriterion("parking is null");
            return (Criteria) this;
        }

        public Criteria andParkingIsNotNull() {
            addCriterion("parking is not null");
            return (Criteria) this;
        }

        public Criteria andParkingEqualTo(String value) {
            addCriterion("parking =", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingNotEqualTo(String value) {
            addCriterion("parking <>", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingGreaterThan(String value) {
            addCriterion("parking >", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingGreaterThanOrEqualTo(String value) {
            addCriterion("parking >=", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingLessThan(String value) {
            addCriterion("parking <", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingLessThanOrEqualTo(String value) {
            addCriterion("parking <=", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingLike(String value) {
            addCriterion("parking like", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingNotLike(String value) {
            addCriterion("parking not like", value, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingIn(List<String> values) {
            addCriterion("parking in", values, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingNotIn(List<String> values) {
            addCriterion("parking not in", values, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingBetween(String value1, String value2) {
            addCriterion("parking between", value1, value2, "parking");
            return (Criteria) this;
        }

        public Criteria andParkingNotBetween(String value1, String value2) {
            addCriterion("parking not between", value1, value2, "parking");
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

        public Criteria andOwnerContactNoIsNull() {
            addCriterion("owner_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoIsNotNull() {
            addCriterion("owner_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoEqualTo(String value) {
            addCriterion("owner_contact_no =", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoNotEqualTo(String value) {
            addCriterion("owner_contact_no <>", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoGreaterThan(String value) {
            addCriterion("owner_contact_no >", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("owner_contact_no >=", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoLessThan(String value) {
            addCriterion("owner_contact_no <", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoLessThanOrEqualTo(String value) {
            addCriterion("owner_contact_no <=", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoLike(String value) {
            addCriterion("owner_contact_no like", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoNotLike(String value) {
            addCriterion("owner_contact_no not like", value, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoIn(List<String> values) {
            addCriterion("owner_contact_no in", values, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoNotIn(List<String> values) {
            addCriterion("owner_contact_no not in", values, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoBetween(String value1, String value2) {
            addCriterion("owner_contact_no between", value1, value2, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNoNotBetween(String value1, String value2) {
            addCriterion("owner_contact_no not between", value1, value2, "ownerContactNo");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardIsNull() {
            addCriterion("owner_id_card is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardIsNotNull() {
            addCriterion("owner_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardEqualTo(String value) {
            addCriterion("owner_id_card =", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardNotEqualTo(String value) {
            addCriterion("owner_id_card <>", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardGreaterThan(String value) {
            addCriterion("owner_id_card >", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("owner_id_card >=", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardLessThan(String value) {
            addCriterion("owner_id_card <", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardLessThanOrEqualTo(String value) {
            addCriterion("owner_id_card <=", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardLike(String value) {
            addCriterion("owner_id_card like", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardNotLike(String value) {
            addCriterion("owner_id_card not like", value, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardIn(List<String> values) {
            addCriterion("owner_id_card in", values, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardNotIn(List<String> values) {
            addCriterion("owner_id_card not in", values, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardBetween(String value1, String value2) {
            addCriterion("owner_id_card between", value1, value2, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerIdCardNotBetween(String value1, String value2) {
            addCriterion("owner_id_card not between", value1, value2, "ownerIdCard");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailIsNull() {
            addCriterion("owner_email is null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailIsNotNull() {
            addCriterion("owner_email is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailEqualTo(String value) {
            addCriterion("owner_email =", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailNotEqualTo(String value) {
            addCriterion("owner_email <>", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailGreaterThan(String value) {
            addCriterion("owner_email >", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("owner_email >=", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailLessThan(String value) {
            addCriterion("owner_email <", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailLessThanOrEqualTo(String value) {
            addCriterion("owner_email <=", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailLike(String value) {
            addCriterion("owner_email like", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailNotLike(String value) {
            addCriterion("owner_email not like", value, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailIn(List<String> values) {
            addCriterion("owner_email in", values, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailNotIn(List<String> values) {
            addCriterion("owner_email not in", values, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailBetween(String value1, String value2) {
            addCriterion("owner_email between", value1, value2, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andOwnerEmailNotBetween(String value1, String value2) {
            addCriterion("owner_email not between", value1, value2, "ownerEmail");
            return (Criteria) this;
        }

        public Criteria andSpaIsNull() {
            addCriterion("spa is null");
            return (Criteria) this;
        }

        public Criteria andSpaIsNotNull() {
            addCriterion("spa is not null");
            return (Criteria) this;
        }

        public Criteria andSpaEqualTo(String value) {
            addCriterion("spa =", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaNotEqualTo(String value) {
            addCriterion("spa <>", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaGreaterThan(String value) {
            addCriterion("spa >", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaGreaterThanOrEqualTo(String value) {
            addCriterion("spa >=", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaLessThan(String value) {
            addCriterion("spa <", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaLessThanOrEqualTo(String value) {
            addCriterion("spa <=", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaLike(String value) {
            addCriterion("spa like", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaNotLike(String value) {
            addCriterion("spa not like", value, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaIn(List<String> values) {
            addCriterion("spa in", values, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaNotIn(List<String> values) {
            addCriterion("spa not in", values, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaBetween(String value1, String value2) {
            addCriterion("spa between", value1, value2, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaNotBetween(String value1, String value2) {
            addCriterion("spa not between", value1, value2, "spa");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardIsNull() {
            addCriterion("spa_id_card is null");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardIsNotNull() {
            addCriterion("spa_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardEqualTo(String value) {
            addCriterion("spa_id_card =", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardNotEqualTo(String value) {
            addCriterion("spa_id_card <>", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardGreaterThan(String value) {
            addCriterion("spa_id_card >", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("spa_id_card >=", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardLessThan(String value) {
            addCriterion("spa_id_card <", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardLessThanOrEqualTo(String value) {
            addCriterion("spa_id_card <=", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardLike(String value) {
            addCriterion("spa_id_card like", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardNotLike(String value) {
            addCriterion("spa_id_card not like", value, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardIn(List<String> values) {
            addCriterion("spa_id_card in", values, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardNotIn(List<String> values) {
            addCriterion("spa_id_card not in", values, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardBetween(String value1, String value2) {
            addCriterion("spa_id_card between", value1, value2, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaIdCardNotBetween(String value1, String value2) {
            addCriterion("spa_id_card not between", value1, value2, "spaIdCard");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoIsNull() {
            addCriterion("spa_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoIsNotNull() {
            addCriterion("spa_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoEqualTo(String value) {
            addCriterion("spa_contact_no =", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoNotEqualTo(String value) {
            addCriterion("spa_contact_no <>", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoGreaterThan(String value) {
            addCriterion("spa_contact_no >", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("spa_contact_no >=", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoLessThan(String value) {
            addCriterion("spa_contact_no <", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoLessThanOrEqualTo(String value) {
            addCriterion("spa_contact_no <=", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoLike(String value) {
            addCriterion("spa_contact_no like", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoNotLike(String value) {
            addCriterion("spa_contact_no not like", value, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoIn(List<String> values) {
            addCriterion("spa_contact_no in", values, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoNotIn(List<String> values) {
            addCriterion("spa_contact_no not in", values, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoBetween(String value1, String value2) {
            addCriterion("spa_contact_no between", value1, value2, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaContactNoNotBetween(String value1, String value2) {
            addCriterion("spa_contact_no not between", value1, value2, "spaContactNo");
            return (Criteria) this;
        }

        public Criteria andSpaEmailIsNull() {
            addCriterion("spa_email is null");
            return (Criteria) this;
        }

        public Criteria andSpaEmailIsNotNull() {
            addCriterion("spa_email is not null");
            return (Criteria) this;
        }

        public Criteria andSpaEmailEqualTo(String value) {
            addCriterion("spa_email =", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailNotEqualTo(String value) {
            addCriterion("spa_email <>", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailGreaterThan(String value) {
            addCriterion("spa_email >", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailGreaterThanOrEqualTo(String value) {
            addCriterion("spa_email >=", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailLessThan(String value) {
            addCriterion("spa_email <", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailLessThanOrEqualTo(String value) {
            addCriterion("spa_email <=", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailLike(String value) {
            addCriterion("spa_email like", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailNotLike(String value) {
            addCriterion("spa_email not like", value, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailIn(List<String> values) {
            addCriterion("spa_email in", values, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailNotIn(List<String> values) {
            addCriterion("spa_email not in", values, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailBetween(String value1, String value2) {
            addCriterion("spa_email between", value1, value2, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andSpaEmailNotBetween(String value1, String value2) {
            addCriterion("spa_email not between", value1, value2, "spaEmail");
            return (Criteria) this;
        }

        public Criteria andTenantIsNull() {
            addCriterion("tenant is null");
            return (Criteria) this;
        }

        public Criteria andTenantIsNotNull() {
            addCriterion("tenant is not null");
            return (Criteria) this;
        }

        public Criteria andTenantEqualTo(String value) {
            addCriterion("tenant =", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotEqualTo(String value) {
            addCriterion("tenant <>", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThan(String value) {
            addCriterion("tenant >", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThanOrEqualTo(String value) {
            addCriterion("tenant >=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThan(String value) {
            addCriterion("tenant <", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThanOrEqualTo(String value) {
            addCriterion("tenant <=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLike(String value) {
            addCriterion("tenant like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotLike(String value) {
            addCriterion("tenant not like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantIn(List<String> values) {
            addCriterion("tenant in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotIn(List<String> values) {
            addCriterion("tenant not in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantBetween(String value1, String value2) {
            addCriterion("tenant between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotBetween(String value1, String value2) {
            addCriterion("tenant not between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardIsNull() {
            addCriterion("tenant_id_card is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardIsNotNull() {
            addCriterion("tenant_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardEqualTo(String value) {
            addCriterion("tenant_id_card =", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardNotEqualTo(String value) {
            addCriterion("tenant_id_card <>", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardGreaterThan(String value) {
            addCriterion("tenant_id_card >", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id_card >=", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardLessThan(String value) {
            addCriterion("tenant_id_card <", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardLessThanOrEqualTo(String value) {
            addCriterion("tenant_id_card <=", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardLike(String value) {
            addCriterion("tenant_id_card like", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardNotLike(String value) {
            addCriterion("tenant_id_card not like", value, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardIn(List<String> values) {
            addCriterion("tenant_id_card in", values, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardNotIn(List<String> values) {
            addCriterion("tenant_id_card not in", values, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardBetween(String value1, String value2) {
            addCriterion("tenant_id_card between", value1, value2, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantIdCardNotBetween(String value1, String value2) {
            addCriterion("tenant_id_card not between", value1, value2, "tenantIdCard");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoIsNull() {
            addCriterion("tenant_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoIsNotNull() {
            addCriterion("tenant_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoEqualTo(String value) {
            addCriterion("tenant_contact_no =", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoNotEqualTo(String value) {
            addCriterion("tenant_contact_no <>", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoGreaterThan(String value) {
            addCriterion("tenant_contact_no >", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_contact_no >=", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoLessThan(String value) {
            addCriterion("tenant_contact_no <", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoLessThanOrEqualTo(String value) {
            addCriterion("tenant_contact_no <=", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoLike(String value) {
            addCriterion("tenant_contact_no like", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoNotLike(String value) {
            addCriterion("tenant_contact_no not like", value, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoIn(List<String> values) {
            addCriterion("tenant_contact_no in", values, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoNotIn(List<String> values) {
            addCriterion("tenant_contact_no not in", values, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoBetween(String value1, String value2) {
            addCriterion("tenant_contact_no between", value1, value2, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantContactNoNotBetween(String value1, String value2) {
            addCriterion("tenant_contact_no not between", value1, value2, "tenantContactNo");
            return (Criteria) this;
        }

        public Criteria andTenantEmailIsNull() {
            addCriterion("tenant_email is null");
            return (Criteria) this;
        }

        public Criteria andTenantEmailIsNotNull() {
            addCriterion("tenant_email is not null");
            return (Criteria) this;
        }

        public Criteria andTenantEmailEqualTo(String value) {
            addCriterion("tenant_email =", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailNotEqualTo(String value) {
            addCriterion("tenant_email <>", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailGreaterThan(String value) {
            addCriterion("tenant_email >", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_email >=", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailLessThan(String value) {
            addCriterion("tenant_email <", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailLessThanOrEqualTo(String value) {
            addCriterion("tenant_email <=", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailLike(String value) {
            addCriterion("tenant_email like", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailNotLike(String value) {
            addCriterion("tenant_email not like", value, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailIn(List<String> values) {
            addCriterion("tenant_email in", values, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailNotIn(List<String> values) {
            addCriterion("tenant_email not in", values, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailBetween(String value1, String value2) {
            addCriterion("tenant_email between", value1, value2, "tenantEmail");
            return (Criteria) this;
        }

        public Criteria andTenantEmailNotBetween(String value1, String value2) {
            addCriterion("tenant_email not between", value1, value2, "tenantEmail");
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

        public Criteria andMoveInEqualTo(Date value) {
            addCriterion("move_in =", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotEqualTo(Date value) {
            addCriterion("move_in <>", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInGreaterThan(Date value) {
            addCriterion("move_in >", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInGreaterThanOrEqualTo(Date value) {
            addCriterion("move_in >=", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInLessThan(Date value) {
            addCriterion("move_in <", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInLessThanOrEqualTo(Date value) {
            addCriterion("move_in <=", value, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInIn(List<Date> values) {
            addCriterion("move_in in", values, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotIn(List<Date> values) {
            addCriterion("move_in not in", values, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInBetween(Date value1, Date value2) {
            addCriterion("move_in between", value1, value2, "moveIn");
            return (Criteria) this;
        }

        public Criteria andMoveInNotBetween(Date value1, Date value2) {
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

        public Criteria andMoveOutEqualTo(Date value) {
            addCriterion("move_out =", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotEqualTo(Date value) {
            addCriterion("move_out <>", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutGreaterThan(Date value) {
            addCriterion("move_out >", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutGreaterThanOrEqualTo(Date value) {
            addCriterion("move_out >=", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutLessThan(Date value) {
            addCriterion("move_out <", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutLessThanOrEqualTo(Date value) {
            addCriterion("move_out <=", value, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutIn(List<Date> values) {
            addCriterion("move_out in", values, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotIn(List<Date> values) {
            addCriterion("move_out not in", values, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutBetween(Date value1, Date value2) {
            addCriterion("move_out between", value1, value2, "moveOut");
            return (Criteria) this;
        }

        public Criteria andMoveOutNotBetween(Date value1, Date value2) {
            addCriterion("move_out not between", value1, value2, "moveOut");
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

        public Criteria andBrokerContactNoIsNull() {
            addCriterion("broker_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoIsNotNull() {
            addCriterion("broker_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoEqualTo(String value) {
            addCriterion("broker_contact_no =", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoNotEqualTo(String value) {
            addCriterion("broker_contact_no <>", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoGreaterThan(String value) {
            addCriterion("broker_contact_no >", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("broker_contact_no >=", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoLessThan(String value) {
            addCriterion("broker_contact_no <", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoLessThanOrEqualTo(String value) {
            addCriterion("broker_contact_no <=", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoLike(String value) {
            addCriterion("broker_contact_no like", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoNotLike(String value) {
            addCriterion("broker_contact_no not like", value, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoIn(List<String> values) {
            addCriterion("broker_contact_no in", values, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoNotIn(List<String> values) {
            addCriterion("broker_contact_no not in", values, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoBetween(String value1, String value2) {
            addCriterion("broker_contact_no between", value1, value2, "brokerContactNo");
            return (Criteria) this;
        }

        public Criteria andBrokerContactNoNotBetween(String value1, String value2) {
            addCriterion("broker_contact_no not between", value1, value2, "brokerContactNo");
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