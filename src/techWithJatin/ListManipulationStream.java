package techWithJatin;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulationStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 22, 32, 123, null, 5);
        System.out.println(list);

       List<Integer> finalValue= list.stream().filter(i-> Objects.nonNull(i)).
               filter(i->i.toString().startsWith("1")).
                collect(Collectors.toList());
        System.out.println(finalValue);
    }
}
