/*public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};

        System.out.println(a); //[[[I@4617c264
        System.out.println(a[0]); //[[I@36baf30c
        System.out.println(a[0][0]); //[I@7a81197d
        System.out.println(a[0][0][0]); //10

        System.out.println(a.length); //1
        System.out.println(a[0].length); //3
        System.out.println(a[0][0].length); //2

        
    }
   
}

//50
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};

        System.out.print(a[0][1][2]+" ");
    }
    
}

//10 20 30 40 50 60 70 80 90
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){

                    System.out.print(a[i][j][k]+" ");
                }
            }
        }
    }
    
}

//10 20 
//30 40 50 60
//70 80 90
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){

                    System.out.print(a[i][j][k]+" ");
                }System.out.println();
            }
        }
    }
    
}

//10 20 0 0 
//30 40 50 60
//70 80 90 0
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = new int[1][3][4];

        a[0][0][0] = 10;
        a[0][0][1] = 20;
        a[0][1][0] = 30;
        a[0][1][1] = 40;
        a[0][1][2] = 50;
        a[0][1][3] = 60;
        a[0][2][0] = 70;
        a[0][2][1] = 80;
        a[0][2][2] = 90;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }System.out.println();
            }
        }
    }
    
}

//10 20 
//30 40 50 60
//70 80 90
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = new int[1][3][4];

        a[0][0][0] = 10;
        a[0][0][1] = 20;
        a[0][1][0] = 30;
        a[0][1][1] = 40;
        a[0][1][2] = 50;
        a[0][1][3] = 60;
        a[0][2][0] = 70;
        a[0][2][1] = 80;
        a[0][2][2] = 90;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    if(a[i][j][k] !=0){
                        System.out.print(a[i][j][k]+" ");
                    }
                }System.out.println();
            }
        }
    }
    
}*/

//10 20 
//30 40 50
//60 70 80
//90 100
public class Day_21_3D_Array {
    public static void main(String[] args) {
        
        int[][][] a = {{{10,20},{30,40,50}},{{60,70,80},{90,100}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }System.out.println();
            }

        }
        
    }
    
}


