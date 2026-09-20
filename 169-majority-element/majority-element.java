class Solution {
    public int majorityElement(int[] nums) {
        // solving using moore,s voting algorithim 


        //take ele and count = 0
        int ele = nums[0];
        int count = 0;

        for(int x :nums){

            if(count ==0) ele = x;

            if(ele ==x) count++;
            else count--;
        }

        return ele;
    }
}