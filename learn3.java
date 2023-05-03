class First{
    public int marks;
    public First(){
        this.marks=10;
        System.out.println("hi my self manoj");
    }
    public First(int marks){
        this.marks = marks;
        System.out.println("second first constructor called");
    }
}
class Second extends First{
    int sports;
    public Second(){
        this.sports = 20;
        System.out.println("this is second class");
    }
    public Second(int sports){
        this.sports=  sports;
        System.out.println("this is second class second constructor");
    }
}

public class learn3 {
    public static void main(String a[]){
        String s1 = "Manoj santra";
        StringBuffer s2= new StringBuffer("Hello Manoj Santra, Javascript Developer");
        System.out.println(s2);
        System.out.println(s2.capacity());
        Second sd =new Second(45);
    }
    
}
