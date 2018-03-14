package com.newhead.barablah.modules.barablahcourse.base.repository.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BarablahCourseExample {
    /**
     * RudderFramework框架生成代码，请不要直接修改.
     * 
     * This field corresponds to the database table barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    protected String orderByClause;

    /**
     * RudderFramework框架生成代码，请不要直接修改.
     * 
     * This field corresponds to the database table barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    protected boolean distinct;

    /**
     * RudderFramework框架生成代码，请不要直接修改.
     * 
     * This field corresponds to the database table barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    protected List<Criteria> oredCriteria;

    private int startRow;

    private int pageSize;

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public BarablahCourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_course
     * @generated 2018年3月13日 07:57:05
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartRow() {
        return this.startRow;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table barablah_course
     * @generated 2018年3月13日 07:57:05
     */
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdIsNull() {
            addCriterion("textbook_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdIsNotNull() {
            addCriterion("textbook_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdEqualTo(Long value) {
            addCriterion("textbook_category_id =", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdNotEqualTo(Long value) {
            addCriterion("textbook_category_id <>", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdGreaterThan(Long value) {
            addCriterion("textbook_category_id >", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("textbook_category_id >=", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdLessThan(Long value) {
            addCriterion("textbook_category_id <", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("textbook_category_id <=", value, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdIn(List<Long> values) {
            addCriterion("textbook_category_id in", values, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdNotIn(List<Long> values) {
            addCriterion("textbook_category_id not in", values, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdBetween(Long value1, Long value2) {
            addCriterion("textbook_category_id between", value1, value2, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andTextbookCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("textbook_category_id not between", value1, value2, "textbookCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsIsNull() {
            addCriterion("online_lessons is null");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsIsNotNull() {
            addCriterion("online_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsEqualTo(Short value) {
            addCriterion("online_lessons =", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsNotEqualTo(Short value) {
            addCriterion("online_lessons <>", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsGreaterThan(Short value) {
            addCriterion("online_lessons >", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsGreaterThanOrEqualTo(Short value) {
            addCriterion("online_lessons >=", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsLessThan(Short value) {
            addCriterion("online_lessons <", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsLessThanOrEqualTo(Short value) {
            addCriterion("online_lessons <=", value, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsIn(List<Short> values) {
            addCriterion("online_lessons in", values, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsNotIn(List<Short> values) {
            addCriterion("online_lessons not in", values, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsBetween(Short value1, Short value2) {
            addCriterion("online_lessons between", value1, value2, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineLessonsNotBetween(Short value1, Short value2) {
            addCriterion("online_lessons not between", value1, value2, "onlineLessons");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationIsNull() {
            addCriterion("online_duration is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationIsNotNull() {
            addCriterion("online_duration is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationEqualTo(Short value) {
            addCriterion("online_duration =", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationNotEqualTo(Short value) {
            addCriterion("online_duration <>", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationGreaterThan(Short value) {
            addCriterion("online_duration >", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("online_duration >=", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationLessThan(Short value) {
            addCriterion("online_duration <", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationLessThanOrEqualTo(Short value) {
            addCriterion("online_duration <=", value, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationIn(List<Short> values) {
            addCriterion("online_duration in", values, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationNotIn(List<Short> values) {
            addCriterion("online_duration not in", values, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationBetween(Short value1, Short value2) {
            addCriterion("online_duration between", value1, value2, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOnlineDurationNotBetween(Short value1, Short value2) {
            addCriterion("online_duration not between", value1, value2, "onlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsIsNull() {
            addCriterion("offline_lessons is null");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsIsNotNull() {
            addCriterion("offline_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsEqualTo(Short value) {
            addCriterion("offline_lessons =", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsNotEqualTo(Short value) {
            addCriterion("offline_lessons <>", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsGreaterThan(Short value) {
            addCriterion("offline_lessons >", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsGreaterThanOrEqualTo(Short value) {
            addCriterion("offline_lessons >=", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsLessThan(Short value) {
            addCriterion("offline_lessons <", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsLessThanOrEqualTo(Short value) {
            addCriterion("offline_lessons <=", value, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsIn(List<Short> values) {
            addCriterion("offline_lessons in", values, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsNotIn(List<Short> values) {
            addCriterion("offline_lessons not in", values, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsBetween(Short value1, Short value2) {
            addCriterion("offline_lessons between", value1, value2, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineLessonsNotBetween(Short value1, Short value2) {
            addCriterion("offline_lessons not between", value1, value2, "offlineLessons");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationIsNull() {
            addCriterion("offline_duration is null");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationIsNotNull() {
            addCriterion("offline_duration is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationEqualTo(Short value) {
            addCriterion("offline_duration =", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationNotEqualTo(Short value) {
            addCriterion("offline_duration <>", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationGreaterThan(Short value) {
            addCriterion("offline_duration >", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("offline_duration >=", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationLessThan(Short value) {
            addCriterion("offline_duration <", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationLessThanOrEqualTo(Short value) {
            addCriterion("offline_duration <=", value, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationIn(List<Short> values) {
            addCriterion("offline_duration in", values, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationNotIn(List<Short> values) {
            addCriterion("offline_duration not in", values, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationBetween(Short value1, Short value2) {
            addCriterion("offline_duration between", value1, value2, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andOfflineDurationNotBetween(Short value1, Short value2) {
            addCriterion("offline_duration not between", value1, value2, "offlineDuration");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(BigDecimal value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(BigDecimal value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(BigDecimal value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(BigDecimal value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<BigDecimal> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<BigDecimal> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNull() {
            addCriterion("last_modifier is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIsNotNull() {
            addCriterion("last_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierEqualTo(Long value) {
            addCriterion("last_modifier =", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotEqualTo(Long value) {
            addCriterion("last_modifier <>", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThan(Long value) {
            addCriterion("last_modifier >", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierGreaterThanOrEqualTo(Long value) {
            addCriterion("last_modifier >=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThan(Long value) {
            addCriterion("last_modifier <", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierLessThanOrEqualTo(Long value) {
            addCriterion("last_modifier <=", value, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierIn(List<Long> values) {
            addCriterion("last_modifier in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotIn(List<Long> values) {
            addCriterion("last_modifier not in", values, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierBetween(Long value1, Long value2) {
            addCriterion("last_modifier between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andLastModifierNotBetween(Long value1, Long value2) {
            addCriterion("last_modifier not between", value1, value2, "lastModifier");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * RudderFramework Util 生成.
     * 根据数据库表 barablah_course
     * @generated do_not_delete_during_merge 2018年3月13日 07:57:05
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table barablah_course
     * @generated 2018年3月13日 07:57:05
     */
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