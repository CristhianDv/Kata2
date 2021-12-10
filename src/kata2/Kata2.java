package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        if(!histogr.isEmpty()){
            for (Map.Entry<Integer,Integer> entry : histogr.entrySet()){
                Integer key = entry.getKey();
                System.out.println(key + " ==> " + histogr.get(key));
            }
        }
        
    }
    
}