
//[[I@4617c264
//[I@36baf30c
//10
//3
//4
//Error
/*public class Day_20_2D_array {
    public static void main(String[] args) {
        
        int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
       System.out.println(a); //[[I@4617c264
       System.out.println(a[0]); //[I@36baf30c
       System.out.println(a[0][0]); //10

       System.out.println(a.length); //3
       System.out.println(a[0].length); //4
       //System.out.println(a[0][0].length); //Error
    }
}

public class Day_20_2D_array {
    public static void main(String[] args) {
        
    int[][] a = new int[2][];
    
    System.out.println(a); //[[I@--
    System.out.println(a[0]); //null
    //System.out.println(a[0][0]); //Runtime Exception

    System.out.println(a.length); //2
    //System.out.println(a[0].length); //Error
    
    }
}

//10 20 30 40
//50 60
//70 80 90
public class Day_20_2D_array {
    public static void main(String[] args) {
        
        int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
       
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}

//10 20 10 40 50 60 70 80 90 
public class Day_20_2D_array {
    public static void main(String[] args) {
        int[][] a = {{10,20,10},{40,50},{60,70,80,90}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        
    }    
    
}

//10 20 30 
//40 50 60
public class Day_20_2D_array {
    public static void main(String[] args) {
        
        int[][] a = new int[2][3];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[1][0] = 40;
        a[1][1] = 50;
        a[1][2] = 60;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }

    }    
}

//10 0 0 0 
//20 30 40 0
//50 60 0 0
public class Day_20_2D_array{
    public static void main(String [] arge){

        int[][] a = new int[3][4];

        a[0][0] = 10;
        a[1][0] = 20;
        a[1][1] = 30;
        a[1][2] = 40;
        a[2][0] = 50;
        a[2][1] = 60;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}

//10 
//20 30 40
//50 60
public class Day_20_2D_array{
    public static void main(String [] arge){

        int[][] a = new int[3][4];

        a[0][0] = 10;
        a[1][0] = 20;
        a[1][1] = 30;
        a[1][2] = 40;
        a[2][0] = 50;
        a[2][1] = 60;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] !=0){
                    System.out.print(a[i][j]+" ");
                }
            }System.out.println();
        }
    }
}*/

//10 
//20 30 40
//50 60
public class Day_20_2D_array{
    public static void main(String[] args) {
        
        int[][] a = {{10},{20,30,40},{50,60}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] !=0){
                    System.out.print(a[i][j]+" ");
                }
            }System.out.println();
        }
    }
}





    


    










    


    

