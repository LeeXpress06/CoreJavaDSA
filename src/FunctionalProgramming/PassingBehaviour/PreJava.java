package FunctionalProgramming.PassingBehaviour;

import FunctionalProgramming.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreJava{

    public static void main(String[] args) {

       List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
       new Apple("green", 32.12));

        // find a green apple
        System.out.println(greenApple(apples));


    }

    public static List<Apple> greenApple(List<Apple> inventory){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){

            if(apple.getColor().equals("green")){

                result.add(apple);

            }

        }

    return result;

    }


}
