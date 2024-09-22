
public class Day_9_String_Method {
    public static void main(String [] args){

        String name = "Tushar";
        System.out.println(name); //Tushar

        int a = name.length();
        System.out.println(a); //6

        String b = name.toUpperCase();
        System.out.println(b); //TUSHAR

        String c = name.toLowerCase();
        System.out.println(c); //tushar

       System.out.println(name.substring(2)); //shar
       System.out.println(name.substring(1,5)); //usha 
       System.out.println(name.replace('r','p')); //Tushap
       System.out.println(name.startsWith("Tus")); //True
       System.out.println(name.endsWith("Tush")); //False
       System.out.println(name.charAt(2)); //s 
       System.out.println(name.equals("Tushar")); //True
       System.out.println(name.equalsIgnoreCase("TusHAr")); //True (Capital small letter only match string then true print)
       System.out.println(name.indexOf('s')); //2
             
    }
    
}

//
/*public class Day_9_String_Method{

    public static void main(String[] args) {
        
        String name = "Tusshsshr";
        //System.out.println(name.indexOf("ssh")); //2
        //System.out.println(name.indexOf("ssh",4)); //5
        System.out.println(name.lastIndexOf("ssh",4)); //2

    }
} 

//      Tushar     
//Tushar
public class Day_9_String_Method{
    public static void main(String [] aegs){

        String obj = "      Tushar     ";
        System.out.println(obj);
        System.out.println(obj.trim());

    }
}*/



