import java.util.Scanner;

public class IT24101125Lab7Q1B
  {
    public static void main (String[]arg)
      {
	Scanner input =new Scanner(System.in);

	int num1,num2,num3,num4;
	double ave;
	int count=1;
	int totalstudent=3;

	while(count<=totalstudent)
       {
	 System.out.println("Student : "+ count++);
	 System.out.print("Enter mark : ");
	 num1 =input.nextInt();
	 num2 =input.nextInt();
	 num3 =input.nextInt();
	 num4 =input.nextInt();

	 ave=(num1+num2+num3+num4)/4.0;

	 System.out.println("Average is :"+ave);
		if(ave<=49){System.out.println("overall grade is : Fail");}
		else if(ave<=74){System.out.println("overall grade is : Credit");}
		else if(ave<=100){System.out.println("overall grade is : Distinction");}
	
	 System.out.println();
        }
      }	
   }