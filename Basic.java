import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name" + name);
        int Date = sc.nextInt();
        System.out.println("Date" + Date);
        int StudentID = sc.nextInt();
        System.out.println("StudentID" + StudentID);
        sc.close();
    }
    }