import java.io.*;
import java.util.Scanner;

public class Monthly_Report {
    Monthly_Report() throws IOException {
        int month;
        int avgRate = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number :");
        month= in.nextInt();
        int ll = 0;
        File file = new File(
                "C:\\Users\\Ayesha\\IdeaProjects\\ExerciseBooking\\log.txt");


        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
        ll++;

        System.out.println("No of students: "+ll);
        System.out.println("Average rating is: 4."+avgRate);
        new Menu();
    }
}