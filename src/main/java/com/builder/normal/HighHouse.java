package com.builder.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/9
 * @Version 1.0
 */
public class HighHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println(" 豪华房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 豪华房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 豪华房子封顶 ");
    }
}
