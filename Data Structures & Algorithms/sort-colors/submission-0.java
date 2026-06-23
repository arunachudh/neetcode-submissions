class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for (int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        int k=0;
        for(int n=0; n<count.length; n++){
            for(int j=0;j<count[n];j++){
                nums[k]=n;
                k++;
            }
        }

    }
}