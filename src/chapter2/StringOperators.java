package chapter2;

/**
 * Create by Intellij Idea.
 * 字符串操作符+和+=
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class StringOperators {
    public static void main(String[] args){
        int x = 0, y = 1, z = 2;
        //如果表达式以一个字符串开头，那么后续所有操作数都必须是字符串类型
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println(" " + x);
    }

    /*output
    x, y, z 012
    0 x, y, z
    x, y, z (summed) = 3
     0
     */
}
