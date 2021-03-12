package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public class WebSiteFactory {

    // 池
    private Map<String, WebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type))
            pool.put(type, new ConcreteWebSite(type));
        return this.pool.get(type);
    }

    public int getWebSiteCount() {
        return this.pool.size();
    }

}
