package com.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class University extends OrganizationComponent {

    // 维护学院的数组
    private List<OrganizationComponent> collegeList = new ArrayList<>();

    public University(String name) {
        super(name);
    }

    @Override
    protected void add(OrganizationComponent obj) {
        collegeList.add(obj);
    }

    @Override
    public void remove(OrganizationComponent obj) {
        collegeList.remove(obj);
    }

    @Override
    public void print() {
        System.out.println("--------" + this.getName() + "--------");
        collegeList.forEach(v -> v.print());
    }

}
