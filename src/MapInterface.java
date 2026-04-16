import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        //  Map<String, Integer> map = new Hashtable<>(); // This was the synchronized version
        map.put("A", 11);
        map.put("B", 19);
        map.put("C", 21);
        map.put("A", 119); // Here A value will be updated because of put method

        // Here Keys are set and values are list because of uniqueness and non - uniqueness functionality
        System.out.println(map.keySet());

        Collection<String> Keys = map.keySet();

        for(String key : Keys){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
