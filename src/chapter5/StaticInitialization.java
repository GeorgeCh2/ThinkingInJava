package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class StaticInitialization {
    public static void main(String[] args){
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();

        System.out.println("Creating new Cupboard() in main");
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    /*output
    Bowl(1)
    Bowl(2)
    Table()
    f1(1)
    Bowl(4)
    Bowl(5)
    Bowl(3)
    Cupboard
    f1(2)
    Creating new Cupboard() in main
    Bowl(3)
    Cupboard
    f1(2)
    Creating new Cupboard() in main
    f2(1)
    f3(1)
     */
}
