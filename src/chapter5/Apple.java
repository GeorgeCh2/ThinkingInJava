package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}
