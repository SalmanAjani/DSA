/** Time Complexity:-
 Best case - O(n log n) (Happens when the pivot always splits the array into two nearly equal halves)
 Worst case - O(n²) (Happens when the pivot is the smallest or the largest element in the array)
 */

public class QuickSort {
    static void main(String[] args) {

        int arr[] = {5,3,8,2,9,4};

        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println();
        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){

        if(low < high){

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {

            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
