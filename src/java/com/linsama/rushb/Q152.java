package com.linsama.rushb;

public class Q152 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minEndingHere = nums[0];
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] > 0){
                maxEndingHere = Math.max(nums[i], maxEndingHere*nums[i]);
                minEndingHere = Math.min(minEndingHere*nums[i], nums[i]);
            }
            else{
                int temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere*nums[i], nums[i]);
                minEndingHere = Math.min(temp*nums[i], nums[i]);
            }
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
