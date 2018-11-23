package com.baizhi.entity;

public class T_student {
    private int stu_id;
    private String stu_name;
    private int stu_age;
    private int stu_gender;
    private int isdelete;

    public T_student(int stu_id, String stu_name, int stu_age, int stu_gender, int isdelete) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_gender = stu_gender;
        this.isdelete = isdelete;
    }

    public T_student() {
        super();
    }

    @Override
    public String toString() {
        return "T_student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", stu_gender=" + stu_gender +
                ", isdelete=" + isdelete +
                '}';
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public int getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(int stu_gender) {
        this.stu_gender = stu_gender;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
}
