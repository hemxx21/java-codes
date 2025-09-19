class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=nums[i];
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                if(sum==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
