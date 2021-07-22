package com.example.mochi;

public class PeopleModel {
    private String course_name;
    private String course_profession;
    private String course_no;
    // Constructor
    public PeopleModel(String course_name, String course_profession, String course_no) {
        this.course_name = course_name;
        this.course_profession = course_profession;
        this.course_no = course_no;

    }

    // Getter and Setter
    public String getCourse_name() {

        return course_name;
    }

    public void setCourse_name(String course_name) {

        this.course_name = course_name;
    }

    public String getCourse_profession() {

        return course_profession;
    }

    public void setCourse_profession(String course_profession) {

        this.course_profession = course_profession;
    }
    public String getCourse_no() {

        return course_no;
    }

    public void setCourse_no(String course_no) {

        this.course_no = course_no;
    }

}
