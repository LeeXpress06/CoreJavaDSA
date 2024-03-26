package FunctionalProgramming.PassingBehaviour;

import FunctionalProgramming.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorAndWeight {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
                new Apple("green", 32.12), new Apple("blue",32.12));

        // find any apple which is green and weigh more than 10;

        System.out.println(anyColorAndWeight(apples, "green", 12));




    }

   public static List<Apple> anyColorAndWeight(List<Apple> inventory, String color,int weight){

            List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getColor().equals(color) && apple.getWeight() > weight){
              result.add(apple);
            }
        }
       return result;

   }


}
