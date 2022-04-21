import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
public class Attend_lesson {
    Attend_lesson() throws IOException {

        String review;
        int rating;

        Scanner ss = new Scanner(System.in);

        System.out.println("write the review :");
        review = ss.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mark the rating out of 5 [1/2/3/4/5]:");
        rating = sc.nextInt();



        File log = new File("log.txt");

        try {
            if (!log.exists()) {
                System.out.println("We had to make a new file.");
                log.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(log, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Formatter x = new Formatter();

            bufferedWriter.write(x.format( rating+"\n").toString());

            bufferedWriter.close();


        } catch (IOException e) {
            System.out.println("COULD NOT LOG!!");
        }
        System.out.println("Status: attended");

        new Menu();
    }}

