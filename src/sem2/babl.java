package sem2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class babl {
    public static void main(String[] params) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер масива : ");
        int a = in.nextInt();
        int[] array = randMas(a);
        System.out.println("Созданный массив : ");
        System.out.println(arrayToString(array));
        bubbleSort(array);
        System.out.println("Отсортированный массив : ");
        System.out.println(arrayToString(array));
    }

    public static void bubbleSort(int[] array) throws IOException {
        Logger logger = Logger.getLogger(babl.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                logger.addHandler(fh);
                XMLFormatter xml = new XMLFormatter();
                fh.setFormatter(xml);
                logger.info("все ок");
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append(")");
        return sb.toString();
    }
    public static int[] randMas(int a){
        Random rand = new Random();
        int [] mas = new int[a];
        for (int i = 0; i < a; i++) {
            mas[i] = rand.nextInt(100);

        }
        return mas;
    }
}
