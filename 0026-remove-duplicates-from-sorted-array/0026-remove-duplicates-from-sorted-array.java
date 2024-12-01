class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums == null){
            System.out.println("no results found");
            return 0;
        }
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[count]){
                count++;
                nums[count]=nums[i];
            }
            
        }
        return count+1;
        
    }
}