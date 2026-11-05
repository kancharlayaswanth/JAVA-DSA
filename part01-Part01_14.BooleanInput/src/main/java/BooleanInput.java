import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String input = scanner.nextLine();

        boolean result = Boolean.valueOf(input);

        System.out.println("True or false? " + result);
    }
}