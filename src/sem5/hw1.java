package sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> phoneBook = new HashMap<>();
        //основа телефонной книги
        ArrayList<String> list = new ArrayList<>();
        list.add("89265356855");
        list.add("85465557788");
        phoneBook.put("кукин", list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("88569997744");
        list2.add("89035556263");
        phoneBook.put("дулин", list2);
        System.out.println(phoneBook);
        //добавить контакт
        String name = getName();
        phoneBook.put(name, getPhoneNumbers());
        System.out.println("имя " + name + " добавленно!");
        //вывести список контактов
        System.out.println(phoneBook);
        //удалить контакт
        deleteContact(phoneBook);
        System.out.println("удален!");
        System.out.println(phoneBook);
    }

    static String getName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Имя : ");
        String name = iScanner.nextLine();
        return name;
    }

    static ArrayList<String> getPhoneNumbers() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Количество номеров : ");
        int n = iScanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (count < n) {
            Scanner yScanner = new Scanner(System.in);
            System.out.printf("Введите " + (count+1) + " телефон: ");
            String i = yScanner.nextLine();
            list.add(i);
            count++;
        }
        return list;
    }

    static HashMap<String,ArrayList<String>> deleteContact(HashMap<String,ArrayList<String>> phoneBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите для удаления имя: ");
        String name = iScanner.nextLine();
        phoneBook.remove(name);
        return phoneBook;
    }
}
