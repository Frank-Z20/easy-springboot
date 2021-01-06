package com.chou.easyspringboot.multipledatasource.entity;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:42
 */
public class Teacher {
    private String teacherNum;
    private String name;
    private String className;

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
