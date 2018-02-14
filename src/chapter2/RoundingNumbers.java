package chapter2;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class RoundingNumbers {
    public static void main(String[] args){
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        //将double、float类型转型为整型时，总是对数字执行截尾
        System.out.println("Math.round(above) : " + Math.round(above));
        System.out.println("Math.round(below) : " + Math.round(below));
        System.out.println("Math.round(fabove) : " + Math.round(fabove));
        System.out.println("Math.round(fbelow) : " + Math.round(fbelow));
    }

    /*output
    Math.round(above) : 1
    Math.round(below) : 0
    Math.round(fabove) : 1
    Math.round(fbelow) : 0
     */
}
