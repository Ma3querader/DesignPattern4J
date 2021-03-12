package com.template;

/**
 * @Author: panyusheng
 * @Date: 2021/3/12
 * @Version 1.0
 */
public abstract class SoyaMilk {

    final void make() {
        select();
        if (customerWantCondiments())
            addCondiments();
        soak();
        beat();
    }

    // 选材料
    void select() {
        System.out.println("第一步：选择好的新鲜黄豆	");
    }

    // 添加不同的配料， 抽象方法,  子类具体实现
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三步， 黄豆和配料开始浸泡， 需要 3 小时 ");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎	");
    }

    // 钩子函数 决定是否加材料
    boolean customerWantCondiments() {
        return true;
    }


}
