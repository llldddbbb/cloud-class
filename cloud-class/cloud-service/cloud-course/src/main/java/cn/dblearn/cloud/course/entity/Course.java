package cn.dblearn.cloud.course.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Course {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 封面
     */
    @Column(name = "cover_image")
    private String coverImage;

    /**
     * 描述
     */
    private String description;

    /**
     * 浏览量
     */
    @Column(name = "page_view")
    private Long pageView;

    /**
     * 价格
     */
    private Double price;

    /**
     * 折扣价格
     */
    @Column(name = "discount_price")
    private Double discountPrice;

    /**
     * 是否热门课程
     */
    @Column(name = "is_hot")
    private Byte isHot;

    /**
     * 是否精品课程
     */
    @Column(name = "is_boutique")
    private Byte isBoutique;

    /**
     * 所属类别Id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 所属教师Id
     */
    @Column(name = "teacher_id")
    private Integer teacherId;

    /**
     * 发布日期
     */
    @Column(name = "publish_time")
    private Date publishTime;

    /**
     * 更新日期
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 课程详情
     */
    @Column(name = "course_detail")
    private String courseDetail;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取封面
     *
     * @return cover_image - 封面
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     * 设置封面
     *
     * @param coverImage 封面
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取浏览量
     *
     * @return page_view - 浏览量
     */
    public Long getPageView() {
        return pageView;
    }

    /**
     * 设置浏览量
     *
     * @param pageView 浏览量
     */
    public void setPageView(Long pageView) {
        this.pageView = pageView;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取折扣价格
     *
     * @return discount_price - 折扣价格
     */
    public Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 设置折扣价格
     *
     * @param discountPrice 折扣价格
     */
    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 获取是否热门课程
     *
     * @return is_hot - 是否热门课程
     */
    public Byte getIsHot() {
        return isHot;
    }

    /**
     * 设置是否热门课程
     *
     * @param isHot 是否热门课程
     */
    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取是否精品课程
     *
     * @return is_boutique - 是否精品课程
     */
    public Byte getIsBoutique() {
        return isBoutique;
    }

    /**
     * 设置是否精品课程
     *
     * @param isBoutique 是否精品课程
     */
    public void setIsBoutique(Byte isBoutique) {
        this.isBoutique = isBoutique;
    }

    /**
     * 获取所属类别Id
     *
     * @return category_id - 所属类别Id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置所属类别Id
     *
     * @param categoryId 所属类别Id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取所属教师Id
     *
     * @return teacher_id - 所属教师Id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置所属教师Id
     *
     * @param teacherId 所属教师Id
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 获取课程详情
     *
     * @return course_detail - 课程详情
     */
    public String getCourseDetail() {
        return courseDetail;
    }

    /**
     * 设置课程详情
     *
     * @param courseDetail 课程详情
     */
    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}