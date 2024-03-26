package FunctionalProgramming.InterfaceApproach;

import FunctionalProgramming.Apple;

public class RedApple implements ApplePredicate {

    public RedApple() {
    }


    @Override
    public boolean test(Apple apple) {

        return apple.getColor( ).equals("red");
    }
}
