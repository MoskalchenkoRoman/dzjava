package sem2;

import java.util.HashMap;

public class homework01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", "null");

        System.out.println("select * from students where ");
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (value != "null") {
                System.out.print(" " + key + " = " + value + ";");
            }

        }
    }
}
