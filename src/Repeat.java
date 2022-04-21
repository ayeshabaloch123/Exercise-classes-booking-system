import java.io.IOException;
import java.util.Scanner;
public class Repeat {
    int y_n;
    Repeat() throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to book another lesson enter 1: ");
        y_n=sc.nextInt();

        if(y_n==1){
            new Another_lesson();
        }
        else
            new Menu();
    }

}
