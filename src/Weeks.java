    import java.util.Scanner;


    /*The purpose of this program is to compute the value of days, hours, minutes and seconds by a user input
      in number of weeks.

      Authors: Anthony Wright & Kyran Baker
     */
public class Weeks {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Please enter number of weeks:" );
        int numberOfWeeks = input.nextInt();
        int days = numberOfWeeks * 7;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;




        //Number of Days
        System.out.println("Days " + days);


        //Number of Hours
        System.out.println("Hours: " + days * hours);

        //Number of Minutes
        System.out.println("Minutes: " + days * hours * minutes);

        // Number of Seconds
        System.out.println("Seconds: " + days * hours * minutes * seconds);




    }





}
