package com.accenture.tree;
import java.util.*;

public class App 
{
	public static <K, V extends Comparable<V> > Map<K, V> 
    valueSort(final Map<K, V> map) 
    { 
        Comparator<K> valueComparator = new Comparator<K>() { 
        	public int compare(K k1, K k2) 
            	{ 
                	int comp = map.get(k2).compareTo( map.get(k1)); 
                    if (comp == 0) 
                        return 1; 
                    else
                    	return comp; 
                } 
            
             }; 
        
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator); 
        sorted.putAll(map); 
        
        return sorted; 
    } 
    public static void main( String[] args )
    {
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        t.put(1,"Accenture");
        t.put(2,"Dollar");
        t.put(3, "Jar");
        Map sortedMap=valueSort(t);
        Set set=sortedMap.entrySet();
        Iterator i=set.iterator();
        
        while(i.hasNext()) {
            Map.Entry mp = (Map.Entry)i.next(); 
            System.out.print(mp.getKey() + "-"); 
            System.out.println(mp.getValue()); 
        }
    }
}
