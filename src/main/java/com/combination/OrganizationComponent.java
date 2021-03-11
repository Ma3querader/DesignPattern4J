package com.combination;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public abstract class OrganizationComponent {

    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    protected void add(OrganizationComponent obj) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent obj) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
