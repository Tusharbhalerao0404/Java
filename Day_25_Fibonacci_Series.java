
//0 1 1 2 3 5 8 13 21 34
public class Day_25_Fibonacci_Series {
    public static void main(String[] args) {
        
        int no1=0;
        int no2=1;

        for(int i=1;i<=10;i++){
            System.out.print(no1+" ");
            int no3=no1+no2;
            no1=no2;
            no2=no3;
        }
    }
}
