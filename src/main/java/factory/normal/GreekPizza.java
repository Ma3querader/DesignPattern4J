package factory.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨 准备原材料");
    }
}
