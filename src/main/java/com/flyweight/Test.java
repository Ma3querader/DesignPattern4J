package com.flyweight;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite web = factory.getWebSiteCategory("新闻");
        web.use();
        WebSite web1 = factory.getWebSiteCategory("抖音");
        web1.use();
        WebSite web2 = factory.getWebSiteCategory("知乎");
        web2.use();
        WebSite web3 = factory.getWebSiteCategory("新闻");
        web3.use();

        int count = factory.getWebSiteCount();
        System.out.println(count);
    }
}
