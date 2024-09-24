import java.util.Scanner;

public class IT24101125Lab7Q1A
  {
    public static void main(String[]agrs)
      {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subject Mark 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        int mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        int mark4 = input.nextInt();

        double average = (mark1 + mark2 + mark3 + mark4)/ 4.0;
        System.out.println("Average is : "+ average);

         String grade;
          if (average >= 75 && average >= 100){
            grade = "Distinction";}

          else if (average >= 50 && average <= 74){
            grade = "Credit";}
 
          else {
            grade = "Fail";}

         System.out.println("Overall Grade is : "+ grade);
       }
    }