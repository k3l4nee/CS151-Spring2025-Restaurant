import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Options.showWelcomeOptions(sc);
        sc.close();
    }
}