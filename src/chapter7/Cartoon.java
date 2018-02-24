package chapter7;

import static chapter6.Print.*;

public class Cartoon extends Drawing{
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }

    /*output
    Art constructor
    Drawing constructor
    Cartoon constructor
     */
}
