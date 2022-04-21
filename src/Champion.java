import java.io.IOException;
import java.util.Scanner;

public class Champion {
    Champion() throws IOException {
        int month;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number :");
        month= in.nextInt();
        System.out.println("Exercise name : Yoga\n Total income : 50000$");
        new Menu();
    }
}
