package factory.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("胡椒披萨准备原材料");
    }
}
