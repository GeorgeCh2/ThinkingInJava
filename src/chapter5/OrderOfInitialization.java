package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class OrderOfInitialization {
    public static void main(String[] args){
        House h = new House();
        h.f();
    }

    /*output
    Window(1)
    Window(2)
    Window(3)
    House()
    Window(33)
    f()
     */
}
