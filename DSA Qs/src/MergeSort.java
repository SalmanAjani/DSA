/** Time complexity - Best/Average/Worst case : O(n log n)
 * Space complexity - Extra memory required of size O(n)
 */

public class MergeSort {
    static void main(String[] args) {
        int arr[] = {3,5,1,4,6,2};

        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println();
        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if(left < right){

            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);

        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int size1 = mid - left + 1; // mid represents index, not size
        int size2 = right - mid;

        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];

        for (int x = 0; x < size1; x++) {
            leftArr[x] = arr[left+x];
        }

        for (int x = 0; x < size2; x++) {
            rightArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i<size1 && j<size2){

            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // For remaining elements in each subarray :-
        while(i<size1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<size2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }
}
