package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}
