import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int month;

        System.out.println("Input your birth month [1-12]");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();

        if(month >= 1 & month <= 12) {
            System.out.println("Your birth month is " + month);
        }
        else{
            System.out.println("You entered " + month + " which is out of the valid range.");
        }
    }

}