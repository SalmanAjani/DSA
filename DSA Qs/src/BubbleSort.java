// Time Complexity - O(n²)

public class BubbleSort {
    static void main(String[] args) {
        int nums[] = {5,3,8,2,9,4};
        int size = nums.length;
        int target = 0;

        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    target = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = target;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("After sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
