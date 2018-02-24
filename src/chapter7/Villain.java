package chapter7;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}
