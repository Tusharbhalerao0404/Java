//(1)Write a program to print the following pattern
//****
//*** 
//**
//*
/*public class Practice_13_16{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){

                System.out.print("*");

            } System.out.println();
        }
    }
}

//(2)Write a program to sum first n even numbers using while loop (2n+1 Odd no) (2n 2*n Even no)
//12
public class Practice_13_16{
    public static void main(String[] args) {
        int sum=0;
        int n=4;
        for(int i=0;i<n;i++){

            sum = sum + (2*i);

        }
          System.out.println("Sum of even number is:"); // 0_2_4_6=12
          System.out.println(sum);
        
    }
}

//(3)Write a program to print multiplication table of a given number n.
//4 8 12 16 20 24 28 32 36 40 
public class Practice_13_16{
    public static void main(String[] args) {
        
        int no=4;
        for(int i=1;i<=10;i++){
            System.out.print(no*i+" ");
        }
    }
}

//(4)Write a program to print multiplication table of 10 in reverse order
//100 90 80 70 60 50 40 30 20 10 
public class Practice_13_16{
    public static void main(String[] args) {
        
        int no=10;
        for(int i=10;i>=1;i--){
            
            System.out.print(no*i+" ");
           
        }
    }
}

//(5)Write a program to find factorial of a given number using (for loop)
//120 
public class Practice_13_16{
    public static void main(String[] args) {
        
        int no=5;
        int factorial=1;
        for(int i=1;i<=no;i++){

            factorial *=i;
        } System.out.println(factorial+" ");
    }
}

//(6)Write a program to find factorial of a given number 5 using (while loop)
//120
public class Practice_13_16{
    public static void main(String[] args) {
        
        int no=5;
        int i=1;
        int a=1;
        while(i<=no){
            a *=i;
            i++;
        }System.out.println(a);
    }
}*/

//(7)Write a program to calculate the sum of the numbers occuring in the multiplication table of 8.
//440
public class Practice_13_16{
    public static void main(String[] args) {
        
        int no=8;
        int sum=0;
        for(int i=1;i<=10;i++){
          
            sum += no*i;
        } System.out.print(sum);
    }
}


