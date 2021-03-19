package com.iter;

import java.util.Iterator;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public interface College {

    String getName();

    void addDepartment(String name);

    Iterator createIterator();

}
