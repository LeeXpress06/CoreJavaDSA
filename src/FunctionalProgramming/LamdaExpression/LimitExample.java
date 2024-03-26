package FunctionalProgramming.LamdaExpression;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

    public static Integer limitExmethod(List<Integer>integers ){

        return integers.stream()
                .skip(5)
                .reduce((x,y)-> x+y)
                .get();
    }



    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,5,4,4,3);

        System.out.println(limitExmethod(integers));


    // skip --- take last elements
        // limit --- first group


    }
}
