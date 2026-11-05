import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.print("Search for? ");
        int search = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == search) {
                System.out.println(search + " is at index " + i);
            }
        }
    }
}