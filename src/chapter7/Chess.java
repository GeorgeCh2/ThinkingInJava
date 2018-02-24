package chapter7;

import static chapter6.Print.*;

public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }

    /*otput
    Game constructor
    BoardGame constructor
    Chess constructor
     */
}
