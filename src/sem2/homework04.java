package sem2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class homework04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double a = in.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите знак : ");
        String U = sc.nextLine();

        Scanner lo = new Scanner(System.in);
        System.out.print("Введите второе число : ");
        double b = lo.nextInt();
        System.out.println("Ответ : " + rez(a, U, b));
        myLog(rez(a, U, b));
        sc.close();
    }

    public static double rez(double a, String U, double b) {
        double res = 0;
        if (U.equals("+")) {
             res = (a +b);
        }
        else if (U.equals("-")) {
            res =(a-b);
        }
        else if (U.equals("*")) {
            res = (a*b);
        }
        else if (U.equals("/")) {
            res = (a/b);
        }
        return  res;
    }
    static void myLog(Double res) {
        Logger logger = Logger.getLogger(homework04.class.getName());
        try {
            FileHandler fh = new FileHandler("log04.txt", true);
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info(res.toString());
            fh.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
