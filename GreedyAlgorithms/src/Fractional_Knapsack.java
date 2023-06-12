import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;



public class Fractional_Knapsack
{

    public static double getMaxValue(Item arr[] , int capacity)
    {

        // sort in decreasing
        Arrays.sort(arr,(a,b) -> b.profit/b.weight - a.profit/a.weight);


        //Arrays.sort(arr, new Comparator<Item>() {
//    @Override
//    public int compare(Item o1, Item o2) {
//
//        double cp1 = Double.valueOf(o1.profit/o1.weight);
//
//        double cp2 = Double.valueOf(o2.profit/o2.weight);
//
//
//        if(cp1 < cp2)
//
//            return 1;
//
//        else
//
//            return -1;
//
//    }
//});


        int totalProfit=0;

        for(Item i:arr)
        {
            int currWt = i.weight;

            int currProfit = i.profit;

            if(capacity - currWt>=0)
            {
                capacity-=currWt;

                totalProfit+=currProfit;
            }
            else
            {
                double fraction = ((double)capacity/(double) currWt);


                capacity = (int) (capacity - (currWt * fraction));

                totalProfit+= currProfit * fraction;

            }

        }
        return totalProfit;
    }

 static class Item
 {
     int profit;
     int weight;

     Item(int profit , int weight)
     {
         this.profit = profit;
         this.weight=weight;
     }
 }


    public static void main(String[] args) {
        Item []arr = {

                new Item(25,5),
                new Item(75,10),
                new Item(100,12),
                new Item(50,4),
                new Item(45,7),
                new Item(90,9),
                new Item(30,3),
        };

        int capacity = 37;


        double MaxValue = getMaxValue(arr,capacity);

        System.out.println(MaxValue);
    }



}



