import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number_1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number_2 = scanner.nextInt();

        System.out.println("Введите код команды:");
        int сommandСode = scanner.nextInt();

        switch (сommandСode) {
            case 1:
                System.out.println(number_1 + number_2);
                break;
            case 2:
                System.out.println(number_1 - number_2);
                break;
            case 3:
                System.out.println(number_1 * number_2);
                break;
            case 4:
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
