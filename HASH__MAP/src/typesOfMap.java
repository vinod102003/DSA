import java.util.*;
public class typesOfMap
{
public static void main(String[] args)
{

   // order of insertion is not maintained
    HashMap<Integer,String> map = new HashMap<>();

        map.put(4,"vinod");
        map.put(2,"fing");
        map.put(9,"azooz");
        map.put(1,"aminjaz");
      System.out.println("HashMap output is:"+map);

// order of insertion is preserved
      LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
    map1.put(4,"vinod");
    map1.put(2,"fing");
    map1.put(9,"azooz");
    map1.put(1,"aminjaz");
    System.out.println("LinkedHashMap output is:"+map1);


// sorts the data on basis of keys
    TreeMap<Integer,String> map2 = new TreeMap<>();
    map2.put(4,"vinod");
    map2.put(2,"fing");
    map2.put(9,"azooz");
    map2.put(1,"aminjaz");
    map2.put(10,"messi");
    map2.put(5,"sudarshan");
    System.out.println("TreeMap output is:"+map2);




}

}
