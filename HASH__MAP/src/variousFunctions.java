import java.security.Key;
import java.util.*;


public class variousFunctions
{

    public static  void main(String[] args)
    {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1,"vinod");
        hm.put(2,"messi");
        hm.put(76,"ms");
        hm.put(90,"zaid");

        System.out.println("Hashmap is the given data is:"+hm);

          String res  = hm.get(2);
          System.out.println("the value of the given key is:"+res);


          hm.remove(76);
           System.out.println("updated hashmap is:"+hm);


        System.out.println("checking that the given value is present or not:"+hm.containsKey(76));


//                  Set  s  = hm.entrySet();
//
//                          Iterator  ii  = s.iterator();
//
//                    while(ii.hasNext())
//                    {
//                               Map.Entry e  = (Map.Entry) ii.next();
//
//                        System.out.println(e.getKey()+"->"+e.getValue());
//                    }


                        // iterating using a for loop
                       for(Map.Entry<Integer,String> ee: hm.entrySet())
                       {
                           System.out.println(ee.getKey()+"->"+ee.getValue());
                       }

    }

}
