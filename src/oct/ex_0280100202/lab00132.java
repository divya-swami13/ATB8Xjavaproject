package oct.ex_0280100202;

import java.util.ArrayList;
import java.util.List;

public class lab00132 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));
        System.out.println(list.isEmpty());

        System.out.println("-----");

        for (Object O :list) {
            System.out.println(O);
        }

    }
}
