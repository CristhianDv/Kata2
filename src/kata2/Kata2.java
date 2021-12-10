package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        String[] data = {"Hola", "Me", "Llamo", "Cristhian"};
        
        Histogram histo = new Histogram(data);
        
        Map<String,Integer> histogr = histo.getHistogram();
        
        if(!histogr.isEmpty()){
            for (Map.Entry<String,Integer> entry : histogr.entrySet()){
                String key = entry.getKey();
                System.out.println(key + " ==> " + histogr.get(key));
            }
        }
        
    }
    
}