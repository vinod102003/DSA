public class inversionOPIT {


public static int count = 0;
    public static void mergeProcedure(int arr[], int l, int mid, int r) {
        int i, j, k;

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left_subarray[] = new int[n1];
        int right_subarray[] = new int[n2];

        for (i = 0; i < n1; i++) {
            left_subarray[i] = arr[l + i];
        }

        for (j = 0; j < n2; j++) {
            right_subarray[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2)
        {
            if (left_subarray[i] <= right_subarray[j]) {
                arr[k++] = left_subarray[i++];

            }
            else
            {
                arr[k++] = right_subarray[j++];
                count += n1 -i;

            }
        }

        while (i < n1) {
            arr[k++] = left_subarray[i++];

        }

        while (j < n2) {
            arr[k++] = right_subarray[j++];

        }
    }

    public static void mergeSort(int arr[], int l, int r) {






        if (l < r)
        {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);

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
        int arr[] = {70, 50, 60, 10, 20, 30, 80, 15};
        int n = arr.length;

        System.out.println("Array before sorting:");
        printArr(arr, n);

        mergeSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArr(arr, n);

        System.out.println("Number of inversions: " + count);
    }
}



