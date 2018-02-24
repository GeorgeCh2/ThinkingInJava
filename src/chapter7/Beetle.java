package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args){
        print("Beetle constructor");
        Beetle b = new Beetle();
    }

    /*output
    static Insect.x1 initialized
    static Beetle.x2 initialized
    Beetle constructor
    i = 9, j = 0
    Beetle.k initialized
    k = 47
    j = 39
     */
}
