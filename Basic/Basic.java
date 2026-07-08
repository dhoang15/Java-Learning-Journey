import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        //Write a program to print your name, date of birth, and student ID from the keyboard
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name" + name);
        int Date = sc.nextInt();
        System.out.println("Date" + Date);
        int StudentID = sc.nextInt();
        System.out.println("StudentID" + StudentID);
        //Write a program to compute the area of a triangle with a height and base provided by the user.
        double base = sc.nextInt();
        double height = sc.nextInt();
        System.out.println("Area of Triangle is " + 0.5*base*height);
        // Write a function to return the remainder of a division.
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Remainder is " + a%b);
        sc.close();
    }
}