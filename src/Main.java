import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите зарплату: ");
        double wages = scan.nextInt();

        System.out.print("Введите срок работы: ");
        int term = scan.nextInt();
        scan.close();

        double new_wages;

        double growth = 0;

        if (term > 0 && term < 3) {
            growth = 0.1;
        } else if (term > 3) {
            growth = 0.2;
        }

        new_wages = wages + (wages * growth);

        if (new_wages < 4000) {
            new_wages += 1000;
        } else {
            new_wages += 500;
        }

        System.out.println("Новая зарплата: " + new_wages);
    }
}