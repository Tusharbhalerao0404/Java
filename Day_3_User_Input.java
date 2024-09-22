import java.util.Scanner;

public class Day_3_User_Input {
    public static void main(String [] args){

        Scanner no = new Scanner(System.in);

        System.out.print("Enter no1:");
        int a = no.nextInt();

        System.out.print("Enter no2:");
        int b = no.nextInt();

        int sum = a + b;
       
        System.out.print("Sum:");
        System.out.print(sum);
    }
    
}
