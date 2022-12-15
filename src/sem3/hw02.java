package sem3;

import java.util.ArrayList;
import java.util.Arrays;

public class hw02 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,142,180,53,122,5,7,9,5,6,44,32,7,3,8,7,25,456,589,14,58,66,54,9));   // чтобы использовать add удалить из скобок !
//        array.add(45);
//        array.add(18);
//        array.add(3);
//        array.add(83);
//        array.add(12);
//        array.add(5);
//        array.add(27);
//        array.add(38);

        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if ((x%2) == 0) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);

    }

}
