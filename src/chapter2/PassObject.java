package chapter2;

/**
 * Create by Intellij Idea.
 * 方法调用中的别名问题
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);

        f(x);
        System.out.println("2: x.c: " + x.c);
    }

    /*output
    1: x.c: a
    2: x.c: z
     */
}
