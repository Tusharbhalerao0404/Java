//Compile and run
/*public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int [] a = new int[0];
       
    }
    
}

//Error
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int [] a = new int[-3];
    }
}

//10 20 30 
public class Day_19_1_Dimentional_Array{
    public static void main(String[] args) {
        
        int[] a = {10,20,30};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

//10 20 30 
//10 20 30
//10 20 30
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int [] a = {10,20,30};

        for(int i=0;i<=2;i++){
            System.out.print(a[i]+" ");
        }System.out.println();

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println();

        for(int i:a){
            System.out.print(i+" ");
        }
       
    }
    
}


//70 80 40 
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int[] marks  = new int[3];
        marks[0]  = 70;
        marks[1]  = 80;
        marks[2]  = 40;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i=0;i<3;i++){
            System.out.print(marks[i]+" ");
        }
    }
}

//70 80 90 
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int[] marks  = {70,80,90};
        for(int i=0;i<3;i++){
            System.out.print(marks[i]+" ");
        }
    }
}


//How do you find the sum of all elements in an array?
//41
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
        int[] no = {11,10,20};
        int sum=0;

        for(int i=0;i<no.length;i++){
            sum += no[i];
        }System.out.println(sum);
    }
}*/

//How do you find the largest element in an array?
public class Day_19_1_Dimentional_Array {
    public static void main(String[] args) {
        
       int[] no = {1,4,30,22,50};
       int largest = no[0];
       
       for(int i=1;i<=no.length;i++){
        if(no[i]>largest){
            largest = no[i];
        }
            
            
        }System.out.println(largest);
    }
}
