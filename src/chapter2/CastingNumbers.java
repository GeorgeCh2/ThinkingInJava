package chapter2;

/**
 * Create by Intellij Idea.
 * 截尾
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class CastingNumbers {
    public static void main(String[] args){
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        //将double、float类型转型为整型时，总是对数字执行截尾
        System.out.println("(int)above : " + (int)above);
        System.out.println("(int)below : " + (int)below);
        System.out.println("(int)fabove : " + (int)fabove);
        System.out.println("(int)fbelow : " + (int)fbelow);
    }

    /*output
    (int)above : 0
    (int)below : 0
    (int)fabove : 0
    (int)fbelow : 0
     */
}
