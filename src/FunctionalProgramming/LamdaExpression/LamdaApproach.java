package FunctionalProgramming.LamdaExpression;

import FunctionalProgramming.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaApproach {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 10),new Apple("red",32.90),
                new Apple("green", 32.12), new Apple("blue",32.12));

      List<Apple> greenApple =  apples.stream()
                                      .filter(apple -> apple.getColor().equals("green"))
                                       .collect(Collectors.toList());

        System.out.println(greenApple);





    }

}
