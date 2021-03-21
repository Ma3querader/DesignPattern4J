package com.observer.obs;

/**
 * @Author: panyusheng
 * @Date: 2021/3/21
 * @Version 1.0
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
