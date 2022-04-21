import java.io.IOException;
import java.util.Scanner;

public class Sat_Sun {
    int Cname;
    int Id;
    int dname;
    int y_n;
    Sat_Sun() throws IOException {
        System.out.println("1: Saturday\n2: Sunday");
        int day;
        Scanner ss= new Scanner(System.in);
        Scanner in= new Scanner(System.in);
        day= ss.nextInt();
        if(day==1){
            System.out.println("1. Yoga");
            System.out.println("2. Zumba");
            System.out.println("3. Aquacise");
            System.out.println("Enter the lesson No you want to book :");
            Cname = in.nextInt();

            switch (Cname) {
                case 1:
                    Id+=1;
                    System.out.println("Booking confirmed in Yoga!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                    break;
                case 2:
                    Id+=2;
                    System.out.println("Booking confirmed in Zumba!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

                    break;
                case 3:
                    Id+=3;
                    System.out.println("Booking confirmed in Aquacise!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

                    break;


            }
        }
        else if(day==2){

            System.out.println("1. Box");
            System.out.println("2. Fit");
            System.out.println("3 Body Blitz");
            System.out.println("Enter the lesson No you want to book :");
            dname = in.nextInt();

            switch (dname) {
                case 1:
                    Id+=4;
                    System.out.println("Booking confirmed in Box!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

                    break;

                case 2:
                    Id+=5;
                    System.out.println("Booking confirmed in Fit!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

                    break;
                case 3:
                    Id+=6;
                    System.out.println("Booking confirmed in Body Blitz!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");

            }  }



        new Repeat();
    }
}
