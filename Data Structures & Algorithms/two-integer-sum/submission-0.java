class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Declare hashmap 
        // for every number in nums, calculate the difference
        //if the diffence already exists in the map, return key and the current index
        // else return an empty arrayabstract

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff),i};
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
