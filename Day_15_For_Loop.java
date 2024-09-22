//0 1 2 3 4 5 6 7 8 9 10
/*public class Day_15_For_Loop {
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++){
            System.out.print(i +" ");
        }
    }
    
}

//4 8 12 16 20 24 28 32 36 40
public class Day_15_For_Loop{
    public static void main(String[] args) {
        
        int no=4;
        for(int i=1;i<=10;i++){
            System.out.print(no*i+" ");
        }
    }
}

//2 4 6 8 10 12 14 16 18 20 (Even)
public class Day_15_For_Loop{
    public static void main(String[] args) {
        
        int no=20;
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

//1 3 5 7 9 11 13 15 17 19 (Odd)
public class Day_15_For_Loop{
    public static void main(String[] args) {

        for(int i=1;i<=20;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}

import java.util.Scanner;
public class Day_15_For_Loop{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();

        for(int i=0;i<=no;i++){
            System.out.print(i +" ");
        }
        obj.close();
    }
}

//10 9 8 7 6 5 4 3 2 1 0 
public class Day_15_For_Loop{
    public static void main(String[] args) {
        
        for(int a=10;a>=0;a--){
            System.out.print(a +" ");
        }
    }
}*/

import java.util.Scanner;

public class Day_15_For_Loop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); //Reverse string print
        int no = sc.nextInt();

        for (int i = no; i >= 0; i--) {  
            System.out.print(i + " ");  
        }
        
        sc.close();  
    }
}


