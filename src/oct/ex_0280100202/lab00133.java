package oct.ex_0280100202;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lab00133 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(52);
        marks.add(55);
        marks.add(59);
        System.out.println(marks);

        Collections.sort(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
