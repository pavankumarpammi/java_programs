class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
class Sol{
    public static void main(String args[])
    {
        int arr[]={0,1,0,3,12};
        Solution ob = new Solution();
        ob.moveZeroes(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
