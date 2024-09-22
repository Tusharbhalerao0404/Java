public class Day_6_Associativity_Operator {

    public static void main(String[] args) {
        
        int a = 6*5-34/2; //13 (Precedence)
        // 30-17
        // 13
        System.out.println(a);

        int b = 60/5-34*2; //-56 (Associatyvity)
        // 12-68
        // -56
        System.out.println(b);
    }
    
}

//-7
/*public class Day_6_Associativity_Operator{

    public static void main(String[] args) {
        
        int a = 5;
        int b = 1;
        int c = 4;
        int k = b*b - (4*a*c)/(2*a); 

        System.out.println(k);
    }
}*/
