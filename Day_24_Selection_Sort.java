//WAP 38 52 9 18 6 62 13 find selection sort
//6 9 13 18 38 52 62
public class Day_24_Selection_Sort {
    public static void main(String[] args) {
        
        int[] a = {38,52,9,18,6,62,13};

        int min;
        int temp=0;

        for(int i=0;i<a.length;i++){

            min=i;
            for(int j=i+1;j<a.length;j++){

                if(a[j]<a[min]){

                    min=j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
