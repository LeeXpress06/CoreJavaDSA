package FunctionalProgramming.Matches;

import java.util.Arrays;
import java.util.List;

public class AnyMatches {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,5,4,4,3);

          boolean anyMatches = integers.stream().anyMatch(i -> i<10);

          boolean allMatches = integers.stream().allMatch(x -> x<10);
          boolean NoneMatches = integers.stream().noneMatch(y-> y<10);

        System.out.println("anyMatch :  " + anyMatches);
        System.out.println("alleMatch :  " + allMatches);
        System.out.println("NoneMatch :  " + NoneMatches);

    }
}
