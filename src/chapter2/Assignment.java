package chapter2;

/**
 * Create by Intellij Idea.
 * 赋值
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class Assignment {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1:t1.level: " + t1.level + ", t2.Level: " + t2.level);

        t1 = t2;
        System.out.println("2:t1.level: " + t1.level + ", t2.Level: " + t2.level);

        t1.level = 27;
        System.out.println("3:t1.level: " + t1.level + ", t2.Level: " + t2.level);
    }

    /*output
    1:t1.level: 9, t2.Level: 47
    2:t1.level: 47, t2.Level: 47
    3:t1.level: 27, t2.Level: 27
     */
}
