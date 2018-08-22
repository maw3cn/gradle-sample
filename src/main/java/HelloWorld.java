import org.apache.commons.collections4.IteratorUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Iterator<String> iter = list.iterator();

        /*
            Example using IteratorUtils, an apache commons utility that is not built into java
            to show an example of how gradle can be used. The example takes an iterator
            and finds the index of the first string that matches the given predicate.
            In this case, it finds the first string equal to "b"!
         */
        System.out.println(IteratorUtils.indexOf(iter, s -> s.equals("b")));

    }
}
