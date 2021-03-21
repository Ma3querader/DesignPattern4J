package com.observer.obs;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
