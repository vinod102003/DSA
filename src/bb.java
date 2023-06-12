public class bb
{
    public static void main(String[] args) {
        int a[] = {2,1,3};
        int b[] = {7,8,9};
        int f = 0;

        for(int i=0,j=0 ;  i < a.length && j < b.length ; i++,j++)
        {

            if(a[i]+b[j] >= 10)
            {
                f = 1;
                System.out.println("yes");

            }
        }

        if (f == 0)
        {
            System.out.println("no");
        }


    }
}
//   Arrays.sort(arr, new Comparator<Item>() {
//@Override
//public int compare(Item o1, Item o2) {
//
//        double crp1 = Double.valueOf(o1.profit/o1.weight);
//
//        double crp2 = Double.valueOf(o2.profit/o2.weight);
//
//        if(crp1 < crp2)
//        return 1;
//        else
//        return -1;
//        }
//        });
//
//        double totalValue = 0;
//
//        for(Item i : arr)
//        {
//
//        int curWt = i.weight;
//
//        int curProfit = i.profit;
//
//        if(capacity - curWt >=0)
//        {
//        capacity= capacity - curWt;
//
//        totalValue+=curProfit;
//        }
//        else
//        {
//        double fraction = ((double)capacity/(double) curWt);    // 9 / 10
//
//        totalValue += (curProfit*fraction);
//
//        capacity =(int)(capacity-(curWt*fraction));
//        break;
//        }
//        }
//        return totalValue;
//        }