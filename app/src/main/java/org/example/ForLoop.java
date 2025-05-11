package org.example;

public class ForLoop {
    
    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums){
            if(num > min){
                min = num;
            }
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }

    public int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums)/nums.length;
    }
}

