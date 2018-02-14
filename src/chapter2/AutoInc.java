package chapter2;

/**
 * Create by Intellij Idea.
 * 自动递增和递减
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class AutoInc {
    public static void main(String[] args){
        int i = 1;
        System.out.println("i : " + i);
        //前缀形式：先执行完运算后才得到值
        System.out.println("++i : "  + ++i);
        //后缀形式：在运算执行之前就得到值
        System.out.println("i++ : " + i++);

        System.out.println("i : " + i);

        System.out.println("--i : " + --i);
        System.out.println("i-- : " + i--);
        System.out.println("i : " + i);
    }

    /*output
    i : 1
    ++i : 2
    i++ : 2
    i : 3
    --i : 2
    i-- : 2
    i : 1
     */
}
