package com.iter;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class InfoColleageIterator implements Iterator {

    private List<Department> departmentList;

    private int index = 0;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (this.index >= this.departmentList.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department d = this.departmentList.get(this.index);
        index += 1;
        return d;
    }
}
