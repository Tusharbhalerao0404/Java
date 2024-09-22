//*
//**
//***
//****
/*public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){

                System.out.print("*");

            } System.out.println();
        }
    }
    
}

//****
//***
//**
//*
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){

                System.out.print("*");

            } System.out.println();
        }
    }
}


//   *
//  **
// ***
//****
public class  Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){

                System.out.print(" ");

            } 
            for(int k=1;k<=i;k++){

                System.out.print("*");

            } System.out.println();
        }
    }
}

// ****
//  ***
//   **
//    *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(" ");

            } 
            for(int k=4;k>=i;k--){

                System.out.print("*");
            } System.out.println();
        }
    }
}

//*
//**
//***
//****
//***
//**
//*
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*");
            } System.out.println();
        }
    }
}

//   *
//  **
// ***
//****
// ***
//  **
//   *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            } 
            for(int k=1;k<=i;k++){

                System.out.print("*");

            } System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){

                System.out.print(" ");
            }
            for(int k=3;k>=i;k--){

                System.out.print("*");
            
            } System.out.println();
        }
    }
} 

//   *
//  * *
// * * *
//* * * *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
       for(int i=1;i<=4;i++){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(" *");
        } System.out.println();
       }
    }
}

//    *
//   * *
//  * * *
// * * * *
public class  Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=4;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }

            } System.out.println();
        }
    }
}

//   *     (Odd) 2*i    
//  ***
// *****
//*******
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

//   **      (Even)  2*i+1
//  ****
// ******
//********
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i+1);k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

// *******
//  *****
//   ***
//    *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            for(int l=3;l>=i;l--){
                System.out.print("*");
            }System.out.println();
        }
    }
}

//   *
//  ***
// *****
//*******
public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {
        
        for (int i=4;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--) {
                System.out.print("*");
            }
            for (int l=3;l>=i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//*******
// *****
//  ***
//   *
//   *
//  ***
// *****
//*******
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=4;i>=1;i--){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){

                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

// *******
//  *****
//   ***
//    *
//    *
//   ***
//  *****
// *******
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            for(int l=3;l>=i;l--){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            for(int l=3;l>=i;l--){
                System.out.print("*");
            }System.out.println();
        }  
    }
}

//     *      *
//     **    **
//     ***  ***
//     ********
//     ***  ***
//     **    **
//     *      *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
            for(int a=3;a>=i;a--){
                System.out.print(" ");
            }
            for(int b=3;b>=i;b--){
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++){
                System.out.print("*");
            }System.out.println();
                                       
        }
        for(int i=1;i<=3;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(" ");
            }
            for(int m=3;m>=i;m--){
                System.out.print("*");
            }System.out.println();
            
        }
                
    }
}

//*
// *
//  *
//   *
//    *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                
                if( i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}  

//****
// ****
//  ****
//   ****
public class  Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

//****
//*  *
//*  *
//****
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        
        for(int i=1;i<=4;i++){
           for(int j=1;j<=4;j++)
            if(i>=2 && j>=2 && i<=3 && j<=3){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }System.out.println();
           
        }
    }
}

//****
//*  *
//*  *
//****
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || j==1 || i==4 || j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
             
        }
    }
}

//    *
//   * *
//  *   *
// *******
public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {

        for (int i=1;i<=4;i++) {
            for (int j=3;j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<(2*i);k++) {
                if (k==1 || k==(2*i-1) || i==4) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// *******
//  *   *
//   * *
//    * 
public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {

       for(int i=4;i>=1;i--){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<(2*i);k++){
            if(k==1 || k==(2*i-1) || i==4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
       }
    }
}


//    *
//   * *
//  *   *
// *******
//  *   *
//   * *
//    * 
public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {

        for (int i=1;i<=4;i++) {
            for (int j=3;j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<(2*i);k++) {
                if (k==1 || k==(2*i-1) || i==4) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
       for(int i=3;i>=1;i--){
        for(int j=3;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<(2*i);k++){
            if(k==1 || k==(2*i-1) || i==4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
       }
    }
}

// *******
//  *   *
//   * *
//    *
//   * *
//  *   *
// *******
public class Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {

       for(int i=4;i>=1;i--){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<(2*i);k++){
            if(k==1 || k==(2*i-1) || i==4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
       }
       for(int i=2;i<=4;i++){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<(2*i);k++){
            if(k==1 || k==(2*i-1) || i==4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
       }
       
    }
}

//   *
//  * *
// *   *
//*     *
// *   *
//  * *
//   *
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                if(k==1 || k==(2*i-1) || i==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        for(int i=3;i>=1;i--){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(2*i);k++){
                if(k==1 || k==(2*i-1) || i==4){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
        }
    }    
}


//1 
//2 2
//3 3 3
//4 4 4 4

public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }System.out.println();
        }
    }    
}

//1 
//1 2
//1 2 3
//1 2 3 4
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}

//1 2 3 4 
//1 2 3
//1 2
//1
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }    
}

//1 
//2 3
//4 5 6
//7 8 9 10
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {

        int count = 1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }System.out.println();
        }
    }    
}

//    1
//   121
//  12321
// 1234321
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }System.out.println();
        }
    }
}

// 1
// 0 1
// 1 0 1
// 0 1 0 1
public class  Day_16_Star_Pattern_For_Loop {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if((i+j) %2==0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }System.out.println();
        }
    }
}
import java.util.*;
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = obj.nextInt();

        for(int i=1;i<=no;i++){
            for(int j=no;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=no;i>=1;i--){
            for(int j=no;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }System.out.println();
        }
    }
}*/

//1
//01
//101
//0101
public class Day_16_Star_Pattern_For_Loop{
    public static void main(String [] args){
       
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }
}




    