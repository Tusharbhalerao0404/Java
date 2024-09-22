public class Day_5_Logical_Operator {
    public static void main(String[] args) {
        
        System.out.println(5>3 && 5>2); //True  (True&&True=True another false)
        System.out.println(5<3 || 5<2); //False (False||False=False another true)
        System.out.println(!(5>3 && 5>2)); //False (not)
    }
    
}
