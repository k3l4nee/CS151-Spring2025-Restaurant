import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant("House Zhong", "1 Washington Sq, San Jose, CA 95192", "10am to 10pm", "804-737-1111", 150);
        Options.showWelcomeOptions(sc);
        sc.close();
    }
}