package com.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/3/20
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ComputerCollege cc = new ComputerCollege();
        cc.addDepartment("软件工程");
        cc.addDepartment("php");
        cc.addDepartment("C++");
        InfoCollege ic = new InfoCollege();
        ic.addDepartment("信息工程");
        ic.addDepartment("网络工程");
        ic.addDepartment("C");

        List<College> list = new ArrayList<>();
        list.add(cc);
        list.add(ic);
        OutPutImpl oi = new OutPutImpl(list);
        oi.printCollege();


    }

}
