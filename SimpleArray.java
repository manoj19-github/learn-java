import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SimpleArray {
    public static void main(String[] args){
        
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=15;
        arr[2]=16;
        arr[3]=17;
        arr[4]=18;
        for(int i=0;i<5;i++){
            System.out.println(" "+arr[i]+"  ");
        }
        ArrayList<Object> ar = new ArrayList<Object>();
        // ar.add("123");
        // ar.add(354);
        // System.out.println(ar);
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        ar1.add(50);
        for(int i=0;i<ar1.size();i++){
            System.out.print("  "+ar1.get(i));
        }
        System.out.println(" ");
        for(Integer data:ar1){
            System.out.print(" "+data);
        }
        System.out.println("xxxxxxxxxxxxxxxx ");
        ar1.stream().forEach(self->System.out.println(self));
        System.out.println("xxxxxxxxxxxxxxxx ");
        Iterator<Integer> it = ar1.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        System.out.println("xxxxxxxxxxxxxxxx ");
        ArrayList<Integer> ar4=new ArrayList<Integer>(Arrays.asList(10,20,40,20,60));
        ar4.stream().forEach(self->System.out.println(self));
        System.out.println("****************************");
        System.out.println(ar4.indexOf(20));
        System.out.println(ar4.lastIndexOf(20));
        ar4.remove(3);
        System.out.println("****************************");                                                                                      
        ar4.stream().forEach(self->System.out.println(self));
    }
}


