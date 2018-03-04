package cn.dblearn.cloud.course.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Category {
    @Id
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "publish_time")
    private Date publishTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return publish_time
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * @param publishTime
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}