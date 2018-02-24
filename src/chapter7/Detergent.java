package chapter7;

import static chapter6.Print.*;

public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foma() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foma();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }

    /*output
    Cleanser dilute() apply() Detergent.scrub() scrub() foam()
    Testing base class:
    Cleanser dilute() apply() scrub()
     */
}
