/*import java.util.Scanner;

public class Day_12_Switch_Case{
    public static void main(String[] args) {
        
        int age;
        System.out.println("Enter no:");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();

        switch (age){

            case 50:
                System.out.println("One");
                break;
            case 60:
                System.out.println("Two");
                break;
            
            case 80:
                System.out.println("Three");
                break;
            
            default:
                System.out.println("Wrong no");

        }
    }
}


import java.util.*;
public class Day_12_Switch_Case{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();
        
        int op=1;

        switch(op){

            case 1:
                if(no%2==0){
                    System.out.println("Even no");
                }
                else{
                    System.out.println("Odd no");
                }
                break;
        }
    }
}
import java.util.*;
public class Day_12_Switch_Case{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no1:");
        int no1 = obj.nextInt();
        System.out.println("Enter no2");
        int no2 = obj.nextInt();

        int op=1;

        switch(op){

            case 1:{
                System.out.println("Addition:"+(no1+no2));
                break;
            }
            case 2:{
                System.out.println("Substraction:"+(no1-no2));
                break;
            }
            case 3:{
                System.out.println("Multiplication:"+(no1*no2));
                break;
            }
            case 4:{
                System.out.println("Division:"+(no1/no2));
                break;
            }
            default:{
                System.out.println("Invalid");
            }
        }
    }
}*/


import java.util.Scanner;

public class Day_12_Switch_Case{
    public static void main(String[] args) {
        
        String Name;
        System.out.println("Enter name:");
        Scanner obj = new Scanner(System.in);
        Name = obj.nextLine();

        switch (Name){

            case "Tushar":
                System.out.println("One");
                break;
            
            case "Kushal":
                System.out.println("Two");
                break;

            case "Sai":
                System.out.println("Three");
                break;

           default:
            System.out.println("Wrong name");
        }
        
    }
}
   
