/*public class Demo {
    public static void main(String [] args){

      int no1 = 0;
      int no2 = 1;
      
      for(int i=1;i<=10;i++){
        System.out.print(no1+" ");
        int no3 = no1+no2;
        no1=no2;
        no2=no3;
        

      }
    }   
}

public class Demo {
    public static void main(String [] args){

     String name = "Sarpanch";
     String a = "";
     int len = name.length();
     for(int i=len-1;i>=0;i--){
        a=a+name.charAt(i);
     }
     System.out.println(a);
    }   
}

import java.util.*;
public class Demo {
  public static void main(String [] args){

    Scanner obj = new Scanner(System.in);
    System.out.println("Enterv no:");
    String num1 = obj.next();

  //String num1 = "11211";
  String  emp="";
  int len = num1.length();
  for(int i=len-1;i>=0;i--){

      emp = emp+num1.charAt(i);

  } System.out.println(num1);
  if(num1.equals(emp)){
    System.out.println("Polindrome");
  }else{
    System.out.println("Is not polindrome");
  }

  }   
}

import java.util.*;
public class Demo {
  public static void main(String [] args){

    Scanner obj = new Scanner(System.in);
    System.out.println("Enterv no:");
    String num1 = obj.next();

  //String num1 = "11211"; 
  String  emp="";
  int len = num1.length();
  for(int i=len-1;i>=0;i--){

      emp = emp+num1.charAt(i);

  } System.out.println(num1);
  if(num1==emp){
    System.out.println("Palindrome");
  }else{
    System.out.println("Is not palindrome");
  }

  }   
}*/

//How do you calculate number of numerical digits in a string 


public class Demo {
   public static void main(String[] args) {
       
    System.out.println("Tushar Bhalerao");
    System.out.println("Tushar\bBhalerao"); //Backspace remove to 'r'
    System.out.println("Tushar\tBhalerao"); // Tab(Space)
    System.out.println("Tushar\nBhalerao"); //Newline
    System.out.println("Tushar\rBhalerao"); //remove previous character
    

   }
}



