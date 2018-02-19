package chapter4;

/**
 * Create by Intellij Idea.
 * 逗号操作符
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class CommaOperator {
    public static void main(String[] args){
        //逗号操作符（不是逗号分隔符），唯一使用的地方就是for循环的控制表达式，在控制表达式的初始化和步进控制部分，可以使用一系列由逗号分隔的语句，而且那些语句均会独立执行
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
