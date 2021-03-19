package com.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class InfoCollege implements College {

    private List<Department> departmentList;

    public InfoCollege() {
        this.departmentList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name) {
        Department d = new Department(name);
        departmentList.add(d);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(this.departmentList);
    }
}
