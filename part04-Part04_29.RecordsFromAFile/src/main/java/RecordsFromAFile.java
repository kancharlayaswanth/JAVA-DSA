import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> records = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                records.add(line);
            }

            for (String record : records) {
                System.out.println(record);
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}