import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class SynchronizedArray {
    public static void main(String arr[]){
        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("Manoj");
        nameList.add("Santra");
        nameList.add("Pritam");
        synchronized (nameList){
            Iterator<String> iter = nameList.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }
        }
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Manoj");
        empList.add("Santra");
        empList.add("Pritam");
        empList.add("Shayam");
        empList.forEach(self->System.out.println("  "+self));
    }
    
}
