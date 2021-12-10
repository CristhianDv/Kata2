package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] datos = new int[]{1,2,3,4,5,6,7,7,7,8,8,8,111,1,1};
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < datos.length; i++) {
            if(histogram.containsKey(datos[i])){
                histogram.put(datos[i], histogram.get(datos[i])+1);
            } else {
                histogram.put(datos[i],1);
            }
        }
        
        if(!histogram.isEmpty()){
            for (Map.Entry<Integer,Integer> entry : histogram.entrySet()){
                Integer key = entry.getKey();
                System.out.println(key + " ==> " + histogram.get(key));
            }
        }
        
    }
    
}