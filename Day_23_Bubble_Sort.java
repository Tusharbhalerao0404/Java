//WAP 36 19 29 12 5 Bubble sort
//5 12 19 29 36
public class Day_23_Bubble_Sort {
    public static void main(String[] args) {
        
        int[] a={36,19,29,12,5};

        int temp;
       for(int i=0;i<a.length;i++){

            for(int  j=0;j<a.length-1;j++){

                if(a[j]>a[j+1]){

                    temp = a[i];
                    a[i] = a[j+1];
                    a[j+1] = temp;
                }

            }
       }
       for(int i=0;i<a.length;i++){
        
        System.out.print(a[i]+" ");
       }
    }
}

