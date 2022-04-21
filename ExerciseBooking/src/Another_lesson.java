import java.io.IOException;
import java.util.Scanner;
public class Another_lesson {
    int Cname;
    int Id=0;
    int type = 0;
    int y_n;

    Another_lesson() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Yoga");
        System.out.println("2. Zumba");
        System.out.println("3. Aquacise");
        System.out.println("4. Box");
        System.out.println("5. Fit");
        System.out.println("6 Body Blitz");

        System.out.println("Enter the lesson No you want to book :");
        Cname =in.nextInt();

        switch(Cname)

        {
            case 1:
                Id++;
                System.out.println("Booking confirmed in Yoga!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

                break;
            case 2:
                Id++;
                System.out.println("Booking confirmed in Zumba!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                break;
            case 3:
                Id++;
                System.out.println("Booking confirmed in Aquacise!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                break;
            case 4:
                Id++;
                System.out.println("Booking confirmed in Box!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                break;

            case 5:
                Id++;
                System.out.println("Booking confirmed in Fit!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                break;
            case 6:
                Id++;
                System.out.println("Booking confirmed in Body Blitz!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        new Repeat();




    }}
