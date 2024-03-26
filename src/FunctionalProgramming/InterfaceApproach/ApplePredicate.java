package FunctionalProgramming.InterfaceApproach;

import FunctionalProgramming.Apple;

public interface ApplePredicate {


    boolean test(Apple apple);

    // passing the whole object so that I can manipulate any data of apple I want in implementation


}
