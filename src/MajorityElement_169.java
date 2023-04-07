/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n / 2] times.
You may assume that the majority element always exists in the array.

 */

import java.util.Arrays;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  // sort first, then half or more element will be grouped together. (n, n+1, ...)
        int count = 1;
        for (int i=0; i<nums.length; i++){
            if(count > (nums.length/2)){    // if counted number is more than half, that's it!
                return nums[i];
            }
            if(nums[i] == nums[i+1]){   // if there's one more element next to it, count + 1
                count++;
            }
        }
        return 0;
    }
}
