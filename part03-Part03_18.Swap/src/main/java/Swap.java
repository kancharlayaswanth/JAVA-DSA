import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 3, 5, 7, 9};

        for (int number : array) {
            System.out.println(number);
        }

        System.out.println("Give two indices to swap:");

        int index1 = Integer.parseInt(scanner.nextLine());
        int index2 = Integer.parseInt(scanner.nextLine());

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        for (int number : array) {
            System.out.println(number);
        }
    }
}