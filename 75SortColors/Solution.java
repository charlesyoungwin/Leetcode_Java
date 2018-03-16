import java.util.*;

class Solution {
    //Solution1 
    public void sortColors(int[] nums) {
        
        quicksort(nums, 0, nums.length - 1);

    }    

    public void quicksort(int[] nums, int start, int end){
        
        if(start >= end){
            // return nums;
            return ;
        }
        int i = start - 1;
        int pivot = nums[end];
        int j = start;
        for(; j < end; j++){
            if(nums[j] <= pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, j);
        quicksort(nums, start, i);
        quicksort(nums, i + 2, end);
        // return nums;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {0, 0, 1, 2, 0, 2, 1};
        new Solution().sortColors(nums);
        for(int item : nums){
            System.out.println(item);
        }
    }
}
