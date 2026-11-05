import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                persons.add(new Person(name, age));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }

        return persons;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = readRecordsFromFile("records.txt");

        for (Person person : persons) {
            System.out.println(person);
        }
    }
} 