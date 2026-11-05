import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 4, 6, 3, 0, 8, 7, 9, 10};

        System.out.print("Search for? ");
        int search = Integer.parseInt(scanner.nextLine());

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(search + " was not found.");
        } else {
            System.out.println(search + " is at index " + index + ".");
        }
    }
}