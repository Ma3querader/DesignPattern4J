package factory.abstractfactory;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */

// 抽象工厂模式 抽象层
public interface AbsFactory {

    //让下面的工厂子类来 具体实现
    Pizza createPizza(String orderType);

}
