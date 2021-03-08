package factory.normal;

/**
 * @Author: panyusheng
 * @Date: 2021/3/8
 * @Version 1.0
 */
public abstract class Pizza {
    public String name;

    // 不同pizza不同材料，抽象
    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " baking;");
    }

    public void cut() {
        System.out.println(this.name + " cutting;");
    }

    public void box() {
        System.out.println(this.name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
