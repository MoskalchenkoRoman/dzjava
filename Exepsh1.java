import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exepsh1 {
    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     boolean user = true;

    //     while (user==true){
    //         System.out.print("Введите дробное число: ");
    //         String num = sc.nextLine();
    //         try {
    //             float floatNum = Float.parseFloat(num);
    //             user = false;
    //             System.out.println("Ваше число: " + floatNum);
    //         } catch (NumberFormatException e) {
    //             System.out.println("Введённое число не дробное! \n Повторите ввод:");
    //         }
    //     }
    // }

    // public static void main(String[] args) throws Exception {
    //     try {
    //         int a = 90;
    //         int b = 3;
    //         if (b != 0) {
    //             System.out.println(a / b);
    //         }
    //         printSum(23, 234);
    //         int[] abc = {1, 2};
    //         int index = 3;
    //         if (index >= 0 && index < abc.length) {
    //             abc[index] = 9;
    //         }
    //     } catch (NullPointerException ex) {
    //         System.out.println("Указатель не может указывать на null!");
    //     } catch (IndexOutOfBoundsException ex) {
    //         System.out.println("Массив выходит за пределы своего размера!");
    //     } catch (Throwable ex) {
    //         System.out.println("Что-то пошло не так...");
    //     }
    // }

    // public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    //     System.out.println(a + b);
    // }

    public static void main(String[] args) {
        space();
    }


    public static void space() {
        System.out.print("Введите данные: ");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Вы не ввели никаких данных");
        }
    }
}
