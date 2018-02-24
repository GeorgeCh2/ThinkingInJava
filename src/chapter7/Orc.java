package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args){
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }

    /*output
    Orc 12: I'm a Villain and my name is Limburger
    Orc 19: I'm a Villain and my name is Bob
     */
}
