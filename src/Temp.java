import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter 5 numbers");
        int number = 0;
        String name = null;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter marks");
            number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter name");
            name = scanner.nextLine();
        }
        System.out.println("number = " + number);
        System.out.println("name = " + name);
    }
}
