package com.daocheng.perfectmathematical.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PCourseExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(Integer value) {
            addCriterion("chapter_id =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(Integer value) {
            addCriterion("chapter_id <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(Integer value) {
            addCriterion("chapter_id >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_id >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(Integer value) {
            addCriterion("chapter_id <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_id <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<Integer> values) {
            addCriterion("chapter_id in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<Integer> values) {
            addCriterion("chapter_id not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlIsNull() {
            addCriterion("cover_square_url is null");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlIsNotNull() {
            addCriterion("cover_square_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlEqualTo(String value) {
            addCriterion("cover_square_url =", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlNotEqualTo(String value) {
            addCriterion("cover_square_url <>", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlGreaterThan(String value) {
            addCriterion("cover_square_url >", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_square_url >=", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlLessThan(String value) {
            addCriterion("cover_square_url <", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlLessThanOrEqualTo(String value) {
            addCriterion("cover_square_url <=", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlLike(String value) {
            addCriterion("cover_square_url like", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlNotLike(String value) {
            addCriterion("cover_square_url not like", value, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlIn(List<String> values) {
            addCriterion("cover_square_url in", values, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlNotIn(List<String> values) {
            addCriterion("cover_square_url not in", values, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlBetween(String value1, String value2) {
            addCriterion("cover_square_url between", value1, value2, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverSquareUrlNotBetween(String value1, String value2) {
            addCriterion("cover_square_url not between", value1, value2, "coverSquareUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlIsNull() {
            addCriterion("cover_rectangle_url is null");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlIsNotNull() {
            addCriterion("cover_rectangle_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlEqualTo(String value) {
            addCriterion("cover_rectangle_url =", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlNotEqualTo(String value) {
            addCriterion("cover_rectangle_url <>", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlGreaterThan(String value) {
            addCriterion("cover_rectangle_url >", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_rectangle_url >=", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlLessThan(String value) {
            addCriterion("cover_rectangle_url <", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlLessThanOrEqualTo(String value) {
            addCriterion("cover_rectangle_url <=", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlLike(String value) {
            addCriterion("cover_rectangle_url like", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlNotLike(String value) {
            addCriterion("cover_rectangle_url not like", value, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlIn(List<String> values) {
            addCriterion("cover_rectangle_url in", values, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlNotIn(List<String> values) {
            addCriterion("cover_rectangle_url not in", values, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlBetween(String value1, String value2) {
            addCriterion("cover_rectangle_url between", value1, value2, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andCoverRectangleUrlNotBetween(String value1, String value2) {
            addCriterion("cover_rectangle_url not between", value1, value2, "coverRectangleUrl");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStudyNumberIsNull() {
            addCriterion("study_number is null");
            return (Criteria) this;
        }

        public Criteria andStudyNumberIsNotNull() {
            addCriterion("study_number is not null");
            return (Criteria) this;
        }

        public Criteria andStudyNumberEqualTo(Integer value) {
            addCriterion("study_number =", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberNotEqualTo(Integer value) {
            addCriterion("study_number <>", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberGreaterThan(Integer value) {
            addCriterion("study_number >", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("study_number >=", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberLessThan(Integer value) {
            addCriterion("study_number <", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("study_number <=", value, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberIn(List<Integer> values) {
            addCriterion("study_number in", values, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberNotIn(List<Integer> values) {
            addCriterion("study_number not in", values, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberBetween(Integer value1, Integer value2) {
            addCriterion("study_number between", value1, value2, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andStudyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("study_number not between", value1, value2, "studyNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberIsNull() {
            addCriterion("purchases_number is null");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberIsNotNull() {
            addCriterion("purchases_number is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberEqualTo(Integer value) {
            addCriterion("purchases_number =", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberNotEqualTo(Integer value) {
            addCriterion("purchases_number <>", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberGreaterThan(Integer value) {
            addCriterion("purchases_number >", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchases_number >=", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberLessThan(Integer value) {
            addCriterion("purchases_number <", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("purchases_number <=", value, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberIn(List<Integer> values) {
            addCriterion("purchases_number in", values, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberNotIn(List<Integer> values) {
            addCriterion("purchases_number not in", values, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberBetween(Integer value1, Integer value2) {
            addCriterion("purchases_number between", value1, value2, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andPurchasesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("purchases_number not between", value1, value2, "purchasesNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberIsNull() {
            addCriterion("star_number is null");
            return (Criteria) this;
        }

        public Criteria andStarNumberIsNotNull() {
            addCriterion("star_number is not null");
            return (Criteria) this;
        }

        public Criteria andStarNumberEqualTo(Integer value) {
            addCriterion("star_number =", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberNotEqualTo(Integer value) {
            addCriterion("star_number <>", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberGreaterThan(Integer value) {
            addCriterion("star_number >", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("star_number >=", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberLessThan(Integer value) {
            addCriterion("star_number <", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberLessThanOrEqualTo(Integer value) {
            addCriterion("star_number <=", value, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberIn(List<Integer> values) {
            addCriterion("star_number in", values, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberNotIn(List<Integer> values) {
            addCriterion("star_number not in", values, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberBetween(Integer value1, Integer value2) {
            addCriterion("star_number between", value1, value2, "starNumber");
            return (Criteria) this;
        }

        public Criteria andStarNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("star_number not between", value1, value2, "starNumber");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Integer value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Integer value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Integer value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Integer value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Integer value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Integer> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Integer> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Integer value1, Integer value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("enable not between", value1, value2, "enable");
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