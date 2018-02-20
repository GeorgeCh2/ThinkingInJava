package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class House {
    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
