public class OuterInner {
    public OuterInner(){
        System.out.println("this outer inner class");
        

    }
    class Inner{
        public void config(){
            System.out.println("hi this is inner class config");
        }
    }
    public static void main(String a[]){
        OuterInner outer = new OuterInner();
        OuterInner.Inner inner = outer.new Inner();
        inner.config();

    }

    
}
