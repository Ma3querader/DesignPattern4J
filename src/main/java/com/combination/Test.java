package com.combination;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        OrganizationComponent un = new University("清华");
        OrganizationComponent college = new College("计算机系");
        OrganizationComponent department = new Department("软件工程");

        un.add(college);
        college.add(department);
        un.print();

    }
}
