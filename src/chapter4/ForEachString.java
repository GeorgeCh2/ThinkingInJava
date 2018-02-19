package chapter4;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class ForEachString {
    public static void main(String[] args){
        //任何返回一个数组的方法都可以使用foreach
        for (char c : "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }

    /*output
    A n   A f r i c a n   S w a l l o w
     */
}
