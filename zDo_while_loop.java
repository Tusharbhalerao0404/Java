
//(1)WAP to print 1 to 10 numbers. 
/*public class zDo_while_loop {
    public static void main(String[] args) {
        
        int i=1;
        do{
            System.out.print(i+" ");//1 2 3 4 5 6 7 8 9 10 
            i++;
        }while(i<=10);
    }
}

//(2)WAP to print 10 to 1 numbers. 
public class zDo_while_loop {
    public static void main(String[] args) {
        
        int i=10;
        do{
            System.out.print(i+" ");//10 9 8 7 6 5 4 3 2 1
            i--;
        }while(i>=1);
    }
}

//(3)WAP to print 2,4,6,8.....20.
public class zDo_while_loop {
    public static void main(String[] args) {
        
        int i=2;
        do{
            System.out.print(i+" ");//2 4 6 8 10 12 14 16 18 20 
            i+=2;
        }while(i<=20);
    }
}

//(4)WAP to print even numbers between 1 to 100.
public class zDo_while_loop {
    public static void main(String[] args) {
        
        int i=1;
        do{
            System.out.print(i+" ");//1 2 3 --- 99 100
            i++;
        }while(i<=100);
    }
}

//(5)WAP to print even numbers between 50 to 1.
public class zDo_while_loop {
    public static void main(String[] args) {
        
        int i=50;
       do{
            System.out.print(i+" ");//50 49 4--- 3 2 1
            i--;
        } while(i>=1);
    }
}

//(6)WAP to print odd numbers between 1 to 30.
public class zDo_while_loop {
    public static void main(String[] args) {
        
       int i=1;
       do{
        System.out.print(i+" ");//1 3 5 7 9 11 13 15 17 19 21 23 25 27 29
        i+=2;
       }while(i<=30);
    }
}

//(7)WAP to print 1 to N numbers.
import java.util.Scanner;
public class zDo_while_loop {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = obj.nextInt();
       
        int i=1;
       do{
            System.out.print(i+" ");
            i++;
        } while(i<=no);
    }
}

//(8)WAP to print N to 1 numbers.
import java.util.*;
public class zDo_while_loop {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();
       
        int i=no;
        do{
            System.out.print(i+" ");
            i--;
            }while(i>=1);
    }
}*/

//(9)WAP to print your name 10 times.
public class zDo_while_loop {
    public static void main(String[] args) {
        
       int i=1;
       do{
        System.out.print(i+": Tushar"+"\n");
        i++;
       }while(i<=10);
    }
}