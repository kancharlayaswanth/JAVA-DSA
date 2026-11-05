import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}