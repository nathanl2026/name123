import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter who you think the goat is:");
        String theGoat = scanner.nextLine();
        System.out.println(theGoat + " is not the greatest of all time.");
    }
}