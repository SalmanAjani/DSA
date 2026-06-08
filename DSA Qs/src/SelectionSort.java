// Time Complexity - O(n²)

public class SelectionSort {
    static void main(String[] args) {
        int nums[] = {5,3,8,2,9,4};
        int size = nums.length;

        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for (int i = 0; i < size-1; i++) {

            int minIndex = i;

            for (int j = i+1; j < size; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        System.out.println();
        System.out.println();
        System.out.println("After sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
