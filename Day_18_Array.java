/*3 types print

1  int [] marks; //Declaration
   marks = new int[]; //Memory Allocation 

2  int [] marks = new int[]; //Declaration + Memory Allocation 


3  int [] marks = {1,2,3,4,5}; // Declar + Initialize */

//80
/*public class Day_18_Array {
    public static void main(String[] args) {
        int [] marks;
        marks = new int[5];
    
        marks[0] = 99;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;

        System.out.println(marks[2]);
    }
}

//20
public class Day_18_Array{
    public static void main(String[] args) {
        
        int [] marks = {10,20,30,40,50};
        System.out.println(marks[1]);
    }
}

//5
public class Day_18_Array{
    public static void main(String[] args) {
        
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);
    }
}

//10.3
public class Day_18_Array{
    public static void main(String[] args) {
        
        float [] marks = {10.3f, 20.5f, 30.0f};
        System.out.println(marks[0]);
    }
}

//11 66 22 43 33 31 (Original)
//31 33 43 22 66 11 (Reverse)
//11 66 22 43 33 31 
public class Day_18_Array {
    public static void main(String[] args) {
        
        int[] marks = {11, 66, 22, 43, 33, 31};  // Array initialization

        for (int i = 0; i < marks.length; i++) { //Original
            System.out.print(marks[i] + " ");
        } System.out.println();  // Move to the next line
       
        for (int i = marks.length - 1; i >= 0; i--) { //reverse order
            System.out.print(marks[i]+" ");
        }System.out.println();
        
        for(int element: marks){
            System.out.print(element+" ");
        }
    }
}*/

//101 102 103 
//201 202 203
public class Day_18_Array {
    public static void main(String [] args){

        int[][] flats;
        flats = new int [2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0;i<flats.length;i++){
           for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]+" ");
           }System.out.println();
        }
    }
}
