import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (String line : java.nio.file.Files.readAllLines(Paths.get(file))) {
            String[] parts = line.split(",");

            String homeTeam = parts[0];
            String visitingTeam = parts[1];
            int homePoints = Integer.parseInt(parts[2]);
            int visitingPoints = Integer.parseInt(parts[3]);

            if (homeTeam.equals(team)) {
                games++;

                if (homePoints > visitingPoints) {
                    wins++;
                } else {
                    losses++;
                }
            }

            if (visitingTeam.equals(team)) {
                games++;

                if (visitingPoints > homePoints) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}