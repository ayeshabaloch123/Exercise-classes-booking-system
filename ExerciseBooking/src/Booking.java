import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.io.IOException;
import java.lang.*;

public class Booking {
    String name;
    int type;
    int Cname;
    int Id;
    int y_n;
  public  int StuNo;
// Booking Class to book the lessons
    Booking() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        name = in.nextLine();

// timetable checking
        System.out.println("Select way to check Time Table");
        System.out.println("1. Select the day");
        System.out.println("2. Select the exercise name");
        System.out.println("Enter your choice :");
        type = in.nextInt();
        this.no_students(StuNo);


// filing to save the student record.
        File log = new File("log.txt");

        try {
            if (!log.exists()) {
                System.out.println("We had to make a new file.");
                log.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(log, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Formatter x = new Formatter();

            bufferedWriter.write(x.format(name +" ").toString());
//            bufferedWriter.write(x.format(String.valueOf(Id)).toString());
            bufferedWriter.close();

//            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("COULD NOT LOG!!");
        }



        switch (type) {
            case 1:
                new Sat_Sun();
                break;
            case 2:

                System.out.println("1. Yoga");
                System.out.println("2. Zumba");
                System.out.println("3. Aquacise");
                System.out.println("4. Box");
                System.out.println("5. Fit");
                System.out.println("6 Body Blitz");

                System.out.println("Enter the lesson No you want to book :");
                Cname =in.nextInt();

// Switch cases to match the conditions
                switch(Cname)

                {
                    case 1:
                        Id++;
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
                    case 4:
                        Id+=4;
                        System.out.println("Booking confirmed in Box!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                        break;

                    case 5:
                        Id+=5;
                        System.out.println("Booking confirmed in Fit!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                        break;
                    case 6:
                        Id+=6;
                        System.out.println("Booking confirmed in Body Blitz!\n BookingId " + Id + "\n lesson duration: 2 months\n Course price : 100$\nStatus:Booked!");
                        break;
                }


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

        new Repeat();




    }
    public int no_students(int students){
        students++;
        return students;
    }


}
