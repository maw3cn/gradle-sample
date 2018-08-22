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

        System.out.println(IteratorUtils.size(iter));
    }
}
