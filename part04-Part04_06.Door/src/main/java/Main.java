public class Main{

    public Main() {
    }

    public void knock() {
        System.out.println("Who's there?");
    }

    public static void main(String[] args) {
        Main alexander = new Main();

        alexander.knock();
        alexander.knock();
    }
}