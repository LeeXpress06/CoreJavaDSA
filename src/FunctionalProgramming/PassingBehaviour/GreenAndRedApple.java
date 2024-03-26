package FunctionalProgramming.PassingBehaviour;

import FunctionalProgramming.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreenAndRedApple {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
                new Apple("green", 32.12), new Apple("blue",32.12));


        // green and red apple
        System.out.println(greenAndRedApple(apples));

    }

    public static List<Apple> greenAndRedApple(List<Apple> inventory){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){

            if(apple.getColor().equals("green") || apple.getColor().equals("red") ){

                result.add(apple);

            }

        }

        return result;

    }



}
