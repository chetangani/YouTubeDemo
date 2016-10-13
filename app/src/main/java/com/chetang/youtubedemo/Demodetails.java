package com.chetang.youtubedemo;

/**
 * Created by Chetan G on 6/19/2016.
 */
public class Demodetails {
    String course_slno, course_name, details_slno, details_name, details_duration, details_content;

    public Demodetails() {
    }

    public Demodetails(String course_slno, String course_name) {
        this.course_slno = course_slno;
        this.course_name = course_name;
    }

    public Demodetails(String details_slno, String details_name, String details_duration, String details_content) {
        this.details_slno = details_slno;
        this.details_name = details_name;
        this.details_duration = details_duration;
        this.details_content = details_content;
    }

    public String getCourse_slno() {
        return course_slno;
    }

    public void setCourse_slno(String course_slno) {
        this.course_slno = course_slno;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDetails_slno() {
        return details_slno;
    }

    public void setDetails_slno(String details_slno) {
        this.details_slno = details_slno;
    }

    public String getDetails_name() {
        return details_name;
    }

    public void setDetails_name(String details_name) {
        this.details_name = details_name;
    }

    public String getDetails_duration() {
        return details_duration;
    }

    public void setDetails_duration(String details_duration) {
        this.details_duration = details_duration;
    }

    public String getDetails_content() {
        return details_content;
    }

    public void setDetails_content(String details_content) {
        this.details_content = details_content;
    }
}
