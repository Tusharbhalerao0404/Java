//sum:60
/*public class Day_22_Anonymous_Array {
    public static void main(String[] args) {
        
        Day_22_Anonymous_Array.sum(new int[]{10,20,30});
        
    }
    static void sum(int[] no)
    {
        int total=0;
        for(int i:no)
        {
            total=total+i;
        }
        System.out.println("sum:"+total);
    }
    
}*/

//sum:150
public class Day_22_Anonymous_Array {
    public static void main(String[] args) {
        
        Day_22_Anonymous_Array.sum(new int[][]{{10,20,30},{40,50}});
        
    }
    static void sum(int[][] no)
    {
        int total=0;
        for(int ii[]:no)
        {
            for(int i:ii)
            {
                total=total+i;
            }
        }
        System.out.println("sum:"+total);
    }
    
}
