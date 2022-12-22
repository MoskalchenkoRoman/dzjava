package sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class hw2 {
    public static void main(String[] args) {
        HashMap<String,String> names = new HashMap<>();
        names.put("Иванов", "Иван");
        names.put("Петрова", "Светлана");
        names.put("Белова", "Кристина");
        names.put("Мусина", "Анна");
        names.put("Крутова", "Анна");
        names.put("Юрин", "Иван");
        names.put("Лыков", "Петр");
        names.put("Чернов", "Павел");
        names.put("Чернышов", "Петр");
        names.put("Федорова", "Мария");
        names.put("Светлова", "Марина");
        names.put("Савина", "Мария");
        names.put("Рыкова", "Мария");
        names.put("Лугова", "Марина");
        names.put("Владимирова", "Анна");
        names.put("Мечников", "Иван");
        names.put("Петин", "Петр");
        names.put("Ежов", "Иван");
        System.out.println(names);

        ArrayList<String> listNames = new ArrayList<>(names.values());

        HashMap<String,Integer> mapNames = new HashMap<>(sortNames(listNames));

        printSortNames(mapNames);
    }

    static HashMap<String,Integer> sortNames(ArrayList<String> listNames) {
        HashMap<String,Integer> mapNames = new HashMap<>();
        String name = listNames.get(0);
        int count = 0;
        int index = 0;
        while (index < (listNames.size()-1)) {
            for (int i = 0; i < listNames.size(); i++) {
                if (listNames.get(i) == name) {
                    count++;
                }
            }
            mapNames.putIfAbsent(name,count);
            index++;
            name = listNames.get(index);
            count = 0;
        }
        return mapNames;
    }

    static void printSortNames(HashMap<String,Integer> mapNames) {
        ArrayList<Integer> listCount = new ArrayList<>(mapNames.values());
        Integer max = 0;
        for (int i = 0; i < listCount.size(); i++) {
            if (listCount.get(i) > max) {
                max = listCount.get(i);
            }
        }

        while (max != 0) {
            for (String key : mapNames.keySet()) {
                Integer value = mapNames.get(key);
                if (Objects.equals(value, max)) {
                    System.out.println(" " + key + " = " + value + ";");
                }
            }
            max--;
        }
    }
}
