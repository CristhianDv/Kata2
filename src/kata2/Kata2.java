package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        if(!histogram.isEmpty()){
            for (Map.Entry<Integer,Integer> entry : histogram.entrySet()){
                Integer key = entry.getKey();
                System.out.println(key + " ==> " + histogram.get(key));
            }
        }
        
    }
    
}