// Time Complexity - O(n²)

public class InsertionSort {
    static void main(String[] args) {
        int arr[] = {5,6,2,3,1,8,4};
        int size = arr.length;

        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.println();
        System.out.println();
        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
