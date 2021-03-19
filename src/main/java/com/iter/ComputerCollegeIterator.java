package com.iter;

import java.util.Iterator;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;

    private int index = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (this.index >= this.departments.length || this.departments[this.index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department d = this.departments[this.index];
        this.index += 1;
        return d;
    }

}
