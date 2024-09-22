/*
class Cars {
    String color = "Red";
    String color1 = "Blue";
}

public class A_Class_Object_1{
    public static void main(String[] args) {
        Cars car1 = new Cars();
        System.out.println(car1.color);
    }
}*/
class  pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }
}

public class OOP{
    public static void main(String [] args){

        pen a= new pen();
        a.color = "red";
        a.type= " jel";


        a.write();
    }
}