//(1) What will be the output of this program:
//int a = 10; 
//if(a==11)
//    System.out printen ("I am 11);
//else
//      System.out printen ("I am not 11);

/*public class Practice_11_12{
    public static void main(String[] args) {
        
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
    }
}

//Write a program to find out whether a student is pass or fail: if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjerts and take marks as an input from the user
import java.util.Scanner;
public class Practice_11_12{
        public static void main(String[] args) {
            
            int m1,m2,m3;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter M1 mark:");
            m1 = sc.nextInt();

            System.out.println("Enter m2 mark:");
            m2 = sc.nextInt();

            System.out.println("Enter m3 mark:");
            m3 = sc.nextInt();

            float avg = (m1+m2+m3)/3.0f;
            System.out.println("Overall percentage:" + avg);
            if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
                System.out.println("Congratulations");
            }
            else{
                System.out.println("Does not congratulations");
            }
                                  
        }
}

//Write a Java program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday ... and so on!]

import java.util.Scanner;

public class  Practice_11_12{
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            
                case 3:
                System.out.println("Wednesday");
                break;
            
            default:
                System.out.println("Wrong no");
                       
        }
        
    }
}

import java.util.Scanner;

public class  Practice_11_12{
    public static void main(String[] args) {
        System.out.println("Enter no:");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch (day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Teusday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}*/
