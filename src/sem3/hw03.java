package sem3;

import java.util.ArrayList;
import java.util.Arrays;

public class hw03 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,5,7,9,5,6,7,3,8,7,25));  // чтобы использовать add удалить из скобок !
//        array.add(45);
//        array.add(18);
//        array.add(3);
//        array.add(83);
//        array.add(12);
//        array.add(5);
//        array.add(27);
//        array.add(38);

        System.out.println(array);
        Integer max = array.get(0);
        Integer min = array.get(0);


        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        System.out.println("Максимальный элемент: " + max);

        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        System.out.println("Минимальный элемент: " + min);

        System.out.println("Среднее значение : " + calculateAverage(array));

    }

    private static double calculateAverage(ArrayList<Integer> array) {
        long sum = 0;
        for (Integer mark : array) {
            sum += mark;
        }
        return array.isEmpty()? 0: 1.0*sum/array.size();
    }


}
