public class Day_7_Increment_Decrement_Operator {

    public static void main(String[] args) {
        
        int i = 7;
        System.out.println(i++); //7 (First print i then increase)
        System.out.println(i); //8

        System.out.println(++i); //8  (First increase i then print)
        System.out.println(i); //8 

        System.out.println(i--); //7 
        System.out.println(i); //6

        System.out.println(--i); //6  
        System.out.println(i); //6 

        char ch = 'c';
        System.out.println(++ch); //d
        System.out.println(--ch); //b

    }
    
}
