package sem4;

import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(78);
        intList.add(5);
        intList.add(19);
        intList.add(88);
        intList.add(3);
        intList.add(14);

        System.out.println(intList);

        sort(intList);
        System.out.println(intList);
    }

    static LinkedList<Integer> sort(LinkedList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < list.size()/2; i++) {
            temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set((list.size()-1-i), temp);
        }
        return list;
    }
}
