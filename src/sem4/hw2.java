package sem4;

import java.util.LinkedList;

public class hw2 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(78);
        intList.add(5);
        intList.add(19);
        enqueue(intList, 88);
        enqueue(intList, 12);
        enqueue(intList, 76);
        System.out.println(intList);
        System.out.println("Первый элемент " + dequeue(intList) + " удален: " + intList);
        System.out.println("Элемент ставший первым : " + first(intList));
        System.out.println("Элемент " + dequeue(intList) + " удален: " + intList);
        System.out.println("Первый элемент: " + first(intList));
    }
    static LinkedList<Integer> enqueue(LinkedList<Integer> list, Integer num) {
        list.add(num);
        return list;
    }
    static Integer dequeue(LinkedList<Integer> list) {
        Integer firstNum = list.get(0);
        list.remove(0);
        return firstNum;
    }
    static Integer first(LinkedList<Integer> list) {
        Integer firstNum = list.get(0);
        return firstNum;
    }
}
