package com.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class OutPutImpl {

    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator<College> collegeIterator = this.collegeList.iterator();
        while (collegeIterator.hasNext()) {
            College c = collegeIterator.next();
            System.out.println("============" + c.getName() + "============");
            this.printDepartment(c.createIterator());
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }

}
