package FunctionalProgramming.PassingBehaviour;

import FunctionalProgramming.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyColour {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
                new Apple("green", 32.12), new Apple("blue",32.12));

        // green color apple
        System.out.println(findAnyColour(apples, "blue"));

    }

    public static List<Apple>  findAnyColour(List<Apple> inventory, String color){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){

            if(apple.getColor().equals(color) ){

                result.add(apple);
            }
        }

        return result;

    }




}
