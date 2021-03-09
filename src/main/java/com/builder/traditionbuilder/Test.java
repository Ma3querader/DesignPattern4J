package com.builder.traditionbuilder;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        ComputerDirector director = new ComputerDirector();//1
//        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");//2
//        director.construct(builder);//3
//        Computer macComputer = builder.getComputer();//4
//        System.out.println("mac computer:" + macComputer.toString());

        StringBuilder sb = new StringBuilder();
        sb.append(123).append('a')
                .append(1.23)
                .append(true)
                .append("hhhh");
        String s = new String(sb);
        System.out.println(s);

    }
}
