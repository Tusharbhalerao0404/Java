public class Day_26_Reverse_String {
    public static void main(String[] args) {
        
        String name = "Tushar";
        int len = name.length();
        String a = "";
        for(int i=len-1;i>=0;i--){
            a=a+name.charAt(i);
        }System.out.println(a);
        
    }
}
