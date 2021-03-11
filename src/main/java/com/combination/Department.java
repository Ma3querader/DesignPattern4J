package com.combination;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Department extends OrganizationComponent {

    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }
}
