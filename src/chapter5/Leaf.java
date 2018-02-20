package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args){
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
    /*output
    i = 3
     */
}
