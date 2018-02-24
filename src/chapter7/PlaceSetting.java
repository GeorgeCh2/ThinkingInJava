package chapter7;

import static chapter6.Print.*;

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }

    /*output
    Custom constructor
    Utensil constructor
    Spoon constructor
    Utensil constructor
    Fork constructor
    Utensil constructor
    Knife constructor
    Plate constructor
    DinnerPlate constructor
    PlaceSetting constructor
     */
}
