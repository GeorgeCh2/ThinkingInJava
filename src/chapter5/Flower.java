package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }
    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        //可以使用this调用构造器，但不能调用两个。构造器调用必须置于最起始处
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Flower x = new Flower();
        x.printPetalCount();
    }

    /*output
    Constructor w/ int arg only, petalCount = 47
    String & int args
    default constructor (no args)
    petalCount = 47 s = hi
     */
}
