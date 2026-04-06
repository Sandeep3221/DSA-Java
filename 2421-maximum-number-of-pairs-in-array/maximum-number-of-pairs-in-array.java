class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num)){
                pairs++;
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return new int[]{pairs,set.size()};
    }
}