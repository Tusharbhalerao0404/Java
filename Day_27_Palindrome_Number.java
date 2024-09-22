public class Day_27_Palindrome_Number {
    public static void main(String[] args) {
        
        String no1="11211";
        String no2="";
        int len= no1.length();

        for(int i=len-1;i>=0;i--){
            no2=no2+no1.charAt(i);
        }System.out.println(no2);

        //if(no1==no2)
        if(no1.equals(no2)){ 
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }
}
