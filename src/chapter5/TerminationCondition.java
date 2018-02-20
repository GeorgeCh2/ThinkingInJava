package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);
        System.gc();
    }

    /*output
    Error: checked out
     */
}
