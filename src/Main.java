import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("Сумма от 1 до введенного числа : ");
        for(int i = 1; i < n; i++) {
            sum += i;
        }
        sum += n;
        System.out.println(n + "=" + sum );

        System.out.print("Факториал этого числа : ");
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        System.out.print(n + "=" + result);
    }
}