package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class OverloadingOrder {
    //参数顺序的不同也足以区分两个方法，但不建议这么使用，会使得方法难以维护
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args){
        f("String first", 11);
        f(99, "Int first");
    }
    /*output
    String: String first, int: 11
    int: 99, String: Int first
     */
}
