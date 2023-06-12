// a peak element is greater than its surronded elements
public class peak_element
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 6, 7, 4};
        int peak = findPeakElement(arr);

        if(peak == -1){
            System.out.println("There is no peak element in the array.");
        }
        else{
            System.out.println("The first peak element in the array is: " + arr[peak]);
        }
    }

    public static int findPeakElement(int[] arr){
        int n = arr.length;
        if(n < 3){
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(mid == 0){
                if(arr[mid] > arr[mid+1]){
                    return mid;
                }
                else{
                    left = mid + 1;
                }
            }
            else if(mid == n-1){
                if(arr[mid] > arr[mid-1]){
                    return mid;
                }
                else{
                    right = mid - 1;
                }
            }
            else{
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }
                else if(arr[mid] < arr[mid-1]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }




}
