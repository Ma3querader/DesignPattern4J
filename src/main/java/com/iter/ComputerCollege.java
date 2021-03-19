package com.iter;

import java.util.Iterator;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class ComputerCollege implements College {

    private Department[] departments;

    private int index = 0;

    public ComputerCollege() {
        departments = new Department[3];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        Department d = new Department(name);
        this.departments[this.index] = d;
        this.index += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(this.departments);
    }
}
