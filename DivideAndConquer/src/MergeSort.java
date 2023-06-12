import java.util.Arrays;

public class MergeSort {
    public static void mergeProcedure(int arr[], int l, int mid, int r)
    {
        int i, j, k;



        int left_subarray[] = Arrays.copyOfRange(arr,l,mid+1);

        int right_subarray[] = Arrays.copyOfRange(arr,mid+1,r+1);

        i = 0;
        j = 0;
        k = l;

        while (i <left_subarray.length  && j <right_subarray.length)
        {
            if (left_subarray[i] <= right_subarray[j])
            {

                arr[k] = left_subarray[i];
                i++;
            }
            else
            {
                arr[k] = right_subarray[j];
                j++;

            }
            k++;
        }

        while (i < left_subarray.length)
        {
            arr[k] = left_subarray[i];
            i++;
            k++;

        }

        while (j < right_subarray.length)
        {
            arr[k] = right_subarray[j];
            j++;
            k++;

        }
    }

    public static void mergeSort(int arr[], int l, int r) {



        if (l < r)
        {
            int mid = l + (r - l) / 2;

            // left array
            mergeSort(arr, l, mid);

            // right syb array
            mergeSort(arr, mid + 1, r);

            mergeProcedure(arr, l, mid, r);
        }


    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {70,50,60,10,20,30,80,15 };
        int n = arr.length;

        System.out.println("Array before sorting:");
        printArr(arr, n);

        mergeSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArr(arr, n);
    }
}

