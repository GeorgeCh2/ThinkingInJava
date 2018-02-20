package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }
    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args){
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }

    /*output
    Inside main()
    Mug(1)
    Mug(2)
    mug1 & mug2 initialized
    Mugs()
    new Mugs() completed
    Mug(1)
    Mug(2)
    mug1 & mug2 initialized
    Mugs(int)
    new Mugs(1) completed
     */
}
