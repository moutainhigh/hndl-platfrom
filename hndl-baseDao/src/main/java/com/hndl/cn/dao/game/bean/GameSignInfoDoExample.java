package com.hndl.cn.dao.game.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GameSignInfoDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GameSignInfoDoExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_Deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_Deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_Deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_Deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_Deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_Deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_Deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_Deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_Deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_Deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_Deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_Deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_Deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNull() {
            addCriterion("create_Operator is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNotNull() {
            addCriterion("create_Operator is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorEqualTo(String value) {
            addCriterion("create_Operator =", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotEqualTo(String value) {
            addCriterion("create_Operator <>", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThan(String value) {
            addCriterion("create_Operator >", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("create_Operator >=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThan(String value) {
            addCriterion("create_Operator <", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThanOrEqualTo(String value) {
            addCriterion("create_Operator <=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLike(String value) {
            addCriterion("create_Operator like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotLike(String value) {
            addCriterion("create_Operator not like", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIn(List<String> values) {
            addCriterion("create_Operator in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotIn(List<String> values) {
            addCriterion("create_Operator not in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorBetween(String value1, String value2) {
            addCriterion("create_Operator between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotBetween(String value1, String value2) {
            addCriterion("create_Operator not between", value1, value2, "createOperator");
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

        public Criteria andLastOperatorIsNull() {
            addCriterion("last_Operator is null");
            return (Criteria) this;
        }

        public Criteria andLastOperatorIsNotNull() {
            addCriterion("last_Operator is not null");
            return (Criteria) this;
        }

        public Criteria andLastOperatorEqualTo(String value) {
            addCriterion("last_Operator =", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorNotEqualTo(String value) {
            addCriterion("last_Operator <>", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorGreaterThan(String value) {
            addCriterion("last_Operator >", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("last_Operator >=", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorLessThan(String value) {
            addCriterion("last_Operator <", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorLessThanOrEqualTo(String value) {
            addCriterion("last_Operator <=", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorLike(String value) {
            addCriterion("last_Operator like", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorNotLike(String value) {
            addCriterion("last_Operator not like", value, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorIn(List<String> values) {
            addCriterion("last_Operator in", values, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorNotIn(List<String> values) {
            addCriterion("last_Operator not in", values, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorBetween(String value1, String value2) {
            addCriterion("last_Operator between", value1, value2, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastOperatorNotBetween(String value1, String value2) {
            addCriterion("last_Operator not between", value1, value2, "lastOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_Modify_Time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_Modify_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_Modify_Time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_Modify_Time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_Modify_Time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_Modify_Time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_Modify_Time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_Modify_Time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_Modify_Time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_Modify_Time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_Modify_Time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_Modify_Time not between", value1, value2, "lastModifyTime");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllIsNull() {
            addCriterion("prize_type_all is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllIsNotNull() {
            addCriterion("prize_type_all is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllEqualTo(String value) {
            addCriterion("prize_type_all =", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllNotEqualTo(String value) {
            addCriterion("prize_type_all <>", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllGreaterThan(String value) {
            addCriterion("prize_type_all >", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllGreaterThanOrEqualTo(String value) {
            addCriterion("prize_type_all >=", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllLessThan(String value) {
            addCriterion("prize_type_all <", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllLessThanOrEqualTo(String value) {
            addCriterion("prize_type_all <=", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllLike(String value) {
            addCriterion("prize_type_all like", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllNotLike(String value) {
            addCriterion("prize_type_all not like", value, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllIn(List<String> values) {
            addCriterion("prize_type_all in", values, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllNotIn(List<String> values) {
            addCriterion("prize_type_all not in", values, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllBetween(String value1, String value2) {
            addCriterion("prize_type_all between", value1, value2, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeAllNotBetween(String value1, String value2) {
            addCriterion("prize_type_all not between", value1, value2, "prizeTypeAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllIsNull() {
            addCriterion("prize_count_all is null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllIsNotNull() {
            addCriterion("prize_count_all is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllEqualTo(Integer value) {
            addCriterion("prize_count_all =", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllNotEqualTo(Integer value) {
            addCriterion("prize_count_all <>", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllGreaterThan(Integer value) {
            addCriterion("prize_count_all >", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_count_all >=", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllLessThan(Integer value) {
            addCriterion("prize_count_all <", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllLessThanOrEqualTo(Integer value) {
            addCriterion("prize_count_all <=", value, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllIn(List<Integer> values) {
            addCriterion("prize_count_all in", values, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllNotIn(List<Integer> values) {
            addCriterion("prize_count_all not in", values, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllBetween(Integer value1, Integer value2) {
            addCriterion("prize_count_all between", value1, value2, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeCountAllNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_count_all not between", value1, value2, "prizeCountAll");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineIsNull() {
            addCriterion("prize_type_contine is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineIsNotNull() {
            addCriterion("prize_type_contine is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineEqualTo(String value) {
            addCriterion("prize_type_contine =", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineNotEqualTo(String value) {
            addCriterion("prize_type_contine <>", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineGreaterThan(String value) {
            addCriterion("prize_type_contine >", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineGreaterThanOrEqualTo(String value) {
            addCriterion("prize_type_contine >=", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineLessThan(String value) {
            addCriterion("prize_type_contine <", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineLessThanOrEqualTo(String value) {
            addCriterion("prize_type_contine <=", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineLike(String value) {
            addCriterion("prize_type_contine like", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineNotLike(String value) {
            addCriterion("prize_type_contine not like", value, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineIn(List<String> values) {
            addCriterion("prize_type_contine in", values, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineNotIn(List<String> values) {
            addCriterion("prize_type_contine not in", values, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineBetween(String value1, String value2) {
            addCriterion("prize_type_contine between", value1, value2, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeContineNotBetween(String value1, String value2) {
            addCriterion("prize_type_contine not between", value1, value2, "prizeTypeContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineIsNull() {
            addCriterion("prize_count_contine is null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineIsNotNull() {
            addCriterion("prize_count_contine is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineEqualTo(Integer value) {
            addCriterion("prize_count_contine =", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineNotEqualTo(Integer value) {
            addCriterion("prize_count_contine <>", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineGreaterThan(Integer value) {
            addCriterion("prize_count_contine >", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_count_contine >=", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineLessThan(Integer value) {
            addCriterion("prize_count_contine <", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineLessThanOrEqualTo(Integer value) {
            addCriterion("prize_count_contine <=", value, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineIn(List<Integer> values) {
            addCriterion("prize_count_contine in", values, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineNotIn(List<Integer> values) {
            addCriterion("prize_count_contine not in", values, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineBetween(Integer value1, Integer value2) {
            addCriterion("prize_count_contine between", value1, value2, "prizeCountContine");
            return (Criteria) this;
        }

        public Criteria andPrizeCountContineNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_count_contine not between", value1, value2, "prizeCountContine");
            return (Criteria) this;
        }
    }

    /**
     */
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