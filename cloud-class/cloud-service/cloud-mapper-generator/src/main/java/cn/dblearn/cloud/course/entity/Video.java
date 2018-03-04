package cn.dblearn.cloud.course.entity;

import javax.persistence.*;

public class Video {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 章节
     */
    private Integer chapter;

    /**
     * 标题
     */
    private String title;

    @Column(name = "course_id")
    private Integer courseId;

    /**
     * 视频地址
     */
    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 视频封面地址
     */
    @Column(name = "cover_image_url")
    private String coverImageUrl;

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
     * 获取章节
     *
     * @return chapter - 章节
     */
    public Integer getChapter() {
        return chapter;
    }

    /**
     * 设置章节
     *
     * @param chapter 章节
     */
    public void setChapter(Integer chapter) {
        this.chapter = chapter;
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
     * @return course_id
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取视频地址
     *
     * @return video_url - 视频地址
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置视频地址
     *
     * @param videoUrl 视频地址
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取视频封面地址
     *
     * @return cover_image_url - 视频封面地址
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    /**
     * 设置视频封面地址
     *
     * @param coverImageUrl 视频封面地址
     */
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }
}