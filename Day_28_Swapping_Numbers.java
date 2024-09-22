import java.util.Scanner;
public class Day_28_Swapping_Numbers {
    public static void main (String[] args){
        
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter no1:");
      int no1 = obj.nextInt();

      System.out.println("Enter no2:");
      int no2 = obj.nextInt();
        
        int temp = no1;
        no1=no2;
        no2=temp;
        System.out.println("Swapping no1 & no2: "+no1+","+no2);
    }
}
