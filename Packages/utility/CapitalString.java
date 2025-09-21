package utility;
import java.util.*;

public class CapitalString{    
   
    public String[] Capitalized(String name){
        String[] b = name.split(" "); 
        String x[] = new String[b.length];
        for(int i=0 ;i<b.length;i++){
             x[i] = b[i].substring(0,1).toUpperCase() + b[i].substring(1).toLowerCase();
        }
           return x;     
    }
    
}

