class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hasDup = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hasDup.contains(nums[i])){
                return true;
            }
            hasDup.add(nums[i]);
        }
    return false;
    }
}