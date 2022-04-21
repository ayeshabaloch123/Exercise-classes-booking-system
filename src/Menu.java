import java.io.IOException;
import java.util.Scanner;
public class Menu {

    private static int choice;
    // Main Class from which our System starts
// Menu class to display the 5 functionalities of the System

    Menu() throws IOException {


        System.out.println("-----------------------------------");
        System.out.println("|   BOOKING  MANAGEMENT  SYSTEM    |");
        System.out.println("-----------------------------------");

        System.out.println("1. Book a group exercise lesson");
        System.out.println("2. Change a booking");
        System.out.println("3. Attend a lesson");
        System.out.println("4. Monthly lesson report");
        System.out.println("5. Monthly champion exercise report");
        System.out.println("6. Exit ");
// What thing you want to do enter choice

        System.out.println("-----------------------------------");
        System.out.println("|   choose option: [1/2/3/4/5/6]   |");
        System.out.println("------------------------------------");


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice :");
        choice= in.nextInt();
        switch (choice) {
            case 1:

                try{
                    new Booking();
                }
                catch(Exception e){

                }
                break;
            case 2:
                new Change_Booking()
                ;
                break;
            case 3:
                new Attend_lesson();
                break;
            case 4:
                new Monthly_Report();
                break;
            case 5:
                new Champion();
                break;
            case 6:
                System.exit(0);
        }

    }
    public static void main(String[] args) throws IOException {

        new Menu();

    }

}
