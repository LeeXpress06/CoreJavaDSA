package FunctionalProgramming.InterfaceApproach;

import FunctionalProgramming.Apple;

public class GreenApple implements ApplePredicate{

    public GreenApple() {
    }

    @Override
    public boolean test(Apple apple) {

        return apple.getColor().equals("green");
    }
}
