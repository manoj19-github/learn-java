import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayStreams {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,2,4,5,1,2,3,4));
    // Linkhashset 
        LinkedHashSet<Integer>linkedHashSet = new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer>numbersWithDuplicates = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numbersWithDuplicates);
        // JDk.8 --> Streams
        ArrayList<Integer>marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,3,5,4,2,1));
        List<Integer> marksListUnion = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnion);
    }
    
    

    
}

