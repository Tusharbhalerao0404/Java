//0 1 2 3 4 
/*public class Day_16_Break_Continue {
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++){
            System.out.print(i +" ");
            if(i==4){
                break;
            }
        }
    }
    
}

import java.util.*;

public class Day_16_Break_Continue{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();

        for(int i=0;i<=no;i++){
            System.out.print(i +" ");

            if(no==6){
                break;
            }
        }
    }
}

//0 1 2 3 4 5 
public class Day_16_Break_Continue{
    public static void main(String[] args) {
        
        int i=0;

        while(i<=10){
            System.out.print(i +" ");
            i++;
            if(i==6){
                break;
            }
        }
    }
}

//0 1 2 3 4 5 
public class Day_16_Break_Continue{
    public static void main(String[] args) {
        
        int i=0;

        do { 
            System.out.print(i +" ");
            i++;
            if(i==6){
                break;
            }
        } while(i<=10);
    }
}

//0 5 10 15 20 25 30 35 40 45
import java.util.Scanner;
public class Day_16_Break_Continue{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no"); //99
        int no = obj.nextInt();

        int i=0;
        do { 
            System.out.print(i+" ");
            i=i+5;
            if(i==50){
                break;
            }
        } while (i<=no);
    }
} */

//0 1 2 3 Ending the loop
//5 6 7 8 9 10
public class Day_17_Break_Continue{
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++){
            if(i==4){
                System.out.println("Ending the loop");
                continue;
                                
            }System.out.print(i+" ");

        }
    }
}