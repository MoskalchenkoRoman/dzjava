import java.util.Scanner;

public class dzMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int a = in.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите знак : ");
        String U = sc.nextLine();

        Scanner lo = new Scanner(System.in);
        System.out.print("Введите второе число : ");
        int b = lo.nextInt();

        sc.close();
        System.out.print("Ответ : ");
        if (U.equals("+")) {
            System.out.print(a+b);
        }
        else if (U.equals("-")) {
            System.out.print(a-b);
        }
        else if (U.equals("*")) {
            System.out.print(a*b);
        }
        else if (U.equals("/")) {
            System.out.print(a/b);
        }
    }
}
