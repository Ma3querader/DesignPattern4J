package com.facade;

/**
 * @Author: panyusheng
 * @Date: 2021/3/11
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.end();
    }
}
