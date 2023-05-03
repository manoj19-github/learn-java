enum Laptop{
    Macbook(2000),XPS(3000),Surface(4000),ThinkPad(6000),Tuf;
    private int price;
    private  Laptop(){
        this.price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
}

public class MyEnums {
    
    public static void main(String[] args) {
        Laptop l1 = Laptop.Macbook;
        System.out.println(l1);
    }
    
}
