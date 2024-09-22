
//0 1 2 3 4 5 6 7 8 9 10 
/*public class Day_13_While_Loop {
    public static void main(String[] args) {
        
        int i=0;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
    }
    
}

// Infinite output
public class Day_13_While_Loop {
    public static void main(String[] args) {
        
        int i=1;
        while (true){    //ifinite loop  
            System.out.println(i+" Tushar ");
            i++;
        }
    }
    
}
import java.util.Scanner;

public class Day_13_While_Loop{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();

        int i=1;

        while(i<=no){
            System.out.print(i + " ");
            i++;
        }
    }

}

// 1 3 5 7 9  Odd No.
public class Day_13_While_Loop{
    public static void main(String[] args) {
        
        int i=1;

        while(i<=10){
            System.out.print(i +" ");
            i=i+2;
        }
    }
}

import java.util.Scanner;

public class Day_13_While_Loop{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();

        int i=1;

        while(i<=no){
            System.out.print(i + " ");
            i=i+2;
        } obj.close();
    }

}

//10 9 8 7 6 5 4 3 2 1 0 
public class Day_13_While_Loop{
    public static void main(String[] args) {
        
        int a=10;

        while(a>=0){
            System.out.print(a +" ");
            a--;
        }
    }
}*/

//10 9 8 7 6 5 4 3 2 1 0 
import java.util.Scanner;

public class Day_13_While_Loop{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter no:"); //10
        int no = obj.nextInt();

        int i=no;

        while(i>=0){
            System.out.print(i + " ");
            i--;
        } obj.close();
    }

}