package TestOne;

import java.util.Scanner;


public class Calculator {
    protected int displayInfo(int x, int y) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: \nСложение - 1, вычитание - 2, умножение - 3, деление - 4");
        int operation = in.nextInt();
        switch (operation) {
            case 1:
                int result = x + y;
                    return result;
            case 2:
                result = x - y;
                return result;
            case 3:
                result = x * y;
                return result;

            case 4:
                result = x / y;
                return result;

            default:
                System.out.println("Операция не найдена");
        }
        return -1;
    }

}
