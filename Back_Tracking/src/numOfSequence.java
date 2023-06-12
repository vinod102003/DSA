import java.util.ArrayList;
import java.util.Arrays;

public class numOfSequence
{
        // we take arraylist has the temparr because it is dynamic in nature
    public static void printSequence(int arr[],int index, ArrayList<Integer> tempArr)
    {
        // base case
            if(index == arr.length)
            {
                if(tempArr.size() > 0)
                {
                System.out.println(tempArr);
                }
                return;
            }

        // include
        printSequence(arr,index+1,tempArr);

            tempArr.add(arr[index]);

    // do not include
        printSequence(arr,index+1,tempArr);

        tempArr.remove(tempArr.size()-1);


    }



    public static void main(String[] args)
    {
              int arr1[] = {1,2};

              System.out.println("For the array -"+ Arrays.toString(arr1)); // to print the array

             printSequence(arr1,0,new ArrayList<Integer>());


           int arr2[] = {1,2,3};

           System.out.println("For the array -"+ Arrays.toString(arr2)); // to print the array

        printSequence(arr2 ,0, new ArrayList<Integer>());
    }


}