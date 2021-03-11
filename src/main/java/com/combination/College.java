package com.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class College extends OrganizationComponent{

    // 维护系的数组
    private List<OrganizationComponent> departmentList = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    protected void add(OrganizationComponent obj) {
        departmentList.add(obj);
    }

    @Override
    public void remove(OrganizationComponent obj) {
        departmentList.remove(obj);
    }

    @Override
    public void print() {
        System.out.println("--------" + this.getName() + "--------");
        departmentList.forEach(v -> v.print());
    }
}
