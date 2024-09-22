//0 1 2 3 4 5
/*public class Day_14_do_while_loop {
    public static void main(String [] args){

        int i=0;
        do { 
            System.out.print(i +" ");
            i++;
        } while(i<=5);
    }
}

//2 4 6 8 10 12 14 16 18 20
public class Day_14_do_while_loop{
    public static void main(String[] args) {
        int a=2;
        do { 
            System.out.print(a +" ");
            a=a+2;
        } while(a<=20);
    }
}

//
import java.util.Scanner;

public class Day_14_do_while_loop {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = obj.nextInt();

        int i = 0;

        do { 
            System.out.print(i + " ");  
            i++;  
        } while (i <= no);  
        obj.close();  
    } 
}

//10 9 8 7 6 5 4 3 2 1 0
public class Day_14_do_while_loop {
    public static void main(String[] args) {
        
        int i = 10;
        do { 
            System.out.print(i + " ");  
            i--;  
        } while (i >= 0);  
    }
}*/

//10 9 8 7 6 5 4 3 2 1 0
import java.util.*;
public class Day_14_do_while_loop{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no:"); //10
        int no = ob.nextInt();

        int i=no;

        do { 
            System.out.print(i +" ");
            i--;
        } while (i>=0);
    }
}

    

