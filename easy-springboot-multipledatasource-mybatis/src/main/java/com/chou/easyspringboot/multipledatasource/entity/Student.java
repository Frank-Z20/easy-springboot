package com.chou.easyspringboot.multipledatasource.entity;

/**
 * @Author: zhouxf
 * @Create: 2021/1/4 19:41
 */
public class Student {
    private String stuNum;
    private String name;
    private String className;

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
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
