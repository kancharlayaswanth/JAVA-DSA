import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                names.add(name);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
            return;
        }

        System.out.println("Enter names, an empty line quits.");

        while (true) {
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (names.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}