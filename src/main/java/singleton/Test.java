package singleton;

/**
 * @Author: panyusheng
 * @Date: 2021/3/5
 * @Version 1.0
 */
public class Test implements Runnable {

    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test);
        t1.start();

        Test test2 = new Test();
        Thread t2 = new Thread(test2);
        t2.start();

    }


    @Override
    public void run() {
        Hungry8 hungry8 = Hungry8.INSTANCE;
        hungry8.test();
    }
}
