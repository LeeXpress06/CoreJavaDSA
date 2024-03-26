package FunctionalProgramming.InterfaceApproach;

import FunctionalProgramming.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
                new Apple("green", 32.12), new Apple("blue",32.12));

        ApplePredicate applePredicate = new RedApple();
        System.out.println(appleWithPredicate(apples, applePredicate));

    }
    public static List<Apple> appleWithPredicate(List<Apple>inventory, ApplePredicate applePredicate ){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){

            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
       return result;
    }

}
